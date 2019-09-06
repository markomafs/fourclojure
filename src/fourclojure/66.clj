(ns fourclojure.66 )

(defn gcd [x y]
  (if (zero? y)
    x
    (recur y (mod x y))))

(= (gcd 2 4) 2)
(= (gcd 10 5) 5)
(= (gcd 5 7) 1)
(= (gcd 1023 858) 33)
(= (gcd 858 1023) 33)

