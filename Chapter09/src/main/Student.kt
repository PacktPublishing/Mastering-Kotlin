data class Student(val firstName: String, val lastName: String) {

    companion object Factory {
        fun createDefaultStudent() = Student("Jane", "Doe")
    }

}