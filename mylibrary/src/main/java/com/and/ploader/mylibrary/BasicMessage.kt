package com.and.ploader.mylibrary

import android.content.Context
import android.widget.Toast

class BasicMessage {
    companion object{
        fun toastMessage(context:Context, message:String){
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}