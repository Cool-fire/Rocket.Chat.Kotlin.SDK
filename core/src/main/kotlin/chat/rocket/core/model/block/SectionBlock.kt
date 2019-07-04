package chat.rocket.core.model.block

import chat.rocket.core.model.block.elements.Element
import chat.rocket.core.model.block.objects.TextObject
import com.squareup.moshi.Json
import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class SectionBlock(
        override val type: String,
        var text : TextObject,
        var fields : List<TextObject>? = null,
        var accessory : Element? = null,
        @Json(name="block_id") override val blockId: String? = null
) : Block