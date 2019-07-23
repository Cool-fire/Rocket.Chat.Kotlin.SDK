package chat.rocket.core.internal.model.elementPayload

import com.squareup.moshi.Json
import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class OverflowElementPayload(
        override val type: String,
        override val blockId: String?,
        override val actionId: String?,
        @Json(name = "selected_option")
        val selectedOption: OverflowOptionPayload
): ElementPayload

