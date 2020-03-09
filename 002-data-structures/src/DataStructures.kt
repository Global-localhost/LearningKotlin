fun main() {
    //Arrays
    val myStringArray = arrayOf("Marcus", "Eisele", "Developer")
    //Lists
    val myStringList = listOf("Marcus", "Eisele", "Developer", "Marcus")

    //Sets
    val myStringSet = setOf("Marcus", "Eisele", "Developer", "Marcus")

    println("The size of our List is ${myStringList.size}")
    println("The size of our Set is ${myStringSet.size}")

    //Maps
    val userMap = mapOf("user-001" to "Jon", Pair("user-002", "Marcus"))
    // user-001 -> Jon
    // user-002 -> Marcus
    println(userMap.entries)
    println("user-001 is ${userMap["user-001"]}")
    println("user-002 is ${userMap["user-002"]}")

    //Data Classes
    val personMap = mapOf("Marcus" to Person("Marcus", "Eisele", listOf("Mo", "eiselems")))
    println(personMap.entries)
}

data class Person(val firstName: String, val lastName: String, val nicknames: List<String>)