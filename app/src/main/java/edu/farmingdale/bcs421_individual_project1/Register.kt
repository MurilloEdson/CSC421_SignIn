package edu.farmingdale.bcs421_individual_project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.view.*

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val back2 = findViewById<Button>(R.id.StartBack2)
        val register = findViewById<Button>(R.id.Register2)
        val field1 = findViewById<EditText>(R.id.username)
        val field2 = findViewById<EditText>(R.id.firstN)
        val field3 = findViewById<EditText>(R.id.familyN)
        val field4 = findViewById<EditText>(R.id.dob)
        val field5 = findViewById<EditText>(R.id.password)
        var startB = Intent(this,StarterActivity::class.java)
        var login = Intent(this,MainActivity::class.java)
        back2.setOnClickListener{
            startActivity(startB)
        }
        register.setOnClickListener{
            if (checkEmpty(field1,field2,field3,field4,field5)){
                startActivity(login)
            }
        }
    }
    fun checkEmpty(username: EditText,firstN: EditText,
                   famN: EditText, dob: EditText,pass: EditText): Boolean{
        if (username.text.isBlank()){
            username.setError("Please fill out all fields")
            return false
        }else if(firstN.text.isBlank()){
            firstN.setError("Please fill out all fields")
            return false
        }else if(famN.text.isBlank()){
            famN.setError("Please fill out all fields")
            return false
        }else if(dob.text.isBlank()){
            dob.setError("Please fill out all fields")
            return false
        }else if(pass.text.isBlank()){
            pass.setError("Please fill out all fields")
            return false
        }
        return true
    }
}