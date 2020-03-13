fun main() {
    println("Please give your name:")
    print("> ")
    val name = readLine() ?: ""

    if (name == "Marcus") {
        println("Hi to myself!")
    } else if (name == "Adam" || name == "Tom") {
        println("Hi my best friend")
    } else {
        println("Hi $name")
    }

    when (name) {
        "Marcus" -> println("Hi to myself!")
        "Adam", "Tom" -> println("Hi my best friend")
        else -> println("Hi $name")
    }

    val greeter = if (name == "Marcus") {
        "myself"
    } else {
        name
    }

    val greeter1 = when (name) {
        "Marcus" -> "myself"
        else -> name
    }

    println("Hello $greeter")

    println("Hey user! Please give us a number:")
    val number = readLine().orEmpty().toIntOrNull()

    val isValidNumberText = if (number == null) "no" else "yes"
    val isLuckyNumber = number == 7

    if (isLuckyNumber){
        println("That was my lucky number")
    }

    if (number == 7) println("That was my lucky number")

    println("The given number $number was valid: $isValidNumberText")
}