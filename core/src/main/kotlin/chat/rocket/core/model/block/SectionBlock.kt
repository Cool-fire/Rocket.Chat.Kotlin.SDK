package chat.rocket.core.model.block

import chat.rocket.core.model.block.elements.Element
import chat.rocket.core.model.block.objects.TextObject
import com.squareup.moshi.Json

class SectionBlock(
        override var type: String,
        var text : TextObject,
        @Json(name = "block_id") var blockId : String? = null,
        var fields : List<TextObject>? = null,
        var accessory : Element? = null
) : Block