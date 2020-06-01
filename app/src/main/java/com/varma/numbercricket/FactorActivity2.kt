package com.varma.numbercricket

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_factor1.*
import kotlinx.android.synthetic.main.activity_factor2.*

class FactorActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factor2)

        val sp1 =getSharedPreferences("Key", Context.MODE_PRIVATE)
        val data1 = sp1.getString("value", "")

            np11.minValue = 1
            np11.maxValue = 50
            np11.wrapSelectorWheel = false

            val cont_button2 = findViewById<Button>(R.id.bt41)
            cont_button2.setOnClickListener() {

                var overs: Int = np11.value
                if (data1 == "CPUBatting" || data1 == "PlayerBowling")
                {
                    val sharedpref = getSharedPreferences("OKey", Context.MODE_PRIVATE)
                    val editor = sharedpref.edit()
                    editor.putInt("OverValue", overs)
                    editor.putInt("t",1)
                    editor.apply()
                    val cont_intent2 = Intent(this, PlayActivity2::class.java)
                    startActivity(cont_intent2)
                    val toast = Toast.makeText(this,np11.value.toString()+" overs(s) selected\n\n  You are bowling!",Toast.LENGTH_SHORT)
                    toast.setGravity(Gravity.TOP,0,350)
                    toast.show()
                }
                else {
                    val sharedpref = getSharedPreferences("OKey", Context.MODE_PRIVATE)
                    val editor = sharedpref.edit()
                    editor.putInt("OverValue", overs)
                    editor.putInt("t",2)
                    editor.apply()
                    val cont_intent2 = Intent(this, PlayActivity1::class.java)
                    startActivity(cont_intent2)
                    val toast = Toast.makeText(this,np11.value.toString()+" overs(s) selected\n  You are batting!",Toast.LENGTH_SHORT)
                    toast.setGravity(Gravity.TOP,0,350)
                    toast.show()
                }
            }
    }
}