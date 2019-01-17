package Bowling

object BowlingScorer extends App{



  //Bowling Rules

  //Frame 1, ball 1: 10 pins (strike)
  //Frame 2, ball 1: 3 pins
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

    case class Bowling(T1: Int, T2: Int, T3: Int, T4: Int, T5: Int, T6: Int, T7: Int, T8: Int, T9: Int, T10: Int) {
      override def toString()
      = {
        "bowl1: " + T1 + " bowl2" + T2 + " bowl3: " + T3 + "bowl4: " + T4 + " bowl5" + T5 + " bowl6: " + T6 + "bowl7: " + T7 + " bowl8" + T8 + " bowl9: " + T9 + "bowl10" + T10
      }
    }

    def turns(b: List[Int]): List[Bowling] = {
      b match {
        case Nil => Nil
        case x :: Nil => List(new Bowling(x, 0, 0))
        case x :: xs :: Nil => List(new Bowling(x, xs, 0))
       //NEED TO START FROM SRATCH AND TRY AGAIN
      }
    }
  }


}
