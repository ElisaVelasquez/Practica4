package mx.edu.itson.practica4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button




class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnAntojitos: Button = findViewById(R.id.btnAntojitos) as Button

        btnAntojitos.setOnClickListener {
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra( "menuType", "Antojitos")
            startActivity(intent)
        }

        var btnEspecialidades: Button = findViewById(R.id.btnEspecialidades) as Button
        btnEspecialidades.setOnClickListener{
            var intent : Intent = Intent( this, ProductosActivity::class.java)
            intent.putExtra( "menuType", "Especialidades")
            startActivity (intent)
        }

        var btnComb: Button = findViewById(R.id.btnCombinations) as Button
        btnComb.setOnClickListener{
            var intent : Intent = Intent( this, ProductosActivity::class.java)
            intent.putExtra( "menuType", "Combinations")
            startActivity (intent)
        }

        var btnTortas: Button = findViewById(R.id.btnTortas) as Button
        btnTortas.setOnClickListener{
            var intent : Intent = Intent( this, ProductosActivity::class.java)
            intent.putExtra( "menuType", "Tortas")
            startActivity (intent)
        }
        var btnSopas: Button = findViewById(R.id.btnSopas) as Button
        btnSopas.setOnClickListener{
            var intent : Intent = Intent( this, ProductosActivity::class.java)
            intent.putExtra( "menuType", "Sopas")
            startActivity (intent)
        }
        var btnDrinks: Button = findViewById(R.id.btnDrinks) as Button
        btnDrinks.setOnClickListener{
            var intent : Intent = Intent( this, ProductosActivity::class.java)
            intent.putExtra( "menuType", "Drinks")
            startActivity (intent)
        }
    }
}