package com.example.swoosh.Controller

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

//const val EXTRA_LEAGUE = "League"
//const val KEY_NEW = "newKey"

//fun startSkillActivity(context: Context, selectedLeague: Player) {
//    val skillIntent = Intent(context, SkillActivity::class.java)
//    skillIntent.putExtra(EXTRA_PLAYER,selectedLeague)
////    skillIntent.putExtra(KEY_NEW, age)
//    context.startActivity(skillIntent)
//}

class SkillActivity : BaseActivity() {
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player= intent.getParcelableExtra<Player>(EXTRA_PLAYER)!!
//        league = intent.getIntExtra(KEY_NEW,34234543).toString()
    }

    fun onBeginnerClick(view: View) {
        ballerSkillBtn.isChecked = false
        player.skill = "Beginner"
    }

    fun onBallerClick(view: View) {
        beginnerSkillBtn.isChecked = false
        player.skill = "Baller"
    }

    fun skillSelected(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, AgeActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }

    }
}