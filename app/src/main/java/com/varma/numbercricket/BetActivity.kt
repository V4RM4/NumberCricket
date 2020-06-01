package com.varma.numbercricket

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class BetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bet)

        var bet = "No bets"

        // If the odd bet is placed...

        val odd = findViewById<Button>(R.id.bt11)
        odd.setOnClickListener(){


            val user_random = (1..6).random()
            val cpu_random = (1..6).random()


            if (user_random>cpu_random){
                if (cpu_random % user_random == 0){
                    val cpu_style1 = (1..2).random()
                    if (cpu_style1 == 1){
                        bet = "CPUBatting" //Even wins, the CPU has chosen Batting!
                        val intent = Intent(this,FactorActivity1::class.java)
                        val sharedPref = getSharedPreferences("Key", Context.MODE_PRIVATE)
                        val editor = sharedPref.edit()
                        editor.putString("value", bet)
                        editor.apply()
                        startActivity(intent)
                        Toast.makeText(applicationContext,"CPU wins the toss and chooses Batting!", Toast.LENGTH_LONG).show()
                    }
                    else{
                        bet = "CPUBowling" //Even wins, the CPU has chosen Bowling!
                        val intent = Intent(this,FactorActivity1::class.java)
                        val sharedPref = getSharedPreferences("Key", Context.MODE_PRIVATE)
                        val editor = sharedPref.edit()
                        editor.putString("value", bet)
                        editor.apply()
                        startActivity(intent)
                        Toast.makeText(applicationContext,"CPU wins the toss and chooses Bowling!", Toast.LENGTH_LONG).show()
                    }
                }
                else {
                    bet = "Odd wins, choose your side!"
                    val intent = Intent(this,StyleActivity::class.java)
                    startActivity(intent)
                    Toast.makeText(applicationContext,"You won the toss! Choose your side", Toast.LENGTH_LONG).show()
                }

            }

            else if (cpu_random>user_random){
                if (user_random % cpu_random == 0){
                    val cpu_style2 = (1..2).random()
                    if (cpu_style2 == 1){
                        bet = "CPUBatting" //Even wins, the CPU has chosen Batting!
                        val intent = Intent(this,FactorActivity1::class.java)
                        val sharedPref = getSharedPreferences("Key", Context.MODE_PRIVATE)
                        val editor = sharedPref.edit()
                        editor.putString("value", bet)
                        editor.apply()
                        startActivity(intent)
                        Toast.makeText(applicationContext,"CPU wins the toss and chooses Batting!", Toast.LENGTH_LONG).show()
                    }

                    else{
                        bet = "CPUBowling"  //Even wins, the CPU has chosen Bowling!
                        val intent = Intent(this,FactorActivity1::class.java)
                        val sharedPref = getSharedPreferences("Key", Context.MODE_PRIVATE)
                        val editor = sharedPref.edit()
                        editor.putString("value", bet)
                        editor.apply()
                        startActivity(intent)
                        Toast.makeText(applicationContext,"CPU wins the toss and chooses Bowling!", Toast.LENGTH_LONG).show()
                    }

                }
                else{
                    bet = "Odd wins, choose your side!"
                    val intent = Intent(this,StyleActivity::class.java)
                    startActivity(intent)
                    Toast.makeText(applicationContext,"You won the toss! Choose your side", Toast.LENGTH_LONG).show()
                }
            }

            else{
                val cpu_style3 = (1..2).random()
                if (cpu_style3 == 1){
                    bet = "CPUBatting"  //Even wins, the CPU has chosen Batting!
                    val intent = Intent(this,FactorActivity1::class.java)
                    val sharedPref = getSharedPreferences("Key", Context.MODE_PRIVATE)
                    val editor = sharedPref.edit()
                    editor.putString("value", bet)
                    editor.apply()
                    startActivity(intent)
                    Toast.makeText(applicationContext,"CPU wins the toss and chooses Batting!", Toast.LENGTH_LONG).show()
                }

                else{
                    bet = "CPUBowling"  //Even wins, the CPU has chosen Bowling!
                    val intent = Intent(this,FactorActivity1::class.java)
                    val sharedPref = getSharedPreferences("Key", Context.MODE_PRIVATE)
                    val editor = sharedPref.edit()
                    editor.putString("value", bet)
                    editor.apply()
                    startActivity(intent)
                    Toast.makeText(applicationContext,"CPU wins the toss and chooses Bowling!", Toast.LENGTH_LONG).show()
                }
            }
        }


        // If the even bet is placed...


        val even = findViewById<Button>(R.id.bt12)
        even.setOnClickListener(){

            val user_random = (1..6).random()
            val cpu_random = (1..6).random()

            if (user_random>cpu_random){
                if (cpu_random % user_random == 0){
                    val cpu_style1 = (1..2).random()
                    if (cpu_style1 == 1){
                        bet = "Even wins, choose your side!"
                        val intent = Intent(this,StyleActivity::class.java)
                        startActivity(intent)
                        Toast.makeText(applicationContext,"You won the toss! Choose your side", Toast.LENGTH_LONG).show()
                    }
                    else{
                        bet = "Even wins, choose your side!"
                        val intent = Intent(this,StyleActivity::class.java)
                        startActivity(intent)
                        Toast.makeText(applicationContext,"You won the toss! Choose your side", Toast.LENGTH_LONG).show()
                    }
                }
                else {
                    bet = "CPUBowling"  //Odd wins, the CPU has chosen Bowling!
                    val intent = Intent(this,FactorActivity1::class.java)
                    val sharedPref = getSharedPreferences("Key", Context.MODE_PRIVATE)
                    val editor = sharedPref.edit()
                    editor.putString("value", bet)
                    editor.apply()
                    startActivity(intent)
                    Toast.makeText(applicationContext,"CPU wins the toss and chooses Bowling!", Toast.LENGTH_LONG).show()
                }

            }

            else if (cpu_random>user_random){
                if (user_random % cpu_random == 0){
                    val cpu_style2 = (1..2).random()
                    if (cpu_style2 == 1){
                        bet = "Even wins, choose your side!"
                        val intent = Intent(this,StyleActivity::class.java)
                        startActivity(intent)
                        Toast.makeText(applicationContext,"You won the toss! Choose your side", Toast.LENGTH_LONG).show()
                    }

                    else{
                        bet = "Even wins, choose your side!"
                        val intent = Intent(this,StyleActivity::class.java)
                        startActivity(intent)
                        Toast.makeText(applicationContext,"You won the toss! Choose your side", Toast.LENGTH_LONG).show()
                    }

                }
                else{
                    bet = "CPUBowling"  //Odd wins, the CPU has chosen Bowling!
                    val intent = Intent(this,FactorActivity1::class.java)
                    val sharedPref = getSharedPreferences("Key", Context.MODE_PRIVATE)
                    val editor = sharedPref.edit()
                    editor.putString("value", bet)
                    editor.apply()
                    startActivity(intent)
                    Toast.makeText(applicationContext,"CPU wins the toss and chooses Bowling!", Toast.LENGTH_LONG).show()
                }
            }

            else{
                val cpu_style3 = (1..2).random()
                if (cpu_style3 == 1){
                    bet = "Even wins, choose your side!"
                    val intent = Intent(this,StyleActivity::class.java)
                    startActivity(intent)
                    Toast.makeText(applicationContext,"You won the toss! Choose your side", Toast.LENGTH_LONG).show()
                }

                else{
                    bet = "Even wins, choose your side!"
                    val intent = Intent(this,StyleActivity::class.java)
                    startActivity(intent)
                    Toast.makeText(applicationContext,"You won the toss! Choose your side", Toast.LENGTH_LONG).show()
                }
            }
        }


    }
}