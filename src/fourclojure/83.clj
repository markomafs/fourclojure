(ns fourclojure.83)

(defn half-truth [& args]
  (and (boolean (some true? args))
       (not-every? true? args)))

(= false (half-truth false false))
(= true (half-truth true false))
(= false (half-truth true))
(= true (half-truth false true false))
(= false (half-truth true true true))
(= true (half-truth true true true false))
