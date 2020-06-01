package com.varma.numbercricket

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_end.*

class EndActivity : AppCompatActivity() {
    override fun onBackPressed() {
        Toast.makeText(applicationContext, "Can't go back from here!", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)

        val Result1 =getSharedPreferences("RunsKeyA", Context.MODE_PRIVATE)
        val Score1 = Result1.getInt("RunsA", 0)

        val Result2 =getSharedPreferences("RunsKeyB", Context.MODE_PRIVATE)
        val Score2 = Result2.getInt("RunsB", 0)

        val var1 =getSharedPreferences("Who", Context.MODE_PRIVATE)
        val var2 = var1.getString("who", "blank")

        val var3 =getSharedPreferences("Who2", Context.MODE_PRIVATE)
        val var4 = var3.getString("who2", "blank")

        val sp3 =getSharedPreferences("OKey", Context.MODE_PRIVATE)
        val turn = sp3.getInt("t",0)

        if (Score1 > Score2)
        {
            tvResult.text="You scored "+Score1.toString()+" runs."
            tvWinner.text="\n\nCongrats! You won the match!"
            tvWinner.setTextColor(Color.parseColor("#4CAF50"))
            }
        else if (Score2 > Score1)
        {
            tvResult.text="It scored "+Score2.toString()+" runs."
            tvWinner.text="\n\nCPU wins! Better luck next match!"

            tvWinner.setTextColor(Color.parseColor("#F62929"))
        }
        else
        {
            tvResult.text=Score2.toString()
            tvWinner.text="It's a draw! Let's try again!"
        }

        btPA.setOnClickListener(){
            val play_again = Intent(this,BetActivity::class.java)
            val spA = getSharedPreferences("RunsKeyA", Context.MODE_PRIVATE)
            val editorA = spA.edit()
            editorA.clear()
            editorA.apply()
            val spB = getSharedPreferences("RunsKeyB", Context.MODE_PRIVATE)
            val editorB = spB.edit()
            editorB.clear()
            editorB.apply()
            startActivity(play_again)
        }


    }
}