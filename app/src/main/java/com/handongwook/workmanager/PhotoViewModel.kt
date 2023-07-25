package com.handongwook.workmanager

import android.graphics.Bitmap
import android.net.Uri
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import timber.log.Timber
import java.util.UUID

class PhotoViewModel: ViewModel() {

    var uncompressedUri: Uri? by mutableStateOf(null)
        private set

    var compressedBitmap: Bitmap? by mutableStateOf(null)
        private set

    var workId: UUID? by mutableStateOf(null)
        private set

    fun updateUncompressUri(uri: Uri?) {
        Timber.e("updateUncompressUri:$uri")
        uncompressedUri = uri
    }

    fun updateCompressedBitmap(bmp: Bitmap?) {
        Timber.e("updateCompressedBitmap:$bmp")
        compressedBitmap = bmp
    }

    fun updateWorkId(uuid: UUID?) {
        Timber.e("updateWorkId:$uuid")
        workId = uuid
    }
}