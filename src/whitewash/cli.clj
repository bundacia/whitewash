(ns whitewash.callable_actions)
  (require 'whitewash.core)
  (def wash   whitewash.core/wash)
  (def unwash whitewash.core/unwash)

(ns whitewash.cli
  (:gen-class))

(defn get_function [name]
  (let [function (ns-resolve 'whitewash.callable_actions (symbol name))]
    (fn [args] (apply function args))))

(defn -main
  [action_name & input]
  (let [action (get_function action_name)]
    (println (action input))))
