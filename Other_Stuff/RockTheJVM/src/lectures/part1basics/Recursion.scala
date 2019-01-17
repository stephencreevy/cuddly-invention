package lectures.part1basics

object Recursion extends App {


  def Factorial (n: Int): Int =
    if (n <= 1) 1
    else  {
      println("Computing factorial of " + n + " I first need factorial of " + (n-1))
      val result = n * Factorial(n-1)
      println("Computed factorial of " + n)

      result
    }

  println(Factorial(10))
}
