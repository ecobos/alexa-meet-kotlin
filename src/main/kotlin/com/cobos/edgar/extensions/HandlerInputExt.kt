package com.cobos.edgar.extensions

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import java.util.Optional
import com.amazon.ask.model.Response

fun HandlerInput.say(str: String): Optional<Response> = this.responseBuilder.withSpeech(str).build()
