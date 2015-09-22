(ns tic-tac-toe.core
  (:gen-class))

(defn create-board
  []
  {
    "a" {"1" nil "2" nil "3" nil}
    "b" {"1" nil "2" nil "3" nil}
    "c" {"1" nil "2" nil "3" nil}
  }
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Welcome to Tic-Tac-Toe!")
  (def board (create-board)))

