package chat.rocket.core.model.block.objects

import se.ansman.kotshi.JsonSerializable


@JsonSerializable
data class ConfirmObject(
        val title : TextObject,
        val text : TextObject,
        val confirm : TextObject,
        val deny : TextObject
)