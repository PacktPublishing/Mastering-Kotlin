fun main(args: Array<String>) {
    println(sumNumbersToN(10))
}

/**
 * @return The sum of the numbers from 1 to n
 */
fun sumNumbersToN(n: Int) : Int {
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    return sum
}