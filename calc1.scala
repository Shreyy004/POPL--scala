import scala.io.StdIn._

object CalculatorApp {

  def main(args: Array[String]): Unit = {
    println("Welcome to the Scala calculator!")
    performOperations()
  }

  def performOperations(): Unit = {
    var continue = true
    while (continue) {
      println("\nSelect an operation:")
      println("1. Add")
      println("2. Subtract")
      println("3. Multiply")
      println("4. Divide")
      println("Enter 'no' to exit.")
      
      val choice = readLine().toLowerCase


      choice match {
        case "1" => addNumbers()
        case "2" => subtractNumbers()
        case "3" => multiplyNumbers()
        case "4" => divideNumbers()
        case "no" => 
          println("Exiting the calculator.")
          continue = false // Stop the loop if "no" is entered
        case _ => println("Invalid option, please try again.")
      }
    }
  }


  def addNumbers(): Unit = {
    println("Enter the first number:")
    val num1 = readDouble()
    println("Enter the second number:")
    val num2 = readDouble()
    println(s"Result: ${num1 + num2}")
  }

  
  def subtractNumbers(): Unit = {
    println("Enter the first number:")
    val num1 = readDouble()
    println("Enter the second number:")
    val num2 = readDouble()
    println(s"Result: ${num1 - num2}")
  }

  // Multiplication function
  def multiplyNumbers(): Unit = {
    println("Enter the first number:")
    val num1 = readDouble()
    println("Enter the second number:")
    val num2 = readDouble()
    println(s"Result: ${num1 * num2}")
  }

  // Division function
  def divideNumbers(): Unit = {
    println("Enter the first number:")
    val num1 = readDouble()
    println("Enter the second number:")
    val num2 = readDouble()
    if (num2 != 0) {
      println(s"Result: ${num1 / num2}")
    } else {
      println("Error: Cannot divide by zero.")
    }
  }
}