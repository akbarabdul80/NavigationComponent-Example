package com.zero.myapplication.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataTransfer(
    val data: String,
    val from: String
) : Parcelable
