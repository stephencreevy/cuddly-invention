package lectures.part1basics

object Expressions extends App{

  val x = 1 + 2 //Expression
  println(x)

  println(2 + 3 * 4)
  // << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=
  println(!(1 == x))
  // ! && ||

  var aVariable1 = 3
  aVariable1 += 3
  println(aVariable1)

  //Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3
  println(aConditionedValue)


  //EVERYTHING IN SCALA IS AN EXPRESSION

  val aWeirdValue = (aVariable1 = 3) // Unit === void
  println(aWeirdValue)


  // CODE BLOCKS

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  println(aCodeBlock + " friend")

}
