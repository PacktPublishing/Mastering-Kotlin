

object SimpleSingleton

interface SomeInterface {
    fun doSomething(foo: String) {}
}

val someInterface = object : SomeInterface {
    override fun doSomething(foo: String) {
        super.doSomething(foo)
    }
}

class SomeClass private constructor() {
    private val id = "id"

    companion object Factory : SomeInterface {
        const val someVal = "val"
        fun foo() {}

        fun createSomeClass() = SomeClass()

        override fun doSomething(foo: String) {
            super.doSomething(foo)

        }
    }
}

fun main(args: Array<String>) {
    SomeClass.foo()

    val transient = object {
        val prop = "foo"
    }
    println(transient.prop)
}