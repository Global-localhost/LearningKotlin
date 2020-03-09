import kotlin.random.Random

fun main() {

    //# while loops
    //you define your own criteria
    //## infinite loop
//    while (true) {
//        println("Test")
//    }
    //## while x
    var counter = 0
    while (counter < 5) {
        println("Test $counter")
        counter++
    }

    do {
        val myValue = Random.nextBoolean()
        println("Test $myValue")
    } while (myValue)

    //#for loop
    //##Ranges
    for (i in 1..5) {
        println("Test $i")
    }
    //##Ranges with steps
    for (i in 1..10 step 2) {
        println("$i Test")
    }
    //##Ranges in reverse
    for (i in 10 downTo 0 step 2) {
        println("Test $i")
    }

    //##Over collections
    val myList = listOf("Marcus", "Eisele", "Tutorials", "Kotlin")
    for (str in myList) {
        println(str)
    }
    //##Over collection with index (two alternatives)
    for (i in myList.indices) {
        println("$i ${myList[i]}")
    }

    for ((index, value) in myList.withIndex().reversed()) {
        println("$index $value")
    }

    //worth mentioning every for loop here can be reversed by adding reversed to the lists

    myList.withIndex().forEach { indexedValue ->
        println("${indexedValue.index} ${indexedValue.value}")
    }


    //too complicated for beginners
//    do {
//        println("Please give a valid number:")
//        val validatedNumber =
//            (readLine())?.toIntOrNull()
//                .also { println("Invalid input: $it") }
//    } while (validatedNumber == null)
    var validatedNumber: Int? = null;
    while (validatedNumber == null) {
        println("Please give a valid number:")
        validatedNumber = readLine()?.toIntOrNull()
    }

    when {
        validatedNumber < 3 -> println("Small");
        validatedNumber < 5 -> println("Med");
        validatedNumber < 7 -> println("Big");
        else -> println("huge")
    }
}