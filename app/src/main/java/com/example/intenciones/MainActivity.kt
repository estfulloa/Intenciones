package com.example.intenciones

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Declaramos el primer boton
        val btn1 = this.btn1_ventana
        // Declaramos el segundo Boton
        val btn2 = this.button2
        //Tercer botón
        val btn3 = this.btnGoogle
        //Cuarto Boton
        val btn4 = this.btn4
        btn1.setOnClickListener {
           Log.e("IntencionesApp", "Se presionó")
            // Se comienza a construir la intención.
            // para poder hacer llamas a elementos o mandar llamar a otra actividad a partir de una creada, se hace por medio de una INTENCION
            // se importa la intencion
            // ES UNA INTENCION EXPLICITA
           val intent1 = Intent(this,ListaProductos::class.java)
            startActivity(intent1)// con esto se abre la otra ventana

        }
        // se usa una intencion implicita
        btn3.setOnClickListener {
            val aGoogle = Intent(android.content.Intent.ACTION_VIEW)
            aGoogle.data = Uri.parse("https://google.com.mx")
            startActivity(aGoogle)

        }
        btn2.setOnClickListener {
            val intent2 = Intent(this, AgregarProducto::class.java)
            startActivity(intent2)
        }
        btn4.setOnClickListener {
            finish()
        }
    }
}