package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll:Button = findViewById(R.id.roll_button)
      //  roll.text = "Lets Roll"
        roll.setOnClickListener { //Toast.makeText(this , "Roll Clicked" , Toast.LENGTH_SHORT).show()
            showbutton()
        }
    }

    private fun showbutton() {

        val result = Random.nextInt(6)+1
       val randomelement =when(result)
           {
           1 -> R.drawable.dice_1
           2 -> R.drawable.dice_2
           3 -> R.drawable.dice_3
           4 -> R.drawable.dice_4
           5 -> R.drawable.dice_5
           else -> R.drawable.dice_6
           }
        val diceimage :ImageView = findViewById(R.id.dice_image)
        diceimage.setImageResource( randomelement)
    }

}