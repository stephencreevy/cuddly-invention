/*object BowlingApp2 extends App{


  //Frame 1, ball 1: 10 pins (strike)
  //Frame 2, ball 1: 3 pins
  //Bowling Rules taken from wikipedia here for reference
  //Frame 2, ball 2: 6 pins
  //The total score from these throws is:
  //Frame one: 10 + (3 + 6) = 19
  //Frame two: 3 + 6 = 9
  //TOTAL = 28

  //Frame 1, ball 1: 7 pins
  //Frame 1, ball 2: 3 pins (spare)
  //Frame 2, ball 1: 4 pins
  //Frame 2, ball 2: 2 pins
  //The total score from these throws is:
  //Frame one: 7 + 3 + 4 (bonus) = 14
  //Frame two: 4 + 2 = 6
  //TOTAL = 20

  var turns = List[games]()
  def bowl(skittles: Int) {
    if (turns.size > 0 && !turns.last.turnFinished) {
      turns.last.bowl2 = skittles
      turns.last.turnFinished = true
    } else {
      turns = turns :+ games(skittles)
    }
  }

  def score: Int = {
    def sumScore(turnsLeft: List[games], total: Int): Int = {
      var tempTotal = turnsLeft.head.sum
      if (turnsLeft.tail != Nil && turnsLeft.head.sum == 10) {
        tempTotal += turnsLeft(1).bowl1
        if (turnsLeft.head.strike) {
          if (!turnsLeft(1).strike) tempTotal += turnsLeft(1).bowl2
          else tempTotal += turnsLeft(2).bowl1
        }
      }
      if (!turnsLeft.tail.isEmpty && (turns.size - turnsLeft.tail.size) < 10) sumScore(turnsLeft.tail, total + tempTotal)
      else total + tempTotal
    }
    sumScore(turns, 0)
    }

    case class games(bowl1: Int, var bowl2: Int = 0) {
      def strike = bowl1 == 10
      def spare :Boolean = bowl1 + bowl2 == 10
      var turnFinished: Boolean = false
      if (strike) turnFinished = true
      if (spare) turnFinished = true //neeed to define a rule for the scoring
      def sum = bowl1 + bowl2
    }




}
*/