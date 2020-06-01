package com.varma.numbercricket

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start = findViewById<Button>(R.id.bt01)
        start.setOnClickListener(){
            val home = Intent(this,BetActivity::class.java)
            val spA = getSharedPreferences("RunsKeyA", Context.MODE_PRIVATE)
            val editorA = spA.edit()
            editorA.clear()
            editorA.apply()
            val spB = getSharedPreferences("RunsKeyB", Context.MODE_PRIVATE)
            val editorB = spB.edit()
            editorB.clear()
            editorB.apply()
            startActivity(home)
        }

        tvAbout.setOnClickListener(){

            val about_intent = Intent(this,AboutActivity::class.java)
            startActivity(about_intent)

        }

    }
}
