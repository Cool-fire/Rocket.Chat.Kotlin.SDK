package chat.rocket.core.internal.rest

import chat.rocket.core.RocketChatClient
import chat.rocket.core.internal.model.InviteEmailPayload
import chat.rocket.core.internal.model.InviteSMSPayload
import com.squareup.moshi.Types
import chat.rocket.common.model.BaseResult
import okhttp3.RequestBody
import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.withContext

suspend fun RocketChatClient.inviteViaEmail(email: String): Boolean = withContext(CommonPool) {
    val payload = InviteEmailPayload(email)
    val adapter = moshi.adapter(InviteEmailPayload::class.java)

    val payloadBody = adapter.toJson(payload)
    val body = RequestBody.create(MEDIA_TYPE_JSON, payloadBody)

    val url = requestUrl(restUrl, "invite.email").build()
    val request = requestBuilderForAuthenticatedMethods(url).post(body).build()

    val result = handleRestCall<BaseResult>(request, BaseResult::class.java).success
    result
}

suspend fun RocketChatClient.inviteViaSMS(phone: String): Boolean = withContext(CommonPool) {
    val payload = InviteSMSPayload(phone)
    val adapter = moshi.adapter(InviteSMSPayload::class.java)

    val payloadBody = adapter.toJson(payload)
    val body = RequestBody.create(MEDIA_TYPE_JSON, payloadBody)

    val url = requestUrl(restUrl, "invite.sms").build()
    val request = requestBuilderForAuthenticatedMethods(url).post(body).build()

    val result = handleRestCall<BaseResult>(request, BaseResult::class.java).success
    result
}