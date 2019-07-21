package chat.rocket.core.model.block.elements

import chat.rocket.core.model.block.objects.ConfirmObject
import chat.rocket.core.model.block.objects.OptionObject
import com.squareup.moshi.Json
import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class OverflowElement(
        override val type: String,
        @Json(name="action_id")
        val actionId: String,
        val options: List<OptionObject>,
        val confirm: ConfirmObject? = null
): Element