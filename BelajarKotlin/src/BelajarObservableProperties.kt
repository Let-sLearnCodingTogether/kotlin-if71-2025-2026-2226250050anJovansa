import kotlin.properties.Delegates

//class Game {
//    var score: Int = 0
//    var highScore: Int = 0
//
//    fun updateScore(newScore: Int) {
//        score = newScore
//        if (newScore > highScore) {
//            highScore = newScore
//        }
//    }
//}

class Game {
    var highScore: Int = 0

    var score by Delegates.observable(0) { property, oldValue, newValue ->
        println("Properti ${property.name} berubah dari $oldValue")
        if (newValue > oldValue) {
            highScore = newValue
        }
    }
}

fun main() {
    val game = Game()

    game.score = 20
    println(game.highScore)

    game.score = 30
    println(game.highScore)

}