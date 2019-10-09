class Student @JvmOverloads constructor(
        val firstName:String = "",
        val lastName: String = "",
        val grade: Int = 10,
        val classes:List<String> = listOf("Home Room", "Math")
)