package chat.rocket.core.model.block.elements

import chat.rocket.core.model.block.objects.ConfirmObject
import chat.rocket.core.model.block.objects.TextObject
import com.squareup.moshi.Json
import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class ButtonElement (
        override val type : String,
        @Json(name = "action_id")
        val actionId : String,
        val text : TextObject,
        val url : String? = null,
        val value : String? = null,
        val style : String? = null,
        val confirm : ConfirmObject? = null
) : Element