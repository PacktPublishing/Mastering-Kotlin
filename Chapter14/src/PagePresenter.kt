
private val headings = listOf("Kotlin", "Programming", "JavaScript")

data class ViewState(val title: String, val topics: List<String>)

class PagePresenter(private val viewStateListener: (ViewState) -> Unit) {

    init {
        viewStateListener(ViewState("Hello KotlinJS", headings))
    }
}