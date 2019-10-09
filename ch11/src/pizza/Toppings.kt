package pizza

sealed class Topping(name: String): Item(name)
object Pepperoni : Topping("Pepperoni")
object Olive : Topping("Olive")
object Pineapple : Topping("Pineapple")