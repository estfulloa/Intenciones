package com.example.intenciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_agregar_producto.*

class AgregarProducto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_producto)
        val btn1 = btnAgregar
        val btnSalir = button3
        btn1.setOnClickListener {

        }
        btnSalir.setOnClickListener {
            finish()
        }
    }
}