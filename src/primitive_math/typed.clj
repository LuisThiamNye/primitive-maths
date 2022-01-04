(ns primitive-math.typed
  (:import
   (primitive_math.typed DoubleOps LongOps IntOps FloatOps)))

(defmacro -fn-sym->op [type-name sym]
  `(symbol (str "primitive_math.typed." ~type-name "Ops") (str ~sym)))

(defmacro -gen-variadics
  "Creates left-associative variadic forms for any operator. Or
   Turns variadic predicates into multiple pair-wise comparisons."
  [ctx mode & arg-exprs]
  `(do
     ~@(for [[fn-sym' method-sym' ?doc ?single-arg-form] arg-exprs]
         (let [fn-sym (name fn-sym')
               method-sym (name method-sym')
               x-sym (gensym "x")
               doc (or ?doc (str "A primitive macro version of `" fn-sym "`"))
               single-arg-form (or ?single-arg-form
                                   (if (= :pred mode)
                                     (constantly true)
                                     identity))]
           (when ((:has-fn? ctx) fn-sym)
             `(defmacro ~(symbol (str fn-sym))
                ~doc
                ([~x-sym]
                 ~((eval single-arg-form) x-sym))
                ([x# y#]
                 (list '~(-fn-sym->op (:type-name ctx) method-sym) x# y#))
                ~(if (= :pred mode)
                   `([x# y# ~'& rest#]
                     (list 'primitive_math.Primitives/and
                           (list '~fn-sym x# y#) (list* '~fn-sym y# rest#)))
                   `([x# y# ~'& rest#]
                     (list* '~fn-sym (list '~fn-sym x# y#) rest#)))))))))

(defmacro gen-ops [type-name bitwise?]
  (let [ctx {:type-name type-name
             :has-fn? (if bitwise?
                        (fn [_] true)
                        #(not (re-matches #"bit.+" (str %))))}]
    `(do
       (refer-clojure :exclude '~(quote [* + - / < > <= >= == rem bit-or bit-and bit-xor bit-not bit-shift-left bit-shift-right unsigned-bit-shift-right byte short int float long double inc dec zero? min max true? false?]))
       (-gen-variadics
        ~ctx
        nil
        [+            add]
        [-            subtract "A primitive macro version of `-`" (fn [x#] `(list 'primitive_math.Primitives/negate ~x#))]
        [*            multiply]
        [/            divide]
        [div          divide]
        [bit-and      bitAnd]
        [bit-or       bitOr]
        [bit-xor      bitXor]
        [min          min]
        [max          max])
       (-gen-variadics
        ~ctx
        :pred
        [>  gt]
        [<  lt]
        [<= lte]
        [>= gte]
        [== eq]))))
