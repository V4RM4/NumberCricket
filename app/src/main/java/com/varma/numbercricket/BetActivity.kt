package com.varma.numbercricket

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_bet.*

class BetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bet)

        var bet : String

        // If the odd bet is placed by the user...

        val odd = findViewById<Button>(R.id.bt11)
        odd.setOnClickListener() {


            val user_random = (1..6).random()
            val cpu_random = (1..6).random()
            val toss = user_random+cpu_random
            cputoss.text = cpu_random.toString()
            playertoss.text = user_random.toString()

            if (toss % 2 != 0) {
                val intent = Intent(this, StyleActivity::class.java)
                startActivity(intent)
                val toast = Toast.makeText(this, "You won the toss! Choose your side", Toast.LENGTH_SHORT)
                toast.setGravity(Gravity.TOP, 0, 800)
                toast.show()
            }

            else if (toss % 2 == 0)
            {
                val cpu_style1 = (1..2).random()
                if (cpu_style1 == 1) {
                    bet = "CPUBatting" //Even wins, the CPU has chosen Batting!
                    val intent = Intent(this, FactorActivity1::class.java)
                    val sharedPref = getSharedPreferences("Key", Context.MODE_PRIVATE)
                    val editor = sharedPref.edit()
                    editor.putString("value", bet)
                    editor.apply()
                    startActivity(intent)
                    val toast = Toast.makeText(this, "CPU wins the toss and chooses Batting!", Toast.LENGTH_SHORT)
                    toast.setGravity(Gravity.TOP, 0, 800)
                    toast.show()
                } else {
                    bet = "CPUBowling" //Even wins, the CPU has chosen Bowling!
                    val intent = Intent(this, FactorActivity1::class.java)
                    val sharedPref = getSharedPreferences("Key", Context.MODE_PRIVATE)
                    val editor = sharedPref.edit()
                    editor.putString("value", bet)
                    editor.apply()
                    startActivity(intent)
                    val toast = Toast.makeText(this, "CPU wins the toss and chooses Bowling!", Toast.LENGTH_SHORT)
                    toast.setGravity(Gravity.TOP, 0, 800)
                    toast.show()

                }
            }
                else
                {
                    val toast = Toast.makeText(this, "Toss is draw, let's go again!", Toast.LENGTH_SHORT)
                    toast.setGravity(Gravity.TOP, 0, 800)
                    toast.show()
                }
            }


            val even = findViewById<Button>(R.id.bt12)
            even.setOnClickListener() {


                val user_random = (1..6).random()
                val cpu_random = (1..6).random()
                val toss = user_random+cpu_random
                cputoss.text = cpu_random.toString()
                playertoss.text = user_random.toString()

                if (toss % 2 == 0) {
                    val intent = Intent(this, StyleActivity::class.java)
                    startActivity(intent)
                    val toast = Toast.makeText(
                        this,
                        "You won the toss! Choose your side",
                        Toast.LENGTH_SHORT
                    )
                    toast.setGravity(Gravity.TOP, 0, 800)
                    toast.show()
                }
                else if (toss % 2 != 0)
                {
                    val cpu_style1 = (1..2).random()
                    if (cpu_style1 == 1) {
                        bet = "CPUBatting" //Even wins, the CPU has chosen Batting!
                        val intent = Intent(this, FactorActivity1::class.java)
                        val sharedPref = getSharedPreferences("Key", Context.MODE_PRIVATE)
                        val editor = sharedPref.edit()
                        editor.putString("value", bet)
                        editor.apply()
                        startActivity(intent)
                        val toast = Toast.makeText(this, "CPU wins the toss and chooses Batting!", Toast.LENGTH_SHORT)
                        toast.setGravity(Gravity.TOP, 0, 800)
                        toast.show()
                    }
                    else
                    {
                        bet = "CPUBowling" //Even wins, the CPU has chosen Bowling!
                        val intent = Intent(this, FactorActivity1::class.java)
                        val sharedPref = getSharedPreferences("Key", Context.MODE_PRIVATE)
                        val editor = sharedPref.edit()
                        editor.putString("value", bet)
                        editor.apply()
                        startActivity(intent)
                        val toast = Toast.makeText(this, "CPU wins the toss and chooses Bowling!", Toast.LENGTH_SHORT)
                        toast.setGravity(Gravity.TOP, 0, 800)
                        toast.show()

                    }
                }

                else
                {
                    val toast = Toast.makeText(this, "Toss is draw, let's go again!", Toast.LENGTH_SHORT)
                    toast.setGravity(Gravity.TOP, 0, 800)
                    toast.show()
                }


            }
        }
    }
