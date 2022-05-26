package com.elseboot3909.gcrclient.entity

data class FileInfo(
    val lines_inserted: Int = 0,
    val lines_deleted: Int = 0,
    val status: String = "M",
    val binary: Boolean = false,
    val size: Int = 0
)