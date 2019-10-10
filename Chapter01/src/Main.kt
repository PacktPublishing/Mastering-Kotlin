fun formatName(name: String?) = name ?: "Fellow Human"

fun greetReader(greeting: String = "Hey", name: String?) =
    println("$greeting ${formatName(name)}")

fun main(args: Array<String>) {
    greetReader("Hello!", "Reader")
    // Hello! Reader

    greetReader(name = "New Kotlin Developer")
    // Hey New Kotlin Developer

    greetReader("Hi", null)
    // Hi Fellow Human

    greetReader(
        name = "One that wishes to learn more about Kotlin",
        greeting = "Tidings!"
    )
    // Tidings! One that wishes to learn more about Kotlin
}