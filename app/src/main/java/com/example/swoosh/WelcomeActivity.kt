package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        getStartedBtn.setOnClickListener{
            //1st method
           // startActivity(Intent(this,LeagueActivity::class.java))
            var leagueIntent = Intent(this,LeagueActivity::class.java) //2nd method to transit one page to second
            //Intent to go to specific activity or apps
            startActivity(leagueIntent)
        }
    }
}