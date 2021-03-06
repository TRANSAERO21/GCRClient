package com.elseboot3909.gcrclient.repository

import kotlinx.coroutines.flow.MutableStateFlow

class ProgressBarRepository {

    val requestsCounter = MutableStateFlow(0)

    fun acquire() {
        requestsCounter.value++
    }

    fun release() {
        requestsCounter.value--
    }

}