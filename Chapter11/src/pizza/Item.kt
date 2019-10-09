package pizza

@DslMarker
annotation class ItemTagMarker

@ItemTagMarker
abstract class Item(val name: String) {
    open fun log(indent: String = "") {
        println("$indent$name")
    }
}