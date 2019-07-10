package chat.rocket.core.internal.model.elementPayload

interface ElementPayload {
    val type : String
    val blockId : String?
    val actionId : String?
}