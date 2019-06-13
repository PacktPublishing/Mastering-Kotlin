package pizza

sealed class Soda(name: String) : Item(name)
object Coke : Soda("Coke")
object Sprite : Soda("Sprite")
object Dr_Pepper : Soda("Dr Pepper")