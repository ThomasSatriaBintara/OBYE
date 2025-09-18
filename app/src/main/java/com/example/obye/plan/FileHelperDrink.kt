package com.example.obye.plan

import android.content.Context

internal object FileHelperDrink {

    fun writeToFile(fileModel: FileModelDrink, context: Context) {
        context.openFileOutput(fileModel.filename, Context.MODE_PRIVATE).use {
            it.write(fileModel.data?.toByteArray())
        }
    }
    fun readFromFile(context: Context, filename: String): FileModelDrink {
        val fileModel = FileModelDrink()
        fileModel.filename = filename
        fileModel.data = context.openFileInput(filename).bufferedReader().useLines { lines ->
            lines.fold("") { some, text ->
                "$some$text\n"
            }
        }
        return fileModel
    }
}