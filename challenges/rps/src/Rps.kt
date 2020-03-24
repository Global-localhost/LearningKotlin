import kotlin.random.Random

fun main() {
    var userWins = 0
    var computerWins = 0
    var draws = 0
    while (userWins + computerWins + draws < 10) {
        println("Choose (r)ock, (p)aper, or (s)cissor")
        val userChoice = readLine().orEmpty()

        val enemyChoice = when (Random.nextInt(0, 3)) {
            0 -> "r"
            1 -> "p"
            2 -> "s"
            else -> "should not happen"
        }

        val outcome = if (enemyChoice == userChoice) {
            draws++
            Outcome.DRAW
        } else if (
            (enemyChoice == "r" && userChoice == "p") ||
            (enemyChoice == "p" && userChoice == "s") ||
            (enemyChoice == "s" && userChoice == "r")
        ) {
            userWins++
            Outcome.VICTORY
        } else {
            computerWins++
            Outcome.LOSS
        }

        println("Enemy choose $enemyChoice")
        println("Outcome was: $outcome")
        println("--------------")
    }

    println("--------------")
    println("Total scores are:")
    println("User: $userWins, Computer: $computerWins, Draws: $draws")
}

enum class Outcome {
    VICTORY, DRAW, LOSS
}