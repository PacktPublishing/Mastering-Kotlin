package pizza

import java.util.*

fun order(init: Order.() -> Unit): Order {
    val order = Order(UUID.randomUUID().toString())
    order.init()
    return order
}

class Order(val id: String)  {
    val items: MutableMap<Item, Int> = mutableMapOf()

    fun pizza(init: Pizza.() -> Unit) {
        val pizza = BuildYourOwn()
        pizza.init()
        items[pizza] = 1
    }

    fun soda(soda: Soda) = items.put(soda, items.getOrDefault(soda, 0) + 1)

    infix fun Soda.quantity(quantity: Int) {
        items.put(this, items.getOrDefault(this, 0) + quantity)
    }

    operator fun Soda.unaryPlus(){
        items.put(this, items.getOrDefault(this, 0) + 1)
    }

    operator fun Pizza.unaryPlus() {
        items.put(this, items.getOrDefault(this, 0) + 1)
    }

    fun print() {
        println("Order: $id")
        println("Items")
        items.forEach {
            print("${it.value} x ")
            it.key.print("  ")
        }
    }
}