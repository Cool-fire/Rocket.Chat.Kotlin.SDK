package chat.rocket.core.model.block
import chat.rocket.core.model.block.elements.Element
import chat.rocket.core.model.block.objects.TextObject

data class Block(
        var type: String? = null,
        var text: TextObject? = null,
        var blockId: String? = null,
        var accessory : Element? = null,
        var elements: List<Element>? = null
)
