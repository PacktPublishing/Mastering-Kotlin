package pizza

import java.util.*

fun order(init: Order.() -> Unit): Order {
    val order = Order(UUID.randomUUID().toString())
    order.init()
    return order
}

class Order(val id: String) : Item("")  {
    val items: MutableMap<Item, Int> = mutableMapOf()

    fun pizza(init: Pizza.() -> Unit) {
        val pizza = BuildYourOwn()
        pizza.init()
        items[pizza] = 1
    }

    fun soda(soda: Soda) = items.put(soda, items.getOrDefault(soda, 0) + 1)

    infix fun Soda.quantity(quantity: Int) {
        this@Order.items.put(this, this@Order.items.getOrDefault(this, 0) + quantity)
    }

    operator fun Soda.unaryPlus() = this@Order.soda(this)

    operator fun Pizza.unaryPlus() {
        this@Order.items.put(this, this@Order.items.getOrDefault(this, 0) + 1)
    }

    override fun log(indent: String) {
        println("Order: $id")
        println("Items")
        items.forEach {
            print("${it.value} x ")
            it.key.log()
        }
    }
}