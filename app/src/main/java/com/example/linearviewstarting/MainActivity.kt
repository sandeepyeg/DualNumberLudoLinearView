package com.example.linearviewstarting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val leftView:TextView = findViewById(R.id.leftTextView)
        val rightView:TextView = findViewById(R.id.rightTextView)
        val getButton:Button = findViewById(R.id.getNumbers)

        fun getRandomNumber():Int =   Random.nextInt(1, 7)

        getButton.setOnClickListener{
            val valueForLeft = getRandomNumber()
            val valueForRight = getRandomNumber()

            val convertRight:String = valueForRight.toString()
            val convertLeft:String = valueForLeft.toString()

            leftView.setText(convertLeft)
            rightView.setText(convertRight)



        }


    }
}