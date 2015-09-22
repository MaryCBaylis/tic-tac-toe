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
  (println board)
  (doseq [row board] (doseq [tile (val row)] (print (val tile) " ")) (println))
  (println (seq board))
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Welcome to Tic-Tac-Toe!")
  (def board (create-board))
  (display-board board)
)

