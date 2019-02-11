package javafromkotlin

// Kotlin function calling the static Java method Logger.logMessage
fun main(args: Array<String>) {
    val kotlinDev = Developer("Your Name", "Kotlin")
    val name = kotlinDev.getName()

    Logger.logMessage(name)
}