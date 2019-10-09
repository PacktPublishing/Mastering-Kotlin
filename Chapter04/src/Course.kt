
class Course(courseTitle: String) {
    val title = courseTitle
    var description = ""
        set(value) {
            println("description updated to: $value")
            field = value
        }
        get() {
            // add code for getter
            val foo = 5
            return field
        }
}