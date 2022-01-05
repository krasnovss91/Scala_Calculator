
object Calc extends App{

 import scala.io.StdIn

  println("Введите число")
  val num1 = StdIn.readInt()
  println("Введите число")
  val num2 = StdIn.readInt()
  println("Введите операцию")
  val operation = StdIn.readChar()

  print("Результат операции "+calc(num1, num2, operation))

  def calc(num1:Int, num2:Int, operation:Char): Int ={
    var result:Int = 0

    operation match {
      case '+' => result = num1 + num2
      case '-' => result = num1 - num2
      case '*' => result = num1 * num2
      case '/' => result = num1 / num2
      case _ => println("Операция не распознана!")
    }
    result
  }

}
