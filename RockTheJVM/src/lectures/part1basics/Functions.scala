package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b

}

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
println(aParameterlessFunction())
println(aParameterlessFunction)


  //below a recursive function (use recursives instead of loops - still not actually sure why but everyone is saying this
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  //as best practice always specify the return types for functions

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
  def aSmallerFunction(a: Int, b: Int): Int = a + b

  aSmallerFunction(n, n-1)}

  def greeting(name: String, age: Int): String = {
    "Hello, my name is " + name + " and I am " + age + " years old."
  }

  println(greeting("Stephen", 25))

  def factorial(n: Int): Int = {
    if (n <= 0 ) 1
    else n * factorial(n-1)
  }
println(factorial(5))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)
    isPrimeUntil(n/2)

  }


  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))


}
