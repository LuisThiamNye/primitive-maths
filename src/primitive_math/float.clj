(ns primitive-math.float
  (:refer-clojure
   :exclude [* + - / < > <= >= == rem bit-or bit-and bit-xor bit-not bit-shift-left bit-shift-right unsigned-bit-shift-right byte short int float long double inc dec zero? min max true? false?])
  (:require
   [primitive-math.typed :refer [gen-ops]]))

(gen-ops "Float" false)
