package com.varma.numbercricket

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_play1.*
import kotlinx.android.synthetic.main.activity_play2.*

class PlayActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play2)

        val sp1 =getSharedPreferences("Key", Context.MODE_PRIVATE)
        val data1 = sp1.getString("value", "")

        val sp2 =getSharedPreferences("WKey", Context.MODE_PRIVATE)
        var data2 = sp2.getInt("Value",0)

        val sp3 =getSharedPreferences("OKey", Context.MODE_PRIVATE)
        val data3 = sp3.getInt("OverValue",0)
        val turn = sp3.getInt("t",0)

        val Result1 =getSharedPreferences("RunsKeyA", Context.MODE_PRIVATE)
        val Score1 = Result1.getInt("RunsA", 0)

        if (data1 == "CPUBatting")
        {
            tv611.text="CPU Batting"
            var who2 = "CPU"
            val spB1 = getSharedPreferences("Who2", Context.MODE_PRIVATE)
            val editorB1 = spB1.edit()
            editorB1.putString("who2", who2)
            editorB1.apply()
        }

        else
        {
            tv611.text="CPU Batting"
            var who2 = "CPU"
            val spB1 = getSharedPreferences("Who2", Context.MODE_PRIVATE)
            val editorB1 = spB1.edit()
            editorB1.putString("who2", who2)
            editorB1.apply()
        }

        var totalBalls : Int = data3*6

        tv62.text= data2.toString()

        tv64.text = totalBalls.toString()

        var runs : Int = 0

        if(data2 != 0 ||  totalBalls != 0 || runs <= Score1) {


            bt61.setOnClickListener() {

                val cpu_input:Int = (1..6).random()
                tv69.text="1"
                Toast.makeText(applicationContext, "CPU plays " + cpu_input.toString(), Toast.LENGTH_SHORT).show()
                runs += cpu_input
                totalBalls -= 1
                cpur1.text = runs.toString()
                tv64.text = totalBalls.toString()
                if (cpu_input == 1) {
                    data2 -= 1
                    runs -= cpu_input
                    cpur1.text = runs.toString()
                    Toast.makeText(applicationContext, "Out!", Toast.LENGTH_SHORT).show()
                    tv62.text = data2.toString()
                    if (data2 <= 0) {
                        if (turn == 1) {
                            val match2intent = Intent(this, PlayActivity1::class.java)
                            startActivity(match2intent)
                        }
                        else
                        {
                            val match2intent = Intent(this, EndActivity::class.java)
                            startActivity(match2intent)
                        }
                        Toast.makeText(applicationContext, "All Out!, CPU scored $runs runs!", Toast.LENGTH_SHORT).show()
                    }
                }
                if (totalBalls <= 0) {
                    if (turn == 1) {
                        val match2intent = Intent(this, PlayActivity1::class.java)
                        startActivity(match2intent)
                    }
                    else
                    {
                        val match2intent = Intent(this, EndActivity::class.java)
                        startActivity(match2intent)
                    }
                    Toast.makeText(applicationContext, "Over up!, CPU scored $runs runs!", Toast.LENGTH_SHORT).show()
                }

                val spB = getSharedPreferences("RunsKeyB", Context.MODE_PRIVATE)
                val editorB = spB.edit()
                editorB.putInt("RunsB", runs)
                editorB.apply()


            }
            bt62.setOnClickListener() {

                tv69.text="2"
                val cpu_input:Int = (1..6).random()
                Toast.makeText(applicationContext, "CPU plays " + cpu_input.toString(), Toast.LENGTH_SHORT).show()
                runs += cpu_input
                totalBalls -= 1
                cpur1.text = runs.toString()
                tv64.text = totalBalls.toString()
                if (cpu_input == 2) {
                    data2 -= 1
                    runs -= cpu_input
                    cpur1.text = runs.toString()
                    Toast.makeText(applicationContext, "Out!", Toast.LENGTH_SHORT).show()
                    tv62.text = data2.toString()
                    if (data2 <= 0) {
                        if (turn == 1) {
                            val match2intent = Intent(this, PlayActivity1::class.java)
                            startActivity(match2intent)
                        }
                        else
                        {
                            val match2intent = Intent(this, EndActivity::class.java)
                            startActivity(match2intent)
                        }
                        Toast.makeText(applicationContext, "All Out!, CPU scored $runs runs!", Toast.LENGTH_SHORT).show()
                    }
                }
                if (totalBalls <= 0) {
                    if (turn == 1) {
                        val match2intent = Intent(this, PlayActivity1::class.java)
                        startActivity(match2intent)
                    }
                    else
                    {
                        val match2intent = Intent(this, EndActivity::class.java)
                        startActivity(match2intent)
                    }
                    Toast.makeText(applicationContext, "Over up!, CPU scored $runs runs!", Toast.LENGTH_SHORT).show()
                }

                val spB = getSharedPreferences("RunsKeyB", Context.MODE_PRIVATE)
                val editorB = spB.edit()
                editorB.putInt("RunsB", runs)
                editorB.apply()


            }


            bt63.setOnClickListener() {

                tv69.text="3"
                val cpu_input:Int = (1..6).random()
                Toast.makeText(applicationContext, "CPU plays " + cpu_input.toString(), Toast.LENGTH_SHORT).show()
                runs += cpu_input
                totalBalls -= 1
                cpur1.text = runs.toString()
                tv64.text = totalBalls.toString()
                if (cpu_input == 3) {
                    data2 -= 1
                    runs -= cpu_input
                    cpur1.text = runs.toString()
                    Toast.makeText(applicationContext, "Out!", Toast.LENGTH_SHORT).show()
                    tv62.text = data2.toString()
                    if (data2 <= 0) {
                        if (turn == 1) {
                            val match2intent = Intent(this, PlayActivity1::class.java)
                            startActivity(match2intent)
                        }
                        else
                        {
                            val match2intent = Intent(this, EndActivity::class.java)
                            startActivity(match2intent)
                        }
                        Toast.makeText(applicationContext, "All Out!, CPU scored $runs runs!", Toast.LENGTH_SHORT).show()
                    }
                }
                if (totalBalls <= 0) {
                    if (turn == 1) {
                        val match2intent = Intent(this, PlayActivity1::class.java)
                        startActivity(match2intent)
                    }
                    else
                    {
                        val match2intent = Intent(this, EndActivity::class.java)
                        startActivity(match2intent)
                    }
                    Toast.makeText(applicationContext, "Over up!, CPU scored $runs runs!", Toast.LENGTH_SHORT).show()
                }

                val spB = getSharedPreferences("RunsKeyB", Context.MODE_PRIVATE)
                val editorB = spB.edit()
                editorB.putInt("RunsB", runs)
                editorB.apply()


            }


            bt64.setOnClickListener() {

                tv69.text="4"
                val cpu_input:Int = (1..6).random()
                Toast.makeText(applicationContext, "CPU plays " + cpu_input.toString(), Toast.LENGTH_SHORT).show()
                runs += cpu_input
                totalBalls -= 1
                cpur1.text = runs.toString()
                tv64.text = totalBalls.toString()
                if (cpu_input == 4) {
                    data2 -= 1
                    runs -= cpu_input
                    cpur1.text = runs.toString()
                    Toast.makeText(applicationContext, "Out!", Toast.LENGTH_SHORT).show()
                    tv62.text = data2.toString()
                    if (data2 <= 0) {
                        if (turn == 1) {
                            val match2intent = Intent(this, PlayActivity1::class.java)
                            startActivity(match2intent)
                        }
                        else
                        {
                            val match2intent = Intent(this, EndActivity::class.java)
                            startActivity(match2intent)
                        }
                        Toast.makeText(applicationContext, "All Out!, CPU scored $runs runs!", Toast.LENGTH_SHORT).show()
                    }
                }
                if (totalBalls <= 0) {
                    if (turn == 1) {
                        val match2intent = Intent(this, PlayActivity1::class.java)
                        startActivity(match2intent)
                    }
                    else
                    {
                        val match2intent = Intent(this, EndActivity::class.java)
                        startActivity(match2intent)
                    }
                    Toast.makeText(applicationContext, "Over up!, CPU scored $runs runs!", Toast.LENGTH_SHORT).show()
                }

                val spB = getSharedPreferences("RunsKeyB", Context.MODE_PRIVATE)
                val editorB = spB.edit()
                editorB.putInt("RunsB", runs)
                editorB.apply()


            }

            bt65.setOnClickListener() {

                tv69.text="5"
                val cpu_input:Int = (1..6).random()
                Toast.makeText(applicationContext, "CPU plays " + cpu_input.toString(), Toast.LENGTH_SHORT).show()
                runs += cpu_input
                totalBalls -= 1
                cpur1.text = runs.toString()
                tv64.text = totalBalls.toString()
                if (cpu_input == 5) {
                    data2 -= 1
                    runs -= cpu_input
                    cpur1.text = runs.toString()
                    Toast.makeText(applicationContext, "Out!", Toast.LENGTH_SHORT).show()
                    tv62.text = data2.toString()
                    if (data2 <= 0) {
                        if (turn == 1) {
                            val match2intent = Intent(this, PlayActivity1::class.java)
                            startActivity(match2intent)
                        }
                        else
                        {
                            val match2intent = Intent(this, EndActivity::class.java)
                            startActivity(match2intent)
                        }
                        Toast.makeText(applicationContext, "All Out!, CPU scored $runs runs!", Toast.LENGTH_SHORT).show()
                    }
                }
                if (totalBalls <= 0) {
                    if (turn == 1) {
                        val match2intent = Intent(this, PlayActivity1::class.java)
                        startActivity(match2intent)
                    }
                    else
                    {
                        val match2intent = Intent(this, EndActivity::class.java)
                        startActivity(match2intent)
                    }
                    Toast.makeText(applicationContext, "Over up!, CPU scored $runs runs!", Toast.LENGTH_SHORT).show()
                }

                val spB = getSharedPreferences("RunsKeyB", Context.MODE_PRIVATE)
                val editorB = spB.edit()
                editorB.putInt("RunsB", runs)
                editorB.apply()


            }

            bt66.setOnClickListener() {

                tv69.text="6"
                val cpu_input:Int = (1..6).random()
                Toast.makeText(applicationContext, "CPU plays " + cpu_input.toString(), Toast.LENGTH_SHORT).show()
                runs += cpu_input
                totalBalls -= 1
                cpur1.text = runs.toString()
                tv64.text = totalBalls.toString()
                if (cpu_input == 6) {
                    data2 -= 1
                    runs -= cpu_input
                    cpur1.text = runs.toString()
                    Toast.makeText(applicationContext, "Out!", Toast.LENGTH_SHORT).show()
                    tv62.text = data2.toString()
                    if (data2 <= 0) {
                        if (turn == 1) {
                            val match2intent = Intent(this, PlayActivity1::class.java)
                            startActivity(match2intent)
                        }
                        else
                        {
                            val match2intent = Intent(this, EndActivity::class.java)
                            startActivity(match2intent)
                        }
                        Toast.makeText(applicationContext, "All Out!, CPU scored $runs runs!", Toast.LENGTH_SHORT).show()
                    }
                }
                if (totalBalls <= 0) {
                    if (turn == 1) {
                        val match2intent = Intent(this, PlayActivity1::class.java)
                        startActivity(match2intent)
                    }
                    else
                    {
                        val match2intent = Intent(this, EndActivity::class.java)
                        startActivity(match2intent)
                    }
                    Toast.makeText(applicationContext, "Over up!, CPU scored $runs runs!", Toast.LENGTH_SHORT).show()
                }

                val spB = getSharedPreferences("RunsKeyB", Context.MODE_PRIVATE)
                val editorB = spB.edit()
                editorB.putInt("RunsB", runs)
                editorB.apply()


            }

        }

        else
        {
            if (turn == 1) {
                val match2intent = Intent(this, PlayActivity1::class.java)
                startActivity(match2intent)
            }
            else
            {
                val match2intent = Intent(this, EndActivity::class.java)
                startActivity(match2intent)
            }
        }


    }
}