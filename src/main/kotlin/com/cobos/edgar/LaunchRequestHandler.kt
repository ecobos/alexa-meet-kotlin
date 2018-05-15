package com.cobos.edgar

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import java.util.Optional
import com.amazon.ask.model.Response
import com.amazon.ask.model.LaunchRequest
import com.amazon.ask.request.Predicates
import com.amazon.ask.dispatcher.request.handler.RequestHandler


class LaunchRequestHandler : RequestHandler {

    override fun canHandle(input: HandlerInput): Boolean {
        return input.matches(Predicates.requestType(LaunchRequest::class.java))
    }

    override fun handle(input: HandlerInput): Optional<Response> {

        val speechText = "Welcome to the Kotlin-based Alexa Skill created by Edgar"
        return input.responseBuilder
                .withSpeech(speechText)
                .withSimpleCard("HelloWorld", speechText)
                .withReprompt(speechText)
                .build()
    }

}