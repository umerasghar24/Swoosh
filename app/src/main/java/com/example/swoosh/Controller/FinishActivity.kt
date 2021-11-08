package com.example.swoosh.Controller

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

const val EXTRA_SKILL = "Skill"

fun startfinsihActivity(context: Context ,selectedskills:String,league:String,age:String){
    val fin =Intent(context,FinishActivity::class.java)
    fin.putExtra(EXTRA_SKILL,selectedskills)
    fin.putExtra(EXTRA_LEAGUE,league)
    fin.putExtra(EXTRA_AGE,age)
    context.startActivity(fin)
}
class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
      val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)
        val age = intent.getStringExtra(EXTRA_AGE)
        searchLeaguesText.text ="Looking For $league $skill $age league near you"
    }
}