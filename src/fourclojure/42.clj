(ns fourclojure.42)

(defn factorial [n]
  (->> (+ n 1)
       (range 1)
       (reduce *)))

(= (factorial 1) 1)
(= (factorial 3) 6)
(= (factorial 5) 120)
(= (factorial 8) 40320)
