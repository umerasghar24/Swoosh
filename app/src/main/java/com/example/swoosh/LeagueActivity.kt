package com.example.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LeagueActivity : BaseActivity() { //we inherit from base activity so it will tell about activity life cycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
}