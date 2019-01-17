
//Scrapping this


object FreshEyesBowling {

  object howmanyturns {
    var turns = List[mylist]() // So here I have defined the list for turns which equals how many go's you have taken
    def bowl(skittles: Int) { //I'm defining a bowl giving the skittles an integer type and an IF statment so I can say how many i bowled down
      if (turns.size >(0) ) { // So we can check how many turns we have taken, and if we have taken a turn then -
        turns.last = skittles //- we take the value of the variable defined below called bowl2 i.e our second bowl and we assign the skittle value
      } else {
        turns = turns // otherwise turns will equal the first bowl
      }
    }

    def score: Int = { //defining scores as integer type
      def totScore(turnsLeft: List[mylist], total: Int): Int = { //we will now add the list of scores and total
        var tempTotalScore = turnsLeft.head.total //total the amounts in the list
      }

    }

    case class mylist(bowl1: Int, bowl2: Int, bowl3: Int, bowl4: Int, bowl5: Int, bowl6: Int, bowl7: Int, bowl8: Int, bowl9: Int, bowl10: Int) {
      def strike = bowl1 == 10
      def strike1 = bowl2 == 10
      def strike2 = bowl3 == 10
      def strike3 = bowl4 == 10
      def strike4 = bowl5 == 10
      def strike5 = bowl6 == 10
      def strike6 = bowl7 == 10
      def strike7 = bowl8 == 10
      def strike8 = bowl9 == 10
      def strike9 = bowl10 == 10
      var turnFinished: Boolean = false
      if (strike) turnFinished = true //handler for id bowl one is 10 i.e a strike then turn is finished rather than allowing a bowl2
      def total = bowl1 + bowl2 //Defined the total here
    }
  }


}
