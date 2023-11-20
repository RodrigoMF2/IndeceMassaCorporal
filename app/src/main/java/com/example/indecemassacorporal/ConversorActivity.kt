package com.example.indecemassacorporal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class ConversorActivity : AppCompatActivity() {
    lateinit var resultado : TextView
    lateinit var texto_valor: EditText
    lateinit var btn_converter1: RadioButton
    lateinit var btn_converter2: RadioButton
    lateinit var btn_converter3: RadioButton
    lateinit var btn_converter4: RadioButton
    lateinit var btn_converternumeros:  Button
    lateinit var btn_limpar:  Button
    lateinit var btnvoltar: Button
    var USD_Dolar_to_Escudos : Double = 101.789
    var Euro_to_Escudos : Double = 110.265
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversor)
        resultado = findViewById(R.id.resultado)
        texto_valor = findViewById(R.id.textvalor)
        btn_converter1 = findViewById(R.id.euros_to_escudos)
        btn_converter2 = findViewById(R.id.dolar_to_escudos)
        btn_converter3 = findViewById(R.id.escudos_to_euros)
        btn_converter4 = findViewById(R.id.escudos_to_dolar)
        btn_converternumeros = findViewById(R.id.btnconverter)
        btn_limpar = findViewById(R.id.btnlimpar)
        btnvoltar = findViewById(R.id.btnvoltar)


        btnvoltar.setOnClickListener {
            var intent = Intent(this@ConversorActivity, MainActivity::class.java)
            startActivity(intent)
        }
        btn_limpar.setOnClickListener {
            texto_valor.setText("")
            resultado.setText("")
            btn_converter1.isChecked = false
            btn_converter2.isChecked = false
            btn_converter3.isChecked = false
            btn_converter4.isChecked = false
        }

        btn_converternumeros.setOnClickListener {
            if (btn_converter1.isChecked) {
                var valor = texto_valor.text.toString().toDouble()
                var valor_convertido = valor * Euro_to_Escudos
                resultado.text = "$valor_convertido"

            }
            if (btn_converter2.isChecked){
                var valor = texto_valor.text.toString().toDouble()
                var valor_convertido = valor * USD_Dolar_to_Escudos
                resultado.text = "$valor_convertido"
            }
            if (btn_converter3.isChecked){
                var valor = texto_valor.text.toString().toDouble()
                var valor_convertido = valor / Euro_to_Escudos
                resultado.text = "$valor_convertido"

            }
            if (btn_converter4.isChecked){
                var valor = texto_valor.text.toString().toDouble()
                var valor_convertido = valor / USD_Dolar_to_Escudos
                resultado.text = "$valor_convertido"
            }



        }
    }
}