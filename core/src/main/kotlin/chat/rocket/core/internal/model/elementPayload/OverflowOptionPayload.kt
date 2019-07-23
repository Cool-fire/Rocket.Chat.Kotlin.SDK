package chat.rocket.core.internal.model.elementPayload

import chat.rocket.core.model.block.objects.TextObject
import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class OverflowOptionPayload(
        val text: TextObject,
        val value: String
)