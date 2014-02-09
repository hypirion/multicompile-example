(ns myproject.main
  (:require [clojure.pprint :as pp])
  (:import myproject.Lexer)
  (:gen-class))

(defn -main [& args]
  (pp/pprint (iterator-seq (Lexer. 5))))
