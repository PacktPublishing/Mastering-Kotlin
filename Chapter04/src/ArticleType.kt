enum class ArticleType(val displayName: String) {
    Aside("Small Post"),
    Blog("Standard Blog Post"),
    Series("Part of a Blog Series")
}

fun main(args: Array<String>) {
    println(ArticleType.Blog.displayName)
}