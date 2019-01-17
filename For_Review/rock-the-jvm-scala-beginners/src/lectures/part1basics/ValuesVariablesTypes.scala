package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  val xmas: Int = 400
  println(x, xmas)

  //VALS ARE IMMUTABLE
  // compiler CAN INFER TYPES I.E DON'T HAVE TO DEFINE IT AS AN INT VAL X = 42 ETC
  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'A'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 7373726262537L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  //Variables (vars can be reassigned)

  var aVariable: Int = 4
  aVariable = 5 //side effects


}
