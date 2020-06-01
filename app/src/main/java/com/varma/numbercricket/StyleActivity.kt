package com.varma.numbercricket

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_factor1.*

class StyleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_style)

        val batting_button = findViewById<Button>(R.id.bt21)
        val bowling_button = findViewById<Button>(R.id.bt22)

        batting_button.setOnClickListener(){
            val bat_intent = Intent(applicationContext,FactorActivity1::class.java)
            var bet = "PlayerBatting"
            val sharedPref = getSharedPreferences("Key", Context.MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.putString("value", bet)
            editor.apply()
            startActivity(bat_intent)
            val toast = Toast.makeText(this,"You've picked batting!",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP,0,1000)
            toast.show()
        }

        bowling_button.setOnClickListener(){
            val bowl_intent = Intent(applicationContext,FactorActivity1::class.java)
            var bet = "PlayerBowling"
            val sharedPref = getSharedPreferences("Key", Context.MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.putString("value", bet)
            editor.apply()
            startActivity(bowl_intent)
            val toast = Toast.makeText(this,"You've picked bowling!",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP,0,1000)
            toast.show()
        }
    }
}