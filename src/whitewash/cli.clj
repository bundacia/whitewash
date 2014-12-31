(ns whitewash.callable_actions)
  (require 'whitewash.core)
  (def wash   whitewash.core/wash)
  (def unwash whitewash.core/unwash)

(ns whitewash.cli
  (:gen-class))

(defn get_function [name]
  (ns-resolve 'whitewash.callable_actions (symbol name)))

(defn run
  [action_name & args]
  (let [action (get_function action_name)
        input  (if (empty? args) (slurp *in*) (first args))]
    (action input)))

(defn -main
  [& args]
    (println (apply run args)))
