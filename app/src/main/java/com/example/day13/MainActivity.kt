package com.example.day13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

     companion object{
         const val KEY = "package com.example.day13.MainActivity.KEY"
     }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOrder = findViewById<Button>(R.id.buttonOrder)

        btnOrder.setOnClickListener{
            val orderPlaced = edt1.text.toString() + " " + edt2.text.toString() + " "+
                    edt3.text.toString() + " " + edt4.text.toString()

            intent = Intent(this, Order::class.java)
            intent.putExtra(KEY, orderPlaced)
            startActivity(intent)
        }
    }
}