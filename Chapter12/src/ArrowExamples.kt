import arrow.core.Either
import arrow.core.Option
import arrow.core.Some
import arrow.core.getOrElse
import arrow.data.NonEmptyList
import arrow.effects.IO
import arrow.instances.eq
import arrow.typeclasses.Eq

fun <F> List<F>.filter(other: F, EQ: Eq<F>) =
    this.filter { EQ.run { it.eqv(other) } }

fun main() {
    listOf("1", "2", "3").filter("2", String.eq()).forEach { println(it) }

    val someNumber = Some(1).flatMap { a ->
        Some(a + 1)
    }.getOrElse { -1 }
    println(someNumber)

    val nonEmptyList = NonEmptyList.of(1, 2, 3, 4, 5)

    IO<Int> {
        Thread.sleep(2000)
        5
    }
        .runAsync { result ->
            result.fold({ IO { println("Error") } }, { IO { println("$it") } })
        }.unsafeRunAsync { }

    Thread.sleep(5000) // delayed so previous async operation can complete
}