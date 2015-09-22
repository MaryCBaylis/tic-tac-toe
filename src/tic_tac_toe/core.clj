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

(defn player-turn
  [board]
)

(defn game-loop
  [board]
  (display-board board)

  ;;Player takes turn first
  ;;Perform checks
  ;;Comp takes turn
  ;;Perform checks

  ;;End of game, ask to play again

  (println "Play again?")
  (def input (str (read-line)))
  (if (play-again? input)
    (recur (create-board))
  )
)

(defn start-game
  []
  (println "Let's play!")
  (game-loop (create-board))
)

(defn -main
  "I play tic-tac-toe!"
  [& args]
  (println "Welcome to Tic-Tac-Toe!")
  (println "Shall we play a game?  (Y)es/(N)o?")

  (def input (str (read-line)))
  (if (play-again? input)
    (start-game)
    (println "Why'd you even?.....")
  )
  (println "See you next time!")
)

