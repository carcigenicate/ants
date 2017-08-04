(defproject ants "1"

  :dependencies [[org.clojure/clojure "1.8.0"]]

  :main ants.main

  :target-path "target/%s"

  :profiles {:uberjar {:aot :all}})
