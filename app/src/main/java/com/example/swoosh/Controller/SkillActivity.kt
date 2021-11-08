package com.example.swoosh.Controller

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

const val EXTRA_LEAGUE = "League"
//const val KEY_NEW = "newKey"

fun startSkillActivity(context: Context, selectedLeague: String) {
    val skillIntent = Intent(context, SkillActivity::class.java)
    skillIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
//    skillIntent.putExtra(KEY_NEW, age)
    context.startActivity(skillIntent)
}

class SkillActivity : BaseActivity() {
    var league = ""
    var skill =""
    var age = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
//        league = intent.getIntExtra(KEY_NEW,34234543).toString()
    }
    fun onBeginnerClick(view: View){
        ballerSkillBtn.isChecked=false
        skill ="Beginner"
    }
    fun onBallerClick(view: View){
        beginnerSkillBtn.isChecked=false
        skill ="Baller"
    }
    fun skillSelected(view: View){
        if (skill!=""){
               startAgeActivity(this,age,league,skill)
        }else
            Toast.makeText(this, "Select a skill first", Toast.LENGTH_SHORT).show()
    }

}