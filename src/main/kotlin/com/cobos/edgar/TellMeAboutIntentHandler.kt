package com.cobos.edgar

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.IntentRequest
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import com.cobos.edgar.extensions.say
import java.util.Optional

class TellMeAboutIntentHandler : RequestHandler {

    override fun canHandle(input: HandlerInput): Boolean {
        return input.matches(Predicates.intentName("TellMeAboutIntent"))
    }

    override fun handle(input: HandlerInput): Optional<Response> {
        val request = input.requestEnvelope.request

        val jvm_language: String = if (request is IntentRequest) {
            val slots = request.intent.slots
            val jvml_slot = slots.get("jvml")
            jvml_slot?.value ?: "Swift"
        } else {
            ""
        }

        val response = if (jvm_language == "kotlin") {
            "Kotlin is the best!"
        } else {
            "$jvm_language is just another jvm language."
        }
        return input.say(response)
    }
}