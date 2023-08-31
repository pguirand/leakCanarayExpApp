package com.pierretest.leakcanarayexpapp

import android.graphics.drawable.Drawable
import android.widget.TextView

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.lang.ref.WeakReference

class MainActivity : AppCompatActivity() {

    companion object{
        var textView: TextView? = null
//        var textView: WeakReference<TextView>? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (textView == null){
            textView = TextView(this)
//            textView = WeakReference(TextView(this))
        }


    }

    override fun onDestroy() {
        super.onDestroy()
        textView = null
    }


    fun startNewActivity(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}
