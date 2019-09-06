package kotlinexamples

data class SearchRequest(
    val queryTerm: String = "",
    val categories: List<String> = listOf(),
    val resultCount: Int = 10
)

fun main() {
    val request1 = SearchRequest()
    val request2 = SearchRequest(
        categories = listOf("Kotlin", "Android"),
        queryTerm = "Kotlin"
    )
    val request = SearchRequest(resultCount = 20)
}