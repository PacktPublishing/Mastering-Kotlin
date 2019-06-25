package pizza

sealed class Topping(name: String): Item(name)
object Peperoni : Topping("Peperoni")
object Olive : Topping("Olive")
object Pineapple : Topping("Pineapple")