import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executors

val executor = Executors.newFixedThreadPool(3)

fun main() {
    println("Hello Chapter 10")

    threadExample()
    //threadPoolExample()
    //completableFutureExample()
    //rxExample()
}

fun threadExample() {
    println("Running threadExample()")
    val thread = Thread {
        Thread.sleep(1000)
        println("Thread finished after 1 second")
    }
    thread.start()
    println("Finished threadExample()")
}

fun threadPoolExample() {
    executor.submit {
        Thread.sleep(500)
        println("Runnable 1")
    }
    executor.submit {
        Thread.sleep(200)
        println("Runnable 2")
    }
    executor.submit {
        Thread.sleep(300)
        println("Runnable 3")
    }
}

fun completableFutureExample() {
    CompletableFuture.supplyAsync {
        Thread.sleep(5000)
        "Future is done"
    }.thenApply {
        "The supplied value was: $it"
    }.thenAccept {
        println(it)
    }

    Thread.sleep(10000)
}

fun rxExample() {
    Single.fromCallable {
        Thread.sleep(5000)
        "Single is done"
    }
    .observeOn(Schedulers.io())
    .subscribe { value -> println(value) }
    Thread.sleep(10000)
}