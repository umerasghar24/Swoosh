package com.example.swoosh.Controller

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_age.*

//const val EXTRA_AGE = "Age"
//fun startAgeActivity(context: Context) {
//    val ageIntent = Intent(context, AgeActivity::class.java)
////    ageIntent.putExtra(EXTRA_AGE, selectedAge) //setters need must both getters and setters
////    ageIntent.putExtra(EXTRA_LEAGUE, leauge)
////    ageIntent.putExtra(EXTRA_SKILL, skill)
////    skillIntent.putExtra(KEY_NEW, age)
//    context.startActivity(ageIntent)
//}


class AgeActivity : BaseActivity() {
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER,player)
    }
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age)
        player=intent.getParcelableExtra<Player>(EXTRA_PLAYER)!! //getters
//        age = intent.getStringExtra(EXTRA_AGE).toString()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
    }
    fun onAgeClick(view: View){
        adultAgeBtn.isChecked = false
        player.age = "Children"
    }
    fun onAgeChilClick(view: View){
        childrenAgeBtn.isChecked = false
        player.age = "Adult"
    }
    fun onAgeSelected(view:View){
        if (player.age != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player) //setters
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }

}