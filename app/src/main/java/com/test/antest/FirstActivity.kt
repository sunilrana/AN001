package com.test.antest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.anywhereapps.antest.R

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)


        var button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {

            val intent = Intent(this@FirstActivity,
                SecondActivity::class.java)
            startActivity(intent)
        }


        var button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {

        }

    }
}