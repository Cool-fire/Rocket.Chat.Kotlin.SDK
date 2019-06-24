package chat.rocket.core.model.block

import chat.rocket.core.model.block.elements.Element
import com.squareup.moshi.Json
import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class ActionBlock(
        override val type: String,
        @Json(name = "block_id") override val blockId: String,
        var elements : List<Element>
) : Block