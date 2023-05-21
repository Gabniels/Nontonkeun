package com.gabniel.data.remote.network

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import javax.inject.Inject

class NetworkInterceptor @Inject constructor(): Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val modified = original.newBuilder()

//        modified.addHeader("Content-Type", "application/json")
//        modified.addHeader("accept", "application/json")
//        modified.addHeader("Connection", "Keep-Alive")
//        modified.addHeader("Accept-Language", "id")
//        modified.addHeader("issuer", "MOBILEAPP")

        modified.method(original.method, original.body)

        val request: Request = modified.build()
        return chain.proceed(request)
    }
}