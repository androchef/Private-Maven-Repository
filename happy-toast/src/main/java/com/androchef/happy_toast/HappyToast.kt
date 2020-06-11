package com.androchef.happy_toast

import android.content.Context
import android.widget.Toast

/**
 * Demonstrating as an example of library.
 */
object HappyToast {

    /**
     * use for short toast.
     */
    fun showShortToast(context : Context,message : String){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
    }

    /**
     * use for long toast.
     */
    fun showLongToast(context : Context,message : String){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show()
    }

}


/**
 * Extensions on String to show toast.
 */
fun String.shortToast(context: Context){
    HappyToast.showShortToast(context,this)
}

fun String.longToast(context: Context){
    HappyToast.showLongToast(context,this)
}