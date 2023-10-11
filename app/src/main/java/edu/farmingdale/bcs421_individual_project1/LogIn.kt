package edu.farmingdale.bcs421_individual_project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val back1 = findViewById<Button>(R.id.StartBack1)
        val logInB = findViewById<Button>(R.id.Login2)
        var logIn = Intent(this,MainActivity::class.java)
        var startB = Intent(this,StarterActivity::class.java)
        back1.setOnClickListener{
            startActivity(startB)
        }
        logInB.setOnClickListener{
            if(verifyUser(username,password)){
                startActivity(logIn)
                Toast.makeText(this,R.string.welcome_message,Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,R.string.input_error,Toast.LENGTH_SHORT).show()
            }
        }
    }
    fun verifyUser(username: EditText,password: EditText):Boolean{
        val email = username.text
        val pass = password.text
        if(email.isNotBlank() && pass.isNotBlank()){
            return true
        }
        return false
    }
}