(ns tic-tac-toe.core-test
  (:require [clojure.test :refer :all]
            [tic-tac-toe.core :refer :all]))

;Example test
; (deftest a-test
;   (testing "FIXME, I fail."
;     (is (= 0 1))))


(deftest test-create-board
  (testing "Creates an empty board"
    (is (= (create-board) {"A" {"1" " " "2" " " "3" " "} "B" {"1" " " "2" " " "3" " "} "C" {"1" " " "2" " " "3" " "}}))
  )
)

;; My display-board function returns nil.  Try to find a way to test a display?
; (deftest test-display-board
;   (testing "Displays board in proper format"
;     (is (= (display-board (create-board)) "      

;             ")
;     )
;   )
; )

(deftest test-play-again
  (testing "Returns true if an affirmative is given"
    (is (= true (play-again? "y")))
  )
  (testing "Returns false if a negative is given"
    (is (= false (play-again? "n")))
  )
)

(deftest test-legal-move
  (def board {"A" {"1" "X" "2" " " "3" " "} "B" {"1" " " "2" " " "3" " "} "C" {"1" " " "2" " " "3" " "}})
  (testing "Returns false if row doesn't exist"
    (is (= false (legal-move? board "d1")))
  )
  (testing "Returns false if column doesn't exist"
    (is (= false (legal-move? board "a5")))
  )
  (testing "Returns false if square is already occupied"
    (is (= false (legal-move? board "a1")))
  )
)

(deftest test-update-board
  (testing "Returns correct board for X")
  (testing "Returns correct board for Y")
  (testing "Returns nil if ")
)
