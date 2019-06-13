package pizza

sealed class Pizza(name: String) : Item(name) {

    val toppings: MutableList<Topping> = mutableListOf()

    operator fun Topping.unaryPlus() {
        this@Pizza.toppings.add(this)
    }

    override fun print(indent: String) {
        super.print(indent)
        toppings.forEach {
            println("$indent      ${it.name}")
        }
    }
}

class BuildYourOwn(init: Pizza.() -> Unit = {}) : Pizza("Build Your Own Pizza") {
    init {
        init.invoke(this)
    }
}
class PeperoniPizza(init: Pizza.() -> Unit = {}) : Pizza("Peperoni Pizza") {
    init {
        +Peperoni
        init.invoke(this)
    }
}
class HawaiianPizza(init: Pizza.() -> Unit = {}) : Pizza("Hawaiian Pizza") {
    init {
        +Pineapple
        init.invoke(this)
    }
}