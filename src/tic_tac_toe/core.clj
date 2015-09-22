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
  (doseq [row board] 
    (print (key row) " ") 
    (doseq [tile (val row)] 
      (print (val tile) " ")
    ) 
    (println)
  )
)

(defn play-again?
  [input]
  (case (clojure.string/lower-case input)
    "y" true
    "yes" true
    "yep" true
    "n" false
    "no" false
    "nope" false
  )
)

(defn -main
  "I play tic-tac-toe!"
  [& args]
  (println "Welcome to Tic-Tac-Toe!")
  (println "Shall we play a game?  (Y)es/(N)o?")

  (def input (str (read-line)))
  (if (play-again? input)
    ;;start the game loop!
    (println "I've started a game")
  )
  (println "See you next time!")
  (def board (create-board))
  (display-board board)
)

