(defproject myproject "0.1.0-SNAPSHOT"
  :description "Example on clj->java->clj compilation"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/clj"]
  :java-source-paths ["src/java"]
  :prep-tasks [["compile" "myproject.records"]
               "javac" "compile"]
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:uberjar {:aot :all}}
  :main myproject.main)
