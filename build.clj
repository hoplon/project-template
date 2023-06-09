(ns build
  (:refer-clojure :exclude [test])
  (:require
    [clojure.tools.build.api :as b]))

(defn test
  "Run all the tests."
  [opts]
  (let [basis (b/create-basis {:aliases [:test]})
        cmds (b/java-command
               {:basis     basis
                :main      'clojure.main
                :main-args ["-m" "cognitect.test-runner"]})
        {:keys [exit]} (b/process cmds)]
    (when-not (zero? exit) (throw (ex-info "Tests failed" {})))
    opts))
