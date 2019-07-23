package chat.rocket.core.model.block.elements

import chat.rocket.core.model.block.objects.ConfirmObject
import chat.rocket.core.model.block.objects.TextObject
import com.squareup.moshi.Json
import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class DatePickerElement(
        override val type: String,
        @Json(name="action_id")
        val actionId: String,
        val placeholder: TextObject? = null,
        @Json(name="initial_date")
        val initialDate: String? = null,
        val confirm: ConfirmObject? = null
): Element