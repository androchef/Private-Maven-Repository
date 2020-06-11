package com.androchef.privatemavenrepository

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androchef.happy_toast.HappyToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onClicks()
    }

    private fun onClicks() {
        btnShowLongToast.setOnClickListener {
            //Call library function to show toast.
            HappyToast.showLongToast(this,getString(R.string.show_long_toast))
        }

        btnShowShortToast.setOnClickListener {
            //Call library function to show toast.
            HappyToast.showLongToast(this,getString(R.string.show_short_toast))
        }
    }
}