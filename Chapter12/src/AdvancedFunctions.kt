var onClickHandler: (ViewState) -> Unit = {}

class ViewModel(val viewState: ViewState, val clickHandler:(ViewState) -> Unit)
class LoadingViewModel(config: LoadingViewModel.() -> Unit) {
    var title = ""
    var subtitle = ""
    var loadingMsg = ""
    val successMsg = ""

    init {
        config(this)
    }
}

fun createViewModel(viewState: ViewState, clickHandler: (ViewState) -> Unit) : ViewModel {
    return ViewModel(viewState, clickHandler)
}

fun main() {
    onClickHandler = { viewState ->
        println("viewState -> ${viewState.title} ${viewState.subtitle}")
    }

    val viewState = ViewState("Hello", "Kotlin")
    onClickHandler(viewState)
    onClickHandler.invoke(viewState)

    createViewModel(viewState, onClickHandler)

    LoadingViewModel {
        this.title = "Hello"
        loadingMsg = "Loading..."
    }
}