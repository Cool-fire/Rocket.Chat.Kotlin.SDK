package chat.rocket.core.internal.model

import chat.rocket.core.internal.model.elementPayload.RequestPayload
import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class ActionPayload(
        val type : String,
        val requestPayload: RequestPayload
)