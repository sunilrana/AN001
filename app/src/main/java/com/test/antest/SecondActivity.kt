package com.test.antest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.anywhereapps.antest.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var text1 = findViewById<TextView>(R.id.clic_Me)
        text1.setOnClickListener {

            val intent = Intent(this@SecondActivity, ThirdActivity::class.java)
            startActivity(intent)
        }

        var input1EditText = findViewById<EditText>(R.id.input1)
        var input2EditText = findViewById<EditText>(R.id.input2)
        var ok_button = findViewById<Button>(R.id.ok_button)
        var resultText = findViewById<TextView>(R.id.result_text)


        ok_button.setOnClickListener {

            var result = input1EditText.text.toString().toInt()  + input2EditText.text.toString().toInt()
            resultText.setText(result.toString())
        }

    }
}