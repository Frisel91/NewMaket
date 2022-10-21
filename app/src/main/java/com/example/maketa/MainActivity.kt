package com.example.maketa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)

        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.obrasenie,
            R.id.profil
        ))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


        val firstName ="Петров"
        val compani ="compani"
        val nameS = findViewById<TextView>(R.id.title_name)
        nameS.text = firstName
        val nameImg = findViewById<TextView>(R.id.textView3)
        nameImg.text = firstName[0].toString()
        val companiName = findViewById<TextView>(R.id.textView2)
        companiName.text =compani


        val buttonAlert = findViewById<Button>(R.id.button)

        buttonAlert.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setMessage("Вы действительно хотите выйти?")
            builder.setPositiveButton("Да выйти") { dialog, _ ->dialog.dismiss()

            }
            builder.setNegativeButton("Отмена"){ dialog, _ -> dialog.dismiss()
            }
            // Create the AlertDialog
            val alertDialog: AlertDialog = builder.create()
            alertDialog.show()
        }
    }
}