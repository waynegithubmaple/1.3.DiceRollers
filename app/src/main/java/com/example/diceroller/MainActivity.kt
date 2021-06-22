package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val btnRoll : Button = findViewById(R.id.roll_button)
            val btnCountUp : Button = findViewById(R.id.countup_button)

            btnRoll.setOnClickListener(){

                rollDice()
            }

            btnCountUp.setOnClickListener(){
                countUp()
            }


    }

    private fun countUp(){
        val tvResult : TextView = findViewById(R.id.result_txt)
        if(tvResult.text == "Hello World"){
            tvResult.text = "1"
        }else if(tvResult.text == "6"){
        }
        else{
            val intNumber = tvResult.text.toString().toInt()

            tvResult.text = (intNumber + 1).toString()

        }
    }

    private fun rollDice(){
        val randomInt = (1..6).random()
        val tvResult : TextView = findViewById(R.id.result_txt)
        tvResult.text = randomInt.toString()
    }
}