package chat.rocket.core.model.block.elements

import chat.rocket.core.model.block.objects.ConfirmObject
import chat.rocket.core.model.block.objects.TextObject
import com.squareup.moshi.Json

data class ButtonElement(
        override var type: String,
        @Json(name = "action_id") override var actionId: String,
        var text : TextObject,
        var url : String? = null,
        var value : String? = null,
        var style : String? = null,
        var confirm : ConfirmObject? = null
) : Element