package mx.edu.itson.practica4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.ArrayList

class ProductosActivity : AppCompatActivity() {
    var antojitos= ArrayList<Product>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)
        agregarProductos()
    }

    fun agregarProductos(){
        antojitos.add()
    }
}