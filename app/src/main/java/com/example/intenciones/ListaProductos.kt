package com.example.intenciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lista_productos.*

class ListaProductos : AppCompatActivity() {

    var productos = arrayOf("Tendencias","Verano","Otoño","Invierno","Primavera","Women","Men","Kids","Accesories","Rebajas")
    val btnSalir= this.btnExit

    override fun onCreate(savedInstanceState: Bundle?) {
       btnSalir.setOnClickListener {
          finish()}
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Vamos a colocar los valores para el listView
        val listView = this.list_productos
        //Adaptador
        val adaptador = ArrayAdapter(this, R.layout.activity_lista_productos, productos)
        listView.adapter = adaptador
        // Actividad del evento y saber cual es el list view que se presiona.
        listView.onItemClickListener = object :AdapterView.OnItemClickListener{
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val item =listView.getItemAtPosition(position) as String
                Toast.makeText(this@ListaProductos, "Presionaste: $item", Toast.LENGTH_LONG).show()
            }

        }

        }
    }
//}