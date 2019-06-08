package com.example.workdatabinding

import android.content.Context
import android.widget.Toast

open class EventHandler(context: Context) {
    val myContext: Context = context

    fun onButtonClick(name: String) {
        Toast.makeText(myContext,"hello $name",Toast.LENGTH_SHORT).show()
    }
}