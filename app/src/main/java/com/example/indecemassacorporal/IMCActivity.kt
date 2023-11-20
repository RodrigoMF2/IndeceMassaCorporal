package com.example.indecemassacorporal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class IMCActivity : AppCompatActivity() {
    lateinit var btn_rad_male: RadioButton
    lateinit var btn_rad_female: RadioButton
    lateinit var peso: EditText
    lateinit var altura: EditText
    lateinit var resultado: TextView
    lateinit var btncalcular: Button
    lateinit var btnvoltar: Button
    lateinit var btndelete: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imcactivity)
        peso = findViewById(R.id.inserir_peso)
        altura = findViewById(R.id.inserir_altura)
        resultado = findViewById(R.id.resultado)
        btncalcular = findViewById(R.id.btncalcular)
        btnvoltar = findViewById(R.id.btngoback)
        btn_rad_male = findViewById(R.id.malebutton)
        btn_rad_female = findViewById(R.id.femalebutton)
        btndelete = findViewById(R.id.btndelete)

        btnvoltar.setOnClickListener {
            var intent = Intent(this@IMCActivity, MainActivity::class.java)
            startActivity(intent)
        }

        btncalcular.setOnClickListener {
            var peso = peso.text.toString().toDouble()
            var altura = altura.text.toString().toDouble()
            var imc = peso / (altura * altura)

            if (btn_rad_male.isChecked) {
                if (imc < 20.7) {
                    resultado.text = "Abaixo do peso"
                } else if (imc >= 20.7 && imc <= 26.4) {
                    resultado.text = "Peso normal"
                } else if (imc > 26.4 && imc <= 27.8) {
                    resultado.text = "Marginalmente acima do peso"
                } else if (imc > 27.8 && imc <= 31.1) {
                    resultado.text = "Acima do peso"
                } else if (imc > 31.1) {
                    resultado.text = "Obeso"
                }else {
                    resultado.text = "Erro"

            }
        }
            if (btn_rad_female.isChecked) {
                if (imc < 19.1) {
                    resultado.text = "Abaixo do peso"
                } else if (imc >= 19.1 && imc <= 25.8) {
                    resultado.text = "Peso normal"
                } else if (imc > 25.8 && imc <= 27.3) {
                    resultado.text = "Marginalmente acima do peso"
                } else if (imc > 27.3 && imc <= 32.3) {
                    resultado.text = "Acima do peso"
                } else if (imc > 32.3) {
                    resultado.text = "Obeso"
                }else {
                    resultado.text = "Erro"

                }
            }

        btndelete.setOnClickListener {
            resultado.setText("")
            btn_rad_male.isChecked = false
            btn_rad_female.isChecked = false


        }


        }
    }
}