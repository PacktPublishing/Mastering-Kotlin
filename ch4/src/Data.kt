data class Article(
    var title: String,
    val author: String,
    val type: ArticleType
)


fun main(args: Array<String>) {
    val article1 = Article(
        "Kotlin is great",
        "Nate",
        ArticleType.Blog
    )
}