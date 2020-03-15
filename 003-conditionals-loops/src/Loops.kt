import kotlin.random.Random

fun main() {
    //while loops
    while (true) {
        println("Test")
        Thread.sleep(1000)
        break
    }

    var counter = 0
    while (counter < 5){
        println("Counter: $counter")
        counter += 1
    }

    do {
        val myValue = Random.nextBoolean()
        println("MyValue is $myValue")
    } while (myValue)

    //for loops
    for (count in 1..5){
        println(count)
    }

    for (i in 10 downTo 0 step 2){
        println(i)
    }
    //loops over collection

    val myList = listOf("Marcus", "Eisele", "Tutorials", "Kotlin")
    for (str in myList){
        println(str)
    }

    for (i in myList.indices){
        println("$i ${myList[i]}")
    }

    for ((index, value) in myList.withIndex().reversed()){
        println("$index $value")
    }


    //create a loop to validate our user input
    var validatedNumber: Int? = null
    while (validatedNumber == null){
        println("Please give us a valid number:")
        validatedNumber = readLine()?.toIntOrNull()
    }

    println("The user entered: $validatedNumber")

    when(validatedNumber){
        3 -> println("Hey I can't stand the number 3!")
        7 -> println("Hey 7 is my lucky number!")
        else -> println("Ah $validatedNumber is pretty boring")
    }
}