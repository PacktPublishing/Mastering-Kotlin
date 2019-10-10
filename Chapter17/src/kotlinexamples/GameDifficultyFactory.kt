package kotlinexamples


enum class GameDifficulty {
    EASY, NORMAL, HARD
}
class DifficultySettings private constructor(
    val label: String,
    val lives: Int,
    val enemySpeed: Float,
    val enemyHealth: Float
) {

    companion object Factory {
        @JvmStatic
        fun getSettings(difficulty: GameDifficulty): DifficultySettings {
            return when (difficulty) {
                GameDifficulty.EASY -> DifficultySettings("EASY", 5, .5f, .5f)
                GameDifficulty.NORMAL -> DifficultySettings("NORMAL", 3, .75f, .75f)
                GameDifficulty.HARD -> DifficultySettings("HARD", 1, 1f, 1f)
            }
        }
    }
}

fun main() {
    val settings = DifficultySettings.getSettings(GameDifficulty.HARD)
    println("Difficulty Settings = ${settings.label}")
}