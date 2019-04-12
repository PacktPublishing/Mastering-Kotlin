fun getGreetingProvider(isFriendly: Boolean) : () -> List<String> {
    return if (isFriendly) {
        { listOf("Hey", "Hi", "Hello") }
    } else {
        { listOf("Go away", "Leave me alone") }
    }
}