expect object Platform {
    val name: String
}

fun hello(): String = "Hello from ${Platform.name}"

fun main() {
    println(hello())
}