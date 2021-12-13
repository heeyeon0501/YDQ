package com.example.YDQ

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //removing the top bar of the screen
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        //event when the let's go button is clicked
        val btn_start = findViewById<Button>(R.id.btn_start)
        btn_start.setOnClickListener{

            val et_name = findViewById<TextView>(R.id.et_name)
            if(et_name.text.toString().isEmpty()){
                //place a toast message if user doesn't enter a name
                Toast.makeText(this, "Please enter your name!", Toast.LENGTH_SHORT).show()
            }else{
                //move to next activity if the user entered a name
                val intent = Intent(this, QuizQuestionActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}