package com.varma.numbercricket

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.*
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_factor1.*
import kotlinx.android.synthetic.main.activity_factor2.*

class FactorActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factor1)

        np01.minValue=1
        np01.maxValue=10
        np01.wrapSelectorWheel=false


        val cont_button = findViewById<Button>(R.id.bt31)
        cont_button.setOnClickListener(){
            val toast = Toast.makeText(this,np01.value.toString()+" wicket(s) selected",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP,0,500)
            toast.show()
            var wickets : Int = np01.value
            val cont_intent = Intent(this,FactorActivity2::class.java)
            val sp = getSharedPreferences("WKey", Context.MODE_PRIVATE)
            val editor = sp.edit()
            editor.putInt("Value", wickets)
            editor.apply()
            startActivity(cont_intent)

        }


    }
}