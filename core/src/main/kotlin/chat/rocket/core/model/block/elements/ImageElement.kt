package chat.rocket.core.model.block.elements

import com.squareup.moshi.Json

data class ImageElement(
        override val type: String,
        @Json(name = "image_url")
        val imageUrl: String,
        @Json(name = "alt_text")
        val altText: String
): Element