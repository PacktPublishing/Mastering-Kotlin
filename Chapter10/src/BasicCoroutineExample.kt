package examples.basic

import kotlinx.coroutines.*

class ViewModel {
    private val mainScope = MainScope()

    init {
        mainScope.launch {
            // fetch data
        }
    }

    fun destroy() {
        mainScope.cancel()
    }
}

fun main() = runBlocking {
    launch {
        delay(500)
        println("Coroutines")
    }
    println("Hello")
}