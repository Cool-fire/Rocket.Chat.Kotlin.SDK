package chat.rocket.core.model.block.objects

import androidx.room.Embedded
import se.ansman.kotshi.JsonSerializable


@JsonSerializable
data class OptionObject(
        @Embedded(prefix = "text_") var text: TextObject,
        var value: String,
        var url: String? = null
)