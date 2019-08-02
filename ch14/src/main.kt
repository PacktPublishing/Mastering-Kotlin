
fun main() {
    val outputMessage = "Hello Kotlin JavaScript"
    println(outputMessage)

    jQuery("body").append("<h1>We Added A Heading!!</h1>")

    // results in runtime error if invokeAnything() doesn't exist
    val someObject: dynamic = null
    someObject.invokeAnything()
}