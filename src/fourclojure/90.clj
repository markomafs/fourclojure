(ns fourclojure.90 )

(defn prod-cartesian [a b]
  (->> (for [item-a a
             item-b b]
         [item-a item-b])
       (into #{})))

(= (prod-cartesian #{"ace" "king" "queen"} #{"♠" "♥" "♦" "♣"})
   #{["ace"   "♠"] ["ace"   "♥"] ["ace"   "♦"] ["ace"   "♣"]
     ["king"  "♠"] ["king"  "♥"] ["king"  "♦"] ["king"  "♣"]
     ["queen" "♠"] ["queen" "♥"] ["queen" "♦"] ["queen" "♣"]})
(= (prod-cartesian #{1 2 3} #{4 5})
   #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]})
(= 300 (count (prod-cartesian (into #{} (range 10))
                  (into #{} (range 30)))))
