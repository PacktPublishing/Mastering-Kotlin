package com.packt.routes

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.get

const val AGENDA_JSON_SAMPLE = """
{
  "days":[
    {
      "title":"Day 1",
      "date":"6\/4\/20",
      "sessions":[
        {
          "id":0,
          "title":"Kotlin 101",
          "speaker":"John Smith"
        },
        {
          "id":1,
          "title":"Kotlin 201",
          "speaker":"Jane Smith"
        }
      ]
    },
    {
      "title":"Day 2",
      "date":"6\/5\/20",
      "sessions":[
        {
          "id":4,
          "title":"Kotlin 301",
          "speaker":"John Smith"
        },
        {
          "id":5,
          "title":"Advanced Kotlin",
          "speaker":"Jane Smith"
        }
      ]
    }
  ]
}
"""

fun Route.agenda() = get("/agenda") {
    call.respondText(AGENDA_JSON_SAMPLE.trimIndent(), ContentType.Text.Plain)
}