

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

package Bowling

object BowlingApp extends App {
//Potential of three bowls not 10 like in the last one. (Should have actually been 13 know Alex, i got confused, as it will be recalled we can simulate a "Turn")
  case class Bowling(first: Int, second: Int, third: Int) {
    override def toString()
    = {
      "bowl1: " + first + " bowl2" + second + " bowl3: " + third
    }
  }

  def turns(b: List[Int]): List[Bowling] = {
    b match {
      case Nil => Nil
      case x :: Nil => List(new Bowling(x, 0, 0))
      case x :: xs :: Nil => List(new Bowling(x, xs, 0))
      case 10 :: x :: xs => new Bowling(10, x, xs.head) :: turns(xs.tail)
      case x :: xs :: xss if ((x + xs) == 10) => new Bowling(x, xs, xss.head) :: turns(xss.tail)
      case x :: xs => new Bowling(x, xs.head, 0) :: turns(xs.tail)
    }
  }
}
