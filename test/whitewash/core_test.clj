(ns whitewash.core-test
  (:require [clojure.test :refer :all]
            [whitewash.core :refer :all]))

(deftest washing
  (testing "wash and unwash are symetric"
    (is (= (unwash (wash "test string")) "test string")))
  (testing "wash returns a whitespace only string"
    (is (not (re-find #"\S" (wash "test string"))))))
