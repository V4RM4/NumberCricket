package com.varma.numbercricket

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_play1.*
import java.math.BigInteger

class PlayActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play1)

        val sp1 =getSharedPreferences("Key", Context.MODE_PRIVATE)
        val data1 = sp1.getString("value", "")

        val sp2 =getSharedPreferences("WKey", Context.MODE_PRIVATE)
        var data2 = sp2.getInt("Value",0)

        val sp3 =getSharedPreferences("OKey", Context.MODE_PRIVATE)
        val data3 = sp3.getInt("OverValue",0)
        val turn = sp3.getInt("t",0)

        val Result2 =getSharedPreferences("RunsKeyB", Context.MODE_PRIVATE)
        val Score2 = Result2.getInt("RunsB", 0)

        if (data1 == "PlayerBatting")
        {
            val who1 = "Player"
            val spA1 = getSharedPreferences("Who", Context.MODE_PRIVATE)
            val editorA1 = spA1.edit()
            editorA1.putString("who", who1)
            editorA1.apply()
        }
        else
        {
            val who1 = "Player"
            val spA1 = getSharedPreferences("Who", Context.MODE_PRIVATE)
            val editorA1 = spA1.edit()
            editorA1.putString("who", who1)
            editorA1.apply()
        }

        var totalBalls : Int = data3*6

        tv52.text= data2.toString()

        tv54.text = totalBalls.toString()

        var runs : Int = 0

        if(data2 != 0 ||  totalBalls != 0 || runs <= Score2) {


            bt51.setOnClickListener() {

                val cpu_input:Int = (1..6).random()
                cpur.text=cpu_input.toString()
                runs += 1
                totalBalls -= 1
                tv59.text = runs.toString()
                tv54.text = totalBalls.toString()
                if (cpu_input == 1) {
                    data2 -= 1
                    runs -= 1
                    tv59.text = runs.toString()
                    Toast.makeText(applicationContext, "Out!", Toast.LENGTH_SHORT).show()
                    tv52.text = data2.toString()
                    if (data2 <= 0){
                        if (turn == 2 ) {
                            val match2intent = Intent(this, PlayActivity2::class.java)
                            startActivity(match2intent)
                            finish()

                        }
                        else
                        {
                            val match2intent = Intent(this, EndActivity::class.java)
                            startActivity(match2intent)
                            finish()

                        }
                        Toast.makeText(applicationContext, "All Out!, You scored $runs runs!", Toast.LENGTH_SHORT).show()
                    }
                }
                if (totalBalls <= 0) {
                    if (turn == 2) {
                        val match2intent = Intent(this, PlayActivity2::class.java)
                        startActivity(match2intent)
                        finish()

                    }
                    else
                    {
                        val match2intent = Intent(this, EndActivity::class.java)
                        startActivity(match2intent)
                        finish()

                    }
                    Toast.makeText(applicationContext, "Over up!, You scored $runs runs!", Toast.LENGTH_SHORT).show()
                }


                val spA = getSharedPreferences("RunsKeyA", Context.MODE_PRIVATE)
                val editorA = spA.edit()
                editorA.putInt("RunsA", runs)
                editorA.apply()


            }
            bt52.setOnClickListener() {

                val cpu_input:Int = (1..6).random()
                cpur.text=cpu_input.toString()
                runs += 2
                totalBalls -= 1
                tv59.text = runs.toString()
                tv54.text = totalBalls.toString()
                if (cpu_input == 2) {
                    data2 -= 1
                    runs -= 2
                    tv59.text = runs.toString()
                    Toast.makeText(applicationContext, "Out!", Toast.LENGTH_SHORT).show()
                    tv52.text = data2.toString()
                    if (data2 <= 0) {
                        if (turn == 2) {
                            val match2intent = Intent(this, PlayActivity2::class.java)
                            startActivity(match2intent)
                            finish()

                        }
                        else
                        {
                            val match2intent = Intent(this, EndActivity::class.java)
                            startActivity(match2intent)
                            finish()

                        }
                        Toast.makeText(applicationContext, "All Out!, You scored $runs runs!", Toast.LENGTH_SHORT).show()
                    }
                }
                if (totalBalls <= 0) {
                    if (turn == 2) {
                        val match2intent = Intent(this, PlayActivity2::class.java)
                        startActivity(match2intent)
                        finish()

                    }
                    else
                    {
                        val match2intent = Intent(this, EndActivity::class.java)
                        startActivity(match2intent)
                        finish()

                    }
                    Toast.makeText(applicationContext, "Over up!, You scored $runs runs!", Toast.LENGTH_SHORT).show()
                }

                val spA = getSharedPreferences("RunsKeyA", Context.MODE_PRIVATE)
                val editorA = spA.edit()
                editorA.putInt("RunsA", runs)
                editorA.apply()


            }


            bt53.setOnClickListener() {

                val cpu_input:Int = (1..6).random()
                cpur.text=cpu_input.toString()
                runs += 3
                totalBalls -= 1
                tv59.text = runs.toString()
                tv54.text = totalBalls.toString()
                if (cpu_input == 3) {
                    data2 -= 1
                    runs -= 3
                    tv59.text = runs.toString()
                    Toast.makeText(applicationContext, "Out!", Toast.LENGTH_SHORT).show()
                    tv52.text = data2.toString()
                    if (data2 <= 0) {
                        if (turn == 2) {
                            val match2intent = Intent(this, PlayActivity2::class.java)
                            startActivity(match2intent)
                            finish()

                        }
                        else
                        {
                            val match2intent = Intent(this, EndActivity::class.java)
                            startActivity(match2intent)
                            finish()

                        }
                        Toast.makeText(applicationContext, "All Out!, You scored $runs runs!", Toast.LENGTH_SHORT).show()
                    }
                }
                if (totalBalls <= 0) {
                    if (turn == 2) {
                        val match2intent = Intent(this, PlayActivity2::class.java)
                        startActivity(match2intent)
                        finish()

                    }
                    else
                    {
                        val match2intent = Intent(this, EndActivity::class.java)
                        startActivity(match2intent)
                        finish()

                    }
                    Toast.makeText(applicationContext, "Over up!, You scored $runs runs!", Toast.LENGTH_SHORT).show()
                }

                val spA = getSharedPreferences("RunsKeyA", Context.MODE_PRIVATE)
                val editorA = spA.edit()
                editorA.putInt("RunsA", runs)
                editorA.apply()


            }


            bt54.setOnClickListener() {

                val cpu_input:Int = (1..6).random()
                cpur.text=cpu_input.toString()
                runs += 4
                totalBalls -= 1
                tv59.text = runs.toString()
                tv54.text = totalBalls.toString()
                if (cpu_input == 4) {
                    data2 -= 1
                    runs -= 4
                    tv59.text = runs.toString()
                    Toast.makeText(applicationContext, "Out!", Toast.LENGTH_SHORT).show()
                    tv52.text = data2.toString()
                    if (data2 <= 0) {
                        if (turn == 2) {
                            val match2intent = Intent(this, PlayActivity2::class.java)
                            startActivity(match2intent)
                            finish()

                        }
                        else
                        {
                            val match2intent = Intent(this, EndActivity::class.java)
                            startActivity(match2intent)
                            finish()

                        }
                        Toast.makeText(applicationContext, "All Out!, You scored $runs runs!", Toast.LENGTH_SHORT).show()
                    }
                }
                if (totalBalls <= 0) {
                    if (turn == 2) {
                        val match2intent = Intent(this, PlayActivity2::class.java)
                        startActivity(match2intent)
                        finish()

                    }
                    else
                    {
                        val match2intent = Intent(this, EndActivity::class.java)
                        startActivity(match2intent)
                        finish()

                    }
                    Toast.makeText(applicationContext, "Over up!, You scored $runs runs!", Toast.LENGTH_SHORT).show()
                }

                val spA = getSharedPreferences("RunsKeyA", Context.MODE_PRIVATE)
                val editorA = spA.edit()
                editorA.putInt("RunsA", runs)
                editorA.apply()


            }

            bt55.setOnClickListener() {

                val cpu_input:Int = (1..6).random()
                cpur.text=cpu_input.toString()
                runs += 5
                totalBalls -= 1
                tv59.text = runs.toString()
                tv54.text = totalBalls.toString()
                if (cpu_input == 5) {
                    data2 -= 1
                    runs -= 5
                    tv59.text = runs.toString()
                    Toast.makeText(applicationContext, "Out!", Toast.LENGTH_SHORT).show()
                    tv52.text = data2.toString()
                    if (data2 <= 0) {
                        if (turn == 2) {
                            val match2intent = Intent(this, PlayActivity2::class.java)
                            startActivity(match2intent)
                            finish()

                        }
                        else
                        {
                            val match2intent = Intent(this, EndActivity::class.java)
                            startActivity(match2intent)
                            finish()

                        }
                        Toast.makeText(applicationContext, "All Out!, You scored $runs runs!", Toast.LENGTH_SHORT).show()
                    }
                }
                if (totalBalls <= 0) {
                    if (turn == 2) {
                        val match2intent = Intent(this, PlayActivity2::class.java)
                        startActivity(match2intent)
                        finish()

                    }
                    else
                    {
                        val match2intent = Intent(this, EndActivity::class.java)
                        startActivity(match2intent)
                        finish()

                    }
                    Toast.makeText(applicationContext, "Over up!, You scored $runs runs!", Toast.LENGTH_SHORT).show()
                }

                val spA = getSharedPreferences("RunsKeyA", Context.MODE_PRIVATE)
                val editorA = spA.edit()
                editorA.putInt("RunsA", runs)
                editorA.apply()


            }

            bt56.setOnClickListener() {

                val cpu_input:Int = (1..6).random()
                cpur.text=cpu_input.toString()
                runs += 6
                totalBalls -= 1
                tv59.text = runs.toString()
                tv54.text = totalBalls.toString()
                if (cpu_input == 6) {
                    data2 -= 1
                    runs -= 6
                    tv59.text = runs.toString()
                    Toast.makeText(applicationContext, "Out!", Toast.LENGTH_SHORT).show()
                    tv52.text = data2.toString()
                    if (data2 <= 0) {
                        if (turn == 2) {
                            val match2intent = Intent(this, PlayActivity2::class.java)
                            startActivity(match2intent)
                            finish()

                        }
                        else
                        {
                            val match2intent = Intent(this, EndActivity::class.java)
                            startActivity(match2intent)
                            finish()

                        }
                        Toast.makeText(applicationContext, "All Out!, You scored $runs runs!", Toast.LENGTH_SHORT).show()
                    }
                }
                if (totalBalls <= 0) {
                    if (turn == 2) {
                        val match2intent = Intent(this, PlayActivity2::class.java)
                        startActivity(match2intent)
                        finish()

                    }
                    else
                    {
                        val match2intent = Intent(this, EndActivity::class.java)
                        startActivity(match2intent)
                        finish()

                    }
                    Toast.makeText(applicationContext, "Over up!, You scored $runs runs!", Toast.LENGTH_SHORT).show()
                }

                val spA = getSharedPreferences("RunsKeyA", Context.MODE_PRIVATE)
                val editorA = spA.edit()
                editorA.putInt("RunsA", runs)
                editorA.apply()


            }

        }

        else
        {
            if (turn == 2) {
                val match2intent = Intent(this, PlayActivity2::class.java)
                startActivity(match2intent)
                finish()

            }
            else
            {
                val match2intent = Intent(this, EndActivity::class.java)
                startActivity(match2intent)
                finish()

            }
        }


    }
}