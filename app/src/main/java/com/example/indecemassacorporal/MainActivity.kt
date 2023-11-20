package com.example.indecemassacorporal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    lateinit var radio_btn_IMC : RadioButton
    lateinit var radio_btn_conversor : RadioButton
    lateinit var radio_btn_closeapk : RadioButton
    lateinit var btnexecutar : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radio_btn_IMC = findViewById(R.id.imcbutton)
        radio_btn_conversor = findViewById(R.id.Conversordivisas)
        radio_btn_closeapk = findViewById(R.id.sairdaaplicacao)
        btnexecutar = findViewById(R.id.btnexecutar)

        btnexecutar.setOnClickListener {
            if(radio_btn_IMC.isChecked){
                val intent = Intent(this@MainActivity, IMCActivity::class.java)
                startActivity(intent)
            }
            if(radio_btn_conversor.isChecked){
                val intent = Intent(this@MainActivity, ConversorActivity::class.java)
                startActivity(intent)
            }
            if(radio_btn_closeapk.isChecked){
                finishAffinity()
            }
        }
    }


}