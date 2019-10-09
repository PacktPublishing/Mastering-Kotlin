class Presenter {

    private var count = 0
    private var viewState = ViewState(Platform.name, "Clicked ${++count} times")
        set(value) {
            field = value
            viewStateListener?.invoke(value)
        }

    var viewStateListener: ((ViewState) -> Unit)? = null
        set(value) {
            field = value
            value?.invoke(viewState)
        }

    fun onClick() {
        viewState = viewState.copy(subtitle = "Clicked ${++count} times")
    }
}