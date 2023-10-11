package com.example.diceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_roll : Button = findViewById(R.id.roll)
        val dice_image : ImageView = findViewById(R.id.imageRoll)
        val dice_list = listOf<Int>(R.drawable.dice_1, R.drawable.dice_2, R.drawable.dice_3,
            R.drawable.dice_4, R.drawable.dice_5, R.drawable.dice_6)

        button_roll.setOnClickListener{
            val controller = controller()
            var nb = controller.roll() -1
            println(nb)
            Toast.makeText(this, "$nb" ,  Toast.LENGTH_SHORT).show()


            dice_image.setImageResource(dice_list[nb ])

        }
    }
}