package com.ejerciciotemperatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val mostrarResultado = findViewById<TextView>(R.id.Resultado)

        var celsiusNext:String = intent.extras?.getString("NAME").orEmpty()
        mostrarResultado.text = celsiusNext
    }
}