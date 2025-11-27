package com.example.lab_week_11_b

import android.content.Context
import android.net.Uri
import android.os.Environment
import androidx.core.content.FileProvider
import java.io.File

class FileHelper(private val context: Context) {

    // Generate a URI to access the file
    fun getUriFromFile(file: File): Uri {
        return FileProvider.getUriForFile(
            context,
            "com.example.lab_week_11_b.camera",
            file
        )
    }

    // Get the folder name for pictures
    fun getPicturesFolder(): String = Environment.DIRECTORY_PICTURES

    // Get the folder name for videos
    fun getVideosFolder(): String = Environment.DIRECTORY_MOVIES
}