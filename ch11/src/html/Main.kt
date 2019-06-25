fun main() {
    val result = html {
        head {
            title { +"HTML encoding with Kotlin" }
        }
        body {
            h1 { +"HTML encoding with Kotlin" }
            p {
                +"this format can be used as an"
                +"alternative markup to HTML"
            }

            // an element with attributes and text content
            a(href = "http://jetbrains.com/kotlin") { +"Kotlin" }

            // mixed content
            p {
                +"This is some"
                b { +"mixed" }
                +"text. For more see the"
                a(href = "http://jetbrains.com/kotlin") {
                    +"Kotlin"
                }
                +"project"
            }

            p {
                +"Can even leverage loops and control flow"
                ul {
                    for (i in 1..3)
                        li { +"${i}*2 = ${i*2}" }
                }
            }
        }
    }

    result.html {
        body {
            p {+"add on to existing HTML"}
        }
    }

    println(result.toString())
}