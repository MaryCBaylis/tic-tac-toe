(ns tic-tac-toe.core-test
  (:require [clojure.test :refer :all]
            [tic-tac-toe.core :refer :all]))

;Example test
; (deftest a-test
;   (testing "FIXME, I fail."
;     (is (= 0 1))))


(deftest test-create-board
  (testing "Creates an empty board"
    (is (= (create-board) {"a" {"1" " " "2" " " "3" " "} "b" {"1" " " "2" " " "3" " "} "c" {"1" " " "2" " " "3" " "}}))
  )
)

; My display-board function returns nil.  Try to find a way to test a display?
; (deftest test-display-board
;   (testing "Displays board in proper format"
;     (is (= (display-board (create-board)) "      

;             ")
;     )
;   )
; )

(deftest test-play-again-affirm
  (testing "Returns true if an affirmative is given"
    (is (= true (play-again? "y")))
  )
)

(deftest test-play-again-neg
  (testing "Returns false if a negative is given"
    (is (= false (play-again? "n")))
  )
)
