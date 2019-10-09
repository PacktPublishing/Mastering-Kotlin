fun generateStudentId(firstname: String, lastname: String) : String {
    return ""
}

class School private constructor(val name: String) {

    internal constructor() : this("") {

    }
}

class Student (_firstName: String, val lastName: String) {
    val firstName = _firstName
    val id: String
    var nickname = ""
    val activities: MutableList<String>

    init {
        id = generateStudentId(firstName, lastName)
    }

    val subjects: MutableList<String> = mutableListOf()

    init {
        activities = mutableListOf()
    }

    constructor(_firstName: String) : this(_firstName, "") {
        // initialization logic
    }

    private fun printStudentInfo() {
        println("id:$id -> $firstName $lastName")
    }
}