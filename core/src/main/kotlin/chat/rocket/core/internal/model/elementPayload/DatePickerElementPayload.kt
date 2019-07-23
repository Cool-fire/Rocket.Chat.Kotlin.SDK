package chat.rocket.core.internal.model.elementPayload

import com.squareup.moshi.Json
import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class DatePickerElementPayload(
        override val type: String,
        override val blockId: String?,
        override val actionId: String?,
        @Json(name = "selected_date")
        val selectedDate: String,
        @Json(name = "initial_date")
        val initialDate: String?
): ElementPayload
