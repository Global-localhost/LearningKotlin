fun main() {
    println("Hello Variables!")

    //Values are only assignable once, Variables can be re-assigned

    //Variables and DataTypes
    //different types in Kotlin
    //https://kotlinlang.org/docs/reference/basic-types.html

    //Numbers
    val myNumber = 12
    val myLongNumber = 12L
    //Floating Numbers
    val myFloatingDouble = 12.34
    val myFloat = 12.34f

    val divisionResult = 6/4 //will store a 1
    val divisionResultDouble = 6/4.toDouble() //will store 1.5


    //Text
    val myCharacter = 'M'
    val myString = "My Name is Marcus"

    //Boolean (True or False), think about it as yes or no
    val willWeLearnKotlin = true

    val firstName = "Marcus"
    val lastName = "Eisele"
    var myAgeYears = 33

    println("Hello $firstName $lastName! You are $myAgeYears years old. You will learn Kotlin today: $willWeLearnKotlin")

    myAgeYears = 34

    println("Hello $firstName! Happy Birthday! You are now $myAgeYears old")

    println("Hey you! Please insert your own name:")
    val ownName = readLine()
    println("Hi $ownName!")
}