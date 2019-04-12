import com.sun.xml.internal.fastinfoset.util.StringArray

var greetingProvider: (() -> String)? = null
fun main(args: Array<String>) {
    helloFunctions(name = "Kotlin")
    helloFunctions(greeting = "Hi")
    helloFunctions(name = "Android", greeting = "Hey")
    helloFunctions()

    logMessage("Using the log function")

    val nate = Person("Nate", "Ebel")
    val otherPerson = Person("", "")
    nate.printName()
    nate addInterest "Kotlin"

    nate isEqualTo otherPerson

    "some string".isKotlin()
}

fun helloFunctions(greeting: String = "Hello", name: String = "Kotlin") {
    println("$greeting $name")
}
