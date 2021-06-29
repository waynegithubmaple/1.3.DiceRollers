package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    //this will not be initialized until Android app has ran the setContentView() method
    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            diceImage = findViewById(R.id.dice_image)
            diceImage2 = findViewById(R.id.dice_image2)
            val btnRoll : Button = findViewById(R.id.roll_button)
            val btnCountUp : Button = findViewById(R.id.countup_button)

            btnRoll.setOnClickListener(){

                rollDice()
            }
    }

    private fun rollDice(){
        val randomInt = (1..6).random()
        val IntArrayx = arrayOf(5)
        val IntCount = 0

        for(i in 1..6){
            if(i == randomInt){

            }
            else{
                IntArrayx.set(IntCount,i)
                IntCount + 1
            }
        }

        var randomInt2 = IntArrayx.random();
        setImage(randomInt)

        val drawableResource = when (randomInt2){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage2.setImageResource(drawableResource)
    }

    private fun setImage(value: Int){
        val drawableResource = when (value){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
}