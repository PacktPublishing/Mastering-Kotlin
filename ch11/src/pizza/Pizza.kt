package pizza

sealed class Pizza(name: String) : Item(name) {

    val toppings: MutableList<Topping> = mutableListOf()

    operator fun Topping.unaryPlus() = this@Pizza.toppings.add(this)

    override fun log(indent: String) {
        super.log(indent)
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
class PepperoniPizza(init: Pizza.() -> Unit = {}) : Pizza("Pepperoni Pizza") {
    init {
        +Pepperoni
        init.invoke(this)
    }
}
class HawaiianPizza(init: Pizza.() -> Unit = {}) : Pizza("Hawaiian Pizza") {
    init {
        +Pineapple
        init.invoke(this)
    }
}