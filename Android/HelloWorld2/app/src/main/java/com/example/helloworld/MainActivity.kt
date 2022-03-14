package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button = findViewById(R.id.button)

        button.setOnClickListener { sendMessage(button) }
    }

    fun sendMessage(view : View){
        //Do something.
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)

    }

    override fun onResume() {
        super.onResume()
    }

    override fun onStop(){
        super.onStop()
        Toast.makeText(this, "onPause got called!", Toast.LENGTH_LONG).show()
    }

    override fun onPause(){
        super.onPause()
        Toast.makeText(this, "onStop got called!", Toast.LENGTH_LONG).show()
    }

}

