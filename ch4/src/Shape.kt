interface Shape {
    fun getArea() : Double
}

open class Rectangle(
    val width: Double,
    val height: Double
) : Shape {
    final override fun getArea() = width * height

    open fun printArea() = println("Area is ${getArea()}")
}

class Square(val edgeLength: Double) : Rectangle(edgeLength, edgeLength) {
    override fun printArea() = println("Square area is ${getArea()}")
}

