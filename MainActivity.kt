package com.example.app_02_idadeemdias

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtAno = findViewById<EditText>(R.id.txtAno)
        val txtMes = findViewById<EditText>(R.id.txtMes)
        val txtDia = findViewById<EditText>(R.id.txtDia)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        val btnConverter = findViewById<Button>(R.id.btnConverter)

    btnConverter.setOnClickListener {
        if(txtAno.text.isEmpty()){
            txtAno.error = "Digite a quantidade de ano(s)"
        } else if (txtMes.text.isEmpty()){
            txtMes.error = "Digite a quantidade de mes(s)"
        } else if (txtDia.text.isEmpty()){
            txtDia.error = "Digite a quantidade de dia(s)"
        } else {
            val ano = txtAno.text.toString().toInt()
            val mes = txtMes.text.toString().toInt()
            val dia = txtDia.text.toString().toInt()
            val resultado: Int
            //processamento
            resultado = ano * 360 + mes * 30 + dia
            //saida
            txtResultado.text = "Você tem $resultado dia(s)"
        }
    }

    }
}