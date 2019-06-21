package chat.rocket.core.model.block.objects

data class ConfirmObject(
        val title : TextObject,
        val text : TextObject,
        val confirm : TextObject,
        val deny : TextObject
)