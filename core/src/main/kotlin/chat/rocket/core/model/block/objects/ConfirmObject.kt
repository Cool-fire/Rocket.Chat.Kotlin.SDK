package chat.rocket.core.model.block.objects

import androidx.room.Embedded
import se.ansman.kotshi.JsonSerializable


@JsonSerializable
data class ConfirmObject(
        @Embedded(prefix = "title_") val title : TextObject,
        @Embedded(prefix = "text_") val text : TextObject,
        @Embedded(prefix = "confirm_") val confirm : TextObject,
        @Embedded(prefix = "deny_") val deny : TextObject
)