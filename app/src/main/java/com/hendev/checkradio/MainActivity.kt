package com.hendev.checkradio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var takim = "Not Sellected"
        val diller = ArrayList<String>();


        button.setOnClickListener {
            if (rb_Fen.isChecked) {
                takim = rb_Fen.text.toString()
            }
            if (rb_Gs.isChecked) {
                takim = rb_Gs.text.toString()
            }

            if (checkBox.isChecked) {
                diller.add(checkBox.text.toString())
            }
            if (checkBox2.isChecked) {
                diller.add(checkBox2.text.toString())
            }
            if (checkBox3.isChecked) {
                diller.add(checkBox3.text.toString())
            }
            if (checkBox4.isChecked) {
                diller.add(checkBox4.text.toString())
            }

            Log.e("Chec 1", checkBox.text.toString())
            Log.e("Chec 2", checkBox2.text.toString())
            Log.e("Chec 3", checkBox3.text.toString())
            Log.e("Chec 4", checkBox4.text.toString())
            Log.e("Bilinen Diller", diller.toString())
            Log.e("Seçilen Takim", takim)
            //log eklendi
        }

        rb_Fen.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(
                this@MainActivity,
                "Takım Fenerbahçe Olarak Değiştirildi.",
                Toast.LENGTH_SHORT
            ).show()
        }

        rb_Gs.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(
                applicationContext,
                "Takım Galatasaray Olarak Değiştirildi.",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}