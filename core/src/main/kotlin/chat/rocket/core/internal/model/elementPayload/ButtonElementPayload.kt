package chat.rocket.core.internal.model.elementPayload

import chat.rocket.core.model.block.objects.TextObject
import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class ButtonElementPayload (
        override val type: String,
        override val blockId: String?,
        override val actionId: String?,
        val text: TextObject,
        val value: String?
) : ElementPayload