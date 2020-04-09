fun main() {

}

//class Pet(name: String) {
//we don't know what kind of Pet it is therefore we can't create a sound
//    fun giveSound(): String {
//    }
//}

abstract class Pet(name: String) {
    //we don't know what kind of Pet it is therefore we can't create a sound
    abstract fun giveSound(): String
}


class Dog(name: String): Pet(name) {
    override fun giveSound(): String {
        return "bark"
    }
}

class Cat(name: String): Pet(name) {
    companion object {
        fun create(name: String) = Cat(name)
    }

    override fun giveSound(): String {
        return "purr"
    }
}