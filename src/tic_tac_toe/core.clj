(ns tic-tac-toe.core
  (:gen-class))

(defn create-board
  []
  {
    "a" {"1" " " "2" " " "3" " "}
    "b" {"1" " " "2" " " "3" " "}
    "c" {"1" " " "2" " " "3" " "}
  }
)

(defn display-board
  [board]
  (println "   1  2  3")
  (doseq [row board] (print (key row) " ") (doseq [tile (val row)] (print (val tile) " ")) (println))
)

(defn -main
  "I play tic-tac-toe!"
  [& args]
  (println "Welcome to Tic-Tac-Toe!")
  (def board (create-board))
  (display-board board)
)

