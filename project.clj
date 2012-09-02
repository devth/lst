(defproject lst "0.1.0-SNAPSHOT"
            :description "lst :: a list-building tool"
            :dependencies [[org.clojure/clojure "1.4.0"]
                           [noir "1.3.0-beta3"]
                           [korma "0.3.0-beta7"]
                           [clj-http "0.5.3"]
                           [postgresql "9.0-801.jdbc4"]]
            :main lst.server)

