package com.packt.routes

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.get

fun Route.root() {
    get("/") {
        call.respondText("Hello World", ContentType.Text.Plain)
    }
}