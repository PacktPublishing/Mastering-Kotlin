sealed class ProgrammingLanguage(protected val name: String) {
    object Kotlin : ProgrammingLanguage("Kotlin")
    object Java : ProgrammingLanguage("Java")
    object Swift : ProgrammingLanguage("Swift")

    override fun toString(): String {
        return "$name Programming Language"
    }
}

fun main() {
    val mutableList = mutableListOf("Kotlin", "Java", "Swift")
    val arrayList = arrayListOf("Kotlin", "Java", "Swift")
    val array = arrayOf("Kotlin", "Java", "Swift")
    val map = mapOf("Kotlin" to 1, "Java" to 2, "Swift" to 3)

    val list = listOf("Kotlin", "Java", "Swift", "K")
    list.filter { it.startsWith("K") }
        .map {
            when (it) {
                "Kotlin" -> ProgrammingLanguage.Kotlin
                else -> null
            }
        }
        .filterNotNull()
        .forEach { println(it) }

    list.associate { it to it.length }
        .forEach {
            println("${it.key} has ${it.value} letters")
        }

    val first = list.first()
    println(first)

    val last = list.last()
    println(last)

    list.take(2).forEach { println(it) }

    val lastK = list.findLast { it.contains("K") }
    val firstK = list.find { it.contains("K") }
    println(lastK)

    if (list.isNullOrEmpty()) {
        // handle empty case
    }

    val emptyList = emptyList<String>()
    val emptyMap = emptyMap<String, Int>()
    val emptyArray = emptyArray<String>()

    var possiblyNullList: List<String>? = null
    var nonNullList = possiblyNullList.orEmpty()

    val string: String? = null
    if (string.isNullOrBlank()) {
        // handle edge cases
    }
    if (string.isNullOrEmpty()) {
        // handle edge cases
    }
    if (string?.isEmpty() == true) {
        // handle empty string
    }
    if (string?.isNotBlank() == true) {
        // handle non-blank string
    }

    var possiblyNullString: String? = null
    var nonNullString = possiblyNullString.orEmpty()
}