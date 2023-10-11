package edu.farmingdale.bcs421_individual_project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.*

class StarterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_starter)

        val logIn = findViewById<Button>(R.id.LogIn1)
        val register = findViewById<Button>(R.id.Register1)
        val startLogin = Intent(this,LogIn::class.java)
        val startRegister = Intent(this,Register::class.java)

        logIn.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                startActivity(startLogin)
            }

        })
        register.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                startActivity(startRegister)
            }

        })
    }
}