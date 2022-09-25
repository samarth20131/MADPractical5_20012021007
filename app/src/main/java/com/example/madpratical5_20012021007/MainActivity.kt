package com.example.madpratical5_20012021007

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.madpractical5_20012021007.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
//    using explicit Intent we start/stop service
    fun play(view: View){
        Intent(applicationContext,MyService::class.java)
            .putExtra(MyService.DATA_KEY,MyService.DATA_VALUE)
            .apply { startService(this) }
        Toast.makeText(this, "Play is clicked", Toast.LENGTH_LONG).show()
    }

    fun stop(view:View){
        Intent(applicationContext,MyService::class.java)
            .apply { stopService(this) }
        Toast.makeText(this, "Pause is clicked", Toast.LENGTH_LONG).show()
    }
}