package com.example.swoosh.Controller

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

const val EXTRA_SKILL = "Skill"

//fun startfinsihActivity(context: Context, selectedskills: Player){
//    val player =Intent(context,FinishActivity::class.java)
////    player.putExtra(EXTRA_PLAYER,player)
////    fin.putExtra(EXTRA_SKILL,selectedskills)
////    fin.putExtra(EXTRA_LEAGUE,league)
////    fin.putExtra(EXTRA_AGE,age)
//    context.startActivity(player)
//}
class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        if (player != null) {
            searchLeaguesText.text = "Looking for ${player.leaugue} ${player.skill} ${player.age} league near you..."
        }
    }
}