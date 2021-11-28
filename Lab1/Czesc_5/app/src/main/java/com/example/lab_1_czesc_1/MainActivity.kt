package com.example.lab_1_czesc_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.BoringLayout.make
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceImage : ImageView = findViewById(R.id.dice_image)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }


        //rollButton.setOnClickListener { view ->
        //    Snackbar.make(view, "This FAB needs an action!", Snackbar.LENGTH_LONG)
        //        .setAction("Action", null).show()
        //}
    }



    private fun rollDice() {
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()

        val randomInt = (1..6).random()

        val diceImage : ImageView = findViewById(R.id.dice_image)

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}