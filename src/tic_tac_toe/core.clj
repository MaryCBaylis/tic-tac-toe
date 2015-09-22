(ns tic-tac-toe.core
  (:gen-class))

(defn create-board
  []
  {
    "A" {"1" " " "2" " " "3" " "}
    "B" {"1" " " "2" " " "3" " "}
    "C" {"1" " " "2" " " "3" " "}
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
  (println "Gimme your best shot!")
  (println "Enter the letter and number of the square you want to mark.  Eg: A1")
  (def player-move (str (read-line)))
)

(defn game-loop
  [board]
  (display-board board)

  ;;Player takes turn first
  (player-turn board)
  ;;Perform checks
  ;;Comp takes turn
  ;;Perform checks

  ;;End of game, ask to play again

  (println "Play again?")
  (if (play-again? (str (read-line)))
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

  (if (play-again? (str (read-line)))
    (game-loop (create-board))
    (println "Why'd you even?.....")
  )
  (println "See you next time!")
)

