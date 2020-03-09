import java.util.*

fun main() {
    //if-else
    println("Please give your name:")
    print(">");
    val name = readLine().orEmpty()

    if (name == "Marcus") {
        //if (name.equals("Marcus", true)) {
        println("Hi to myself!")
    } else if (name == "You") {
        println("Hello my dearest friend!")
    } else {
        println("Hello my dear friend!")
    }

    if (name == "Marcus" || name == "marcus"){
        println("Test")
    } else if (name == "You") {
        println("Test")
    }

    when (name) {
        "Marcus", "marcus" -> {
            println("Test")
        }
        "You" -> {
            println("Test")
        }


        //possibility to validate that a number was entered

        //maybe way to better understand it
    }

    when (name) {
        "Marcus" -> println("Hi to myself!")
        "You" -> println("Hello my dearest friend!")
        else -> println("Hello my dear friend!")
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

    print("Now give a number: ")
    val number = readLine()?.toIntOrNull()
    val number1 = readLine().orEmpty().toIntOrNull()

    println(number)
    val isValidNumberText = if (number != null) "yes" else "no"
    println("$number was a valid number: $isValidNumberText")


    //possibility to validate that a number was entered
    val reader = Scanner(System.`in`)
    println("Please insert a number:")
    while (!reader.hasNextInt()) {
        println("That didn't look good. Try again with a number:")
        reader.next()
    }

    println("You entered: ${reader.nextInt()}")

    //maybe way to better understand it

}