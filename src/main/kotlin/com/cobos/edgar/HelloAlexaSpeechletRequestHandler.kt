package com.cobos.edgar

import com.amazon.ask.SkillStreamHandler
import com.amazon.ask.Skills
import com.amazon.ask.Skill

class HelloAlexaSpeechletRequestHandler : SkillStreamHandler(getSkill()) {
    companion object {
        fun getSkill(): Skill = Skills.standard()
                .addRequestHandlers(LaunchRequestHandler(), HelloWorldIntentHandler(), TellMeAboutIntentHandler(), CancelandStopIntentHandler(), SessionEndedRequestHandler())
                .build()
    }
}