inline fun safelyRun(action: () -> Unit, noinline action2:() -> Unit) {
    try {
        action()
        action2()
    } catch (error: Throwable) {
        println("Caught error: ${error.message}")
    }
}

fun main() {
    val greeting = "Hello"
    safelyRun({ println("Hi Kotlin")}) {
        println("$greeting Kotlin")
    }
}