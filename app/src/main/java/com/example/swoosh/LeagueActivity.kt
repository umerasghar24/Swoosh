package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LeagueActivity : BaseActivity() { //we inherit from base activity so it will tell about activity life cycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
    fun leagueNextClicked(vie:View){
        val skillIntent =Intent(this,SkillActivity::class.java)
        startActivity(skillIntent)

    }
    fun onMensClicked(view:View){

    }
    fun onWomensClicked(view:View){

    }
}