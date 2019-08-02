
fun main() {
//    val outputMessage = "Hello Kotlin JavaScript"
//    println(outputMessage)
//
//    jQuery("body").append("<h1>We Added A Heading!!</h1>")

//    // results in runtime error if invokeAnything() doesn't exist
//    val someObject: dynamic = null
//    someObject.invokeAnything()

    val presenter = PagePresenter() {
        jQuery("body").append("<h1>${it.title}</h1>")
        it.topics.forEach {
            jQuery("body").append("<h2>${it}</h2>")
        }
    }
}