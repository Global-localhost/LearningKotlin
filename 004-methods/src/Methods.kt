import Choice.*
import kotlin.random.Random

fun askUser(): Choice {
    println("Choose (r)ock, (p)aper, or (s)cissors:")
    return when (readLine().orEmpty()) {
        "r" -> ROCK
        "p" -> PAPER
        "s" -> SCISSORS
        else -> UNDEFINED
    }
}

fun main() {

    var userWins = 0
    var enemyWins = 0
    var draws = 0

    while (userWins + enemyWins < 10 || userWins == enemyWins) {
        val userChoice = askUser()
        val enemyChoice = generateEnemyChoice()

        val outcome = if (enemyChoice == userChoice) {
            draws++
            Outcome.DRAW
        } else if (hasUserWon(userChoice, enemyChoice)) {
            userWins++
            Outcome.WIN
        } else {
            enemyWins++
            Outcome.LOSS
        }

        println("userChoice: $userChoice and enemyChoice was $enemyChoice. The outcome was a $outcome")
        println("Current Score: $userWins vs $enemyWins")
    }

    println("Game is over! Final score was: You ($userWins) vs Computer ($enemyWins) and $draws draws")
}

private fun hasUserWon(userChoice: Choice, enemyChoice: Choice) =
    (userChoice == ROCK && enemyChoice == SCISSORS) ||
            (userChoice == PAPER && enemyChoice == ROCK) ||
            (userChoice == SCISSORS && enemyChoice == PAPER)

private fun generateEnemyChoice(): Choice {
    return when (Random.nextInt(0, 3)) {
        0 -> ROCK
        1 -> PAPER
        2 -> SCISSORS
        else -> UNDEFINED
    }
}

enum class Choice {
    ROCK, PAPER, SCISSORS, UNDEFINED
}

enum class Outcome {
    WIN, DRAW, LOSS
}