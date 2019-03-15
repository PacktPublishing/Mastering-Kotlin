class Person(val firstName: String, val lastName: String) {

    private val interests: MutableList<String> = mutableListOf()

    fun printName() = println("$firstName $lastName")

    infix fun addInterest(interest: String) = interests.add(interest)
}