package com.example.dicerollerimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll: Button = findViewById(R.id.btnRoll)
        btnRoll.setOnClickListener { diceRoller() }
    }
    private fun diceRoller()
    {
        //Toast.makeText(this,"Button Clicked", Toast.LENGTH_LONG).show()

        val number = (1..6).random()
        val edtDice: EditText = findViewById(R.id.edtNumber)

        //val txtRollDice: TextView = findViewById(R.id.txtRollDice)
        //txtRollDice.text = number.toString()

        val drawableResource: ImageView = findViewById(R.id.imgRollDice)

        val image = when(number){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

    drawableResource.setImageResource(image)

    if(edtDice.text.toString().trim().isEmpty())
    {
        Toast.makeText(this, "enter a number", Toast.LENGTH_SHORT).show()
    }else{
          if (number == Integer.parseInt(edtDice.text.toString()))
             {
               Toast.makeText(this,"You Win!", Toast.LENGTH_SHORT).show()
             }
         else{
          if (number == Integer.parseInt(edtDice.text.toString()))
          {
               Toast.makeText(this, "You Lose!", Toast.LENGTH_SHORT).show()
          }
        }
    }


    }
}