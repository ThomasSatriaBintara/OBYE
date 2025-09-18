package com.example.obye.plan

import android.content.Context

internal object FileHelperFood {

    fun writeToFile(fileModel: FileModelFood, context: Context) {
        context.openFileOutput(fileModel.filename, Context.MODE_PRIVATE).use {
            it.write(fileModel.data?.toByteArray())
        }
    }
    fun readFromFile(context: Context, filename: String): FileModelFood {
        val fileModel = FileModelFood()
        fileModel.filename = filename
        fileModel.data = context.openFileInput(filename).bufferedReader().useLines { lines ->
            lines.fold("") { some, text ->
                "$some$text\n"
            }
        }
        return fileModel
    }
}