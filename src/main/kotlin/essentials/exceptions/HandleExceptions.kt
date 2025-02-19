package essentials.exceptions.handleexceptions

fun main() {
    while (true) {
        try {
            handleInput()
        } catch (e: NumberFormatException) {
            println(e.message)
        } catch (e: ArithmeticException) {
            println(e.message)
        } catch (e: IllegalOperatorException) {
            println(e.message)
        }

    }
}

fun handleInput() {
    print("Enter the first number: ")
    val num1 = readln().toInt()
    print("Enter an operator (+, -, *, /): ")
    val operator = readln()
    print("Enter the second number: ")
    val num2 = readln().toInt()

    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> throw IllegalOperatorException(operator)
    }

    println("Result: $result")
}

class IllegalOperatorException(val operator: String) :
    Exception("Unknown operator: $operator")
