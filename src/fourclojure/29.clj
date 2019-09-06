(ns fourclojure.29
  (:require [clojure.core :refer :all]
            [clojure.string :as string]))

(defn get-the-caps [string-test]
  (->> string-test
       (filter #(not= (str %) (string/lower-case %)))
       string/join))

(= (get-the-caps "HeLlO, WoRlD!") "HLOWRD")
(empty? (get-the-caps "nothing"))
(= (get-the-caps "$#A(*&987Zf") "AZ")
