(ns tic-tac-toe.core-test
  (:require [clojure.test :refer :all]
            [tic-tac-toe.core :refer :all]))

; (deftest a-test
;   (testing "FIXME, I fail."
;     (is (= 0 1))))


(deftest create-empty-board
  (testing "Creates an empty board"
    (is (= (create-board) {"a" {"1" nil "2" nil "3" nil} "b" {"1" nil "2" nil "3" nil} "c" {"1" nil "2" nil "3" nil}}))
  )
)

