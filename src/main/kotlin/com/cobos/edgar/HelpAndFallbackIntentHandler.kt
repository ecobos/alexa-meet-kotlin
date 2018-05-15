package com.cobos.edgar

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import com.cobos.edgar.extensions.say
import java.util.Optional

class HelpAndFallbackIntentHandler : RequestHandler {

    override fun canHandle(input: HandlerInput): Boolean {
        return input.matches(Predicates.intentName("AMAZON.HelpIntent").or(Predicates.intentName("AMAZON.FallbackIntent")));
    }

    override fun handle(input: HandlerInput): Optional<Response> {
        return input.say("This is the default handler")
    }
}