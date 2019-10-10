data class ViewState(val title: String, val subtitle: String)

fun main() {
    val initialState = ViewState("Hello", "Kotlin")
    val updatedState = initialState.copy(title = "Hey There!")
}