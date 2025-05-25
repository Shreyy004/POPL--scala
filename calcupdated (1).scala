import scala.io.StdIn.readLine

object Calculator {
  def main(args: Array[String]): Unit = {
    var continue = true

    while (continue) {
      println("Enter an expression (e.g., 5+6):")
      val expression = readLine()

      // Use regular expression to split the input based on operator
      val pattern = "([0-9.]+)([+\\-*/])([0-9.]+)".r
      expression match {
        case pattern(num1Str, operator, num2Str) =>
          val num1 = num1Str.toDouble
          val num2 = num2Str.toDouble
          
          operator match {
            case "+" => println(s"Result: ${num1 + num2}")
            case "-" => println(s"Result: ${num1 - num2}")
            case "*" => println(s"Result: ${num1 * num2}")
            case "/" => 
              if (num2 != 0) {
                println(s"Result: ${num1 / num2}")
              } else {
                println("Error: Division by zero is not allowed.")
              }
          }
        case _ => println("Invalid expression. Please try again.")
      }

      println("Do you want to perform another operation? (YES/NO)")
      val userInput = readLine().toUpperCase
      if (userInput == "NO") {
        continue = false
      }
    }
    println("Calculator closed.")
  }
}
