(ns fourclojure.26
  (:require [clojure.core :refer :all]))

(defn fibonacci [size]
  (loop [result [0 1]]
    (let [length (count result)]
      (if (<= length size)
        (let [before   (nth result (- length 2))
              last-one (last result)]
          (recur (conj result (+ last-one before))))
        (rest result)))))

(= (fibonacci 3) '(1 1 2))

(= (fibonacci 6) '(1 1 2 3 5 8))

(= (fibonacci 8) '(1 1 2 3 5 8 13 21))