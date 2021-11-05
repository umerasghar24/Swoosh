package com.example.swoosh.Controller

import android.os.Bundle
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        getStartedBtn.setOnClickListener{
            startleagueActivity(this,"Start Activity") //3rd method for intent by Hanzala Bhai
            //1st method
           // startActivity(Intent(this,LeagueActivity::class.java))
//            var leagueIntent = Intent(this,LeagueActivity::class.java) //2nd method to transit one page to second
            //Intent to go to specific activity or apps
            // this, it is context allow access to specific resources
//            startActivity(leagueIntent)
        }
    }
}