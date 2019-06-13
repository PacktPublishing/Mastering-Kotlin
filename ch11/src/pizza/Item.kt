package pizza

@DslMarker
annotation class ItemTagMarker

@ItemTagMarker
abstract class Item(val name: String) {
    open fun print(indent: String = "") {
        println("$indent$name")
    }
}