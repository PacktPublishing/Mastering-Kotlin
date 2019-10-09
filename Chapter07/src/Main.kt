import authscreen.AuthScreen

fun main() {
    val person = Person()

    val programmer = Programmer("John", "Smith", "Kotlin")
    programmer.preferredLanguage
    programmer.firstName

    printGreeting("Nate")

    "message to log".log()

    println(KEY_ID)
    screenCount++

    val result = AuthScreen.RESULT_AUTHENTICATED

    val authScreen = AuthScreen() // wont compile
    import authscreen.AuthScreen
    val screen = AuthScreen.create()
}