package com.ejerciciotemperatura

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var celsius=0.0
        val temperatura = findViewById<EditText>(R.id.Temperatura)
        val convertir = findViewById<Button>(R.id.Boton)

        convertir.setOnClickListener {
            celsius = temperatura.text.toString().toDouble()
            val celsiusfinal = (celsius-32)/1.8
            val intencion = Intent(this, MainActivity2::class.java)
                intencion.putExtra("NAME", celsiusfinal.toString())
            startActivity(intencion)
        }
    }
    }