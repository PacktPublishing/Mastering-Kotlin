package fixingthebilliondollarmistake

import javafromkotlin.Developer

fun main(args: Array<String>) {
    var language: String = "Kotlin"
    language = null // Error: Null can not be a value of a non-null type String

    var name: String? = "Kotlin"
    name = null // this is okay
}

fun main2(args: Array<String>) {
    var languages = listOf("Kotlin", "Java", "c++", "Swift")
    languages.isNotEmpty()

    var companies: List<String>? = null
    companies?.isNotEmpty() // okay
    companies?.get(0)?.toLowerCase()
}

