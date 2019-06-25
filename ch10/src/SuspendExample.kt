package examples.suspend

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("show loading....")
    launch {
        println("loaded data = ${loadData()}")
    }
    println("called loadData()")
}

suspend fun loadData() : Int {
    return loadFromSource1() + loadFromSource2()
}

suspend fun loadFromSource1() : Int {
    delay(1000)
    return 3
}

suspend fun loadFromSource2() : Int {
    delay(4000)
    return 6
}