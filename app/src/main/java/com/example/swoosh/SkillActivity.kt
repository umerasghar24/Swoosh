package com.example.swoosh

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

const val EXTRA_LEAGUE = "League"
const val KEY_NEW = "newKey"

fun startSkillActivity(context: Context, selectedLeague: String,age:Int) {
    val skillIntent = Intent(context, SkillActivity::class.java)
    skillIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
    skillIntent.putExtra(KEY_NEW, age)
    context.startActivity(skillIntent)
}

class SkillActivity : BaseActivity() {
    var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        league = intent.getIntExtra(KEY_NEW,34234543).toString()
        println(league)
    }
}