package pizza

fun main() {

    val order = order {
        soda(Dr_Pepper)
        soda(Coke)

        Sprite quantity 1

        +Coke
        +Dr_Pepper

        Sprite quantity 2

        +HawaiianPizza {
            +Peperoni
        }
        pizza {
            +Peperoni
            +Olive
        }
    }

    order.log()
}