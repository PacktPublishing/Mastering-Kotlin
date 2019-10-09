fun formatGreeting(name: String) : String {
    return "Hello $name"
}

fun formatGreeting(greetingProvider: SimpleGreeter, name: String) : String {
    return "${greetingProvider.getGreeting()} $name"
}