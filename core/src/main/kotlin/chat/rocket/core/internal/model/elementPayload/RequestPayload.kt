package chat.rocket.core.internal.model.elementPayload

import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class RequestPayload (
        val msgId : String,
        val roomId : String,
        val botId : String,
        val actions : List<ElementPayload>
)