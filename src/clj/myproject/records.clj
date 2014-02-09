(ns myproject.records
  (:import (clojure.lang Keyword)))

(defrecord Item [^Keyword type ^String value])
