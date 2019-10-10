class GreetingViewModel {
    private val greetings = listOf("Hey", "Hi", "What's up?")

    fun printGreetings(filter: (String) -> Boolean) {
        greetings
            .filter(filter)
            .forEach {  greeting ->
                println(greeting)
            }
    }
}