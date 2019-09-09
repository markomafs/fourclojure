(ns fourclojure.107 )

(defn closure [x]
  (fn [n]
    (reduce * (repeat x n))))

(= 256 ((closure 2) 16), ((closure 8) 2) ((closure 4) 4))
(= [1 8 27 64] (map (closure 3) [1 2 3 4]))
(= [1 2 4 8 16] (map #((closure %) 2) [0 1 2 3 4]))
(= [1 2 4 8 16] (map #((closure %) 2) [0 1 2 3 4]))
