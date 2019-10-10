fun main(args: Array<String>) {
    // we can store a function as a variable
    val stringFilter:(String) -> Boolean = { string ->
        string.length > 3
    }

    val languages = listOf("c++", "php", "java", "kotlin")
    val filteredLanguages = languages.filter(stringFilter)

//    val filteredLanguages = listOf("c++", "php", "java", "kotlin")
//        .filter { string ->
//            string.length > 3
//        }
}