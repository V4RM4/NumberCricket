package com.varma.numbercricket

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_end.*

class EndActivity : AppCompatActivity() {
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
            tvResult.text=Score1.toString()
            tvWinner.text="Congrats! You won the match!"
            }
        else if (Score2 > Score1)
        {
            tvResult.text=Score2.toString()
            tvWinner.text="CPU wins! Better luck next match!"
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