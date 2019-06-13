package testing

interface GreetingProvider {
    val greeting: String
    val friendlyGreeting: String
}

class ViewModel(private val name: String, private val greetingProvider: GreetingProvider) {

    //val greeting = "${greetingProvider.greeting} $name"
    val greeting = "foo $name"
}