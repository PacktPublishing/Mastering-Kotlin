package kotlinexamples

interface BotBehavior {
    fun generateBoardState(currentState: Array<Array<Int>>)
}

object EasyBot : BotBehavior {
    override fun generateBoardState(currentState: Array<Array<Int>>) {
        // pick first available action
    }
}

object DifficultBot : BotBehavior {
    override fun generateBoardState(currentState: Array<Array<Int>>) {
        // perform look ahead search
    }
}

class Chess(var behavior: BotBehavior) {
    fun play() {
        // game loop
        // relies on behavior
    }

    fun pause() { }
}

class FunctionalChess(var behavior: (Array<Array<Int>>) -> Unit) {
    fun play() {
        // game loop
        // relies on behavior
    }

    fun pause() { }
}

val easyBehavior:(Array<Array<Int>>) -> Unit = { gameState ->
    // pick first available action
}

val difficultBehavior:(Array<Array<Int>>) -> Unit = { gameState ->
    // perform look ahead search
}

fun main() {
    val game = Chess(EasyBot)
    game.play()
    game.pause()
    game.behavior = DifficultBot
    game.play()

    val functionalGame = FunctionalChess(easyBehavior)
    functionalGame.play()
    functionalGame.pause()
    functionalGame.behavior = difficultBehavior

    listOf("programming languages", "foo", "Kotlin")
        .sortedBy { it[0] }
        .forEach { println(it) }
}