interface GreetingProvider {
    fun getGreeting(): String
}

class SimpleGreeter() : GreetingProvider {
    override fun getGreeting(): String {
        return "Hi"
    }

    fun getMessage() = "You are awesome!"
}