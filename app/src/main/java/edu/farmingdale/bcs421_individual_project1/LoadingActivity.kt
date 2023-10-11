package edu.farmingdale.bcs421_individual_project1

import androidx.appcompat.app.AppCompatActivity
import android.os.*
import android.content.*

class LoadingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)
        val start = Intent(this,StarterActivity::class.java)
        object : CountDownTimer(2000, 1000) {

            override fun onTick(millisUntilFinished: Long) {
            }
            override fun onFinish() {
                startActivity(start);
            }
        }.start()
    }
}