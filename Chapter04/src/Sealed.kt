
sealed class ViewState
object Loading : ViewState()
data class Loaded(val article: Article) : ViewState()
class Error(val error: Throwable?) : ViewState()


fun getLogMessage(state: ViewState) : String {
    return when (state) {
        Loading -> "is loading"
        is Loaded -> "is loaded"
        is Error -> "error has occured"
    }
}

fun main(args: Array<String>) {
    var name: String = "Nate"
    name = "john"
}