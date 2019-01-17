object UsingTailRecursion {
  var turns = List[mylist]() // So here I have defined the list for turns which equals how many go's you have taken
  def bowl(skittles: Int) { //I'm defining a bowl giving the skittles an integer type and an IF statment so I can say how many i bowled down
    if (turns.size >(0) ) { // So we can check how many turns we have taken, and if we have taken a turn then -
      turns.last.bowl2 = skittles //- we take the value of the variable defined below called bowl2 i.e our second bowl and we assign the skittle value
    } else {
      turns = turns // otherwise turns will equal the first bowl
    }
  }

  def score: Int = { //defining scores as integer type
    def totScore(turnsLeft: List[mylist], total: Int): Int = { //we will now add the list of scores and total
      var tempTotalScore = turnsLeft.head.total //total the amounts in the list
      if (turnsLeft.head.total == 10 && turns.size > 10) { //if bowl1 and bowl2 totals 10 and you have had 10 turns i.e you knock down all 10 skittles
        tempTotalScore += turnsLeft(1).bowl1 //adds the variable on the right to the one on the left to add the i think this doesnt work for spare have to test
        if (turnsLeft.head.strike) { //if its a strike i will define a strike below - and if the last go then we add the skittle value of bowl2 to the tempTotalScore
          if (!turnsLeft(1).strike) tempTotalScore += turnsLeft(1).bowl2
          else tempTotalScore += turnsLeft(2).bowl1 // else temp total score is equal to previous 2 turns left bowl1 value
        }
      }

      //another if - tail part rather than head.
      if (!turnsLeft.tail.isEmpty && (turns.size - turnsLeft.tail.size) < 10) totScore(turnsLeft.tail, total + tempTotalScore)
      else total + tempTotalScore
    }
    totScore(turns, 0)
  }

  case class mylist(bowl1: Int, var bowl2: Int = 0) {
    def strike = bowl1 == 10
    def spare :Boolean = bowl1 + bowl2 ==10
    var turnFinished: Boolean = false
    if (strike) turnFinished = true //handler for id bowl one is 10 i.e a strike then turn is finished rather than allowing a bowl2
    if (spare) turnFinished = true //FML alex i am going crazy here i don't know if this is even right now.
    def total = bowl1 + bowl2 //Defined the total here
  }
}
