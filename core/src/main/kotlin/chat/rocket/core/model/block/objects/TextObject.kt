package chat.rocket.core.model.block.objects

import se.ansman.kotshi.JsonSerializable


@JsonSerializable
data class TextObject(
        var type : String,
        var text : String,
        var emoji : Boolean? = null,
        var verbatim : Boolean? = null
)