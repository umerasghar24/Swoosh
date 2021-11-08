package com.example.swoosh.Controller

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*
const val EXTRA_String =""
//fun startleagueActivity(context:Context ,selectedLeague:String){
//    val leagueIntent =Intent(context, LeagueActivity::class.java)
//    leagueIntent.putExtra(EXTRA_String,selectedLeague)
//    context.startActivity(leagueIntent)
//}
class LeagueActivity :
    BaseActivity() { //we inherit from base activity so it will tell about activity life cycle
//    var selectedLeague = "" //if one toogle button is clicked other shouldnt
    var player =Player("","","")
    // if we want that when we rotate our screen data shall be saved we use this
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, player)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
//this
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
    this.player= savedInstanceState.getParcelable(EXTRA_PLAYER)!!
    }

    fun onMensClicked(view: View) { //if we clicked on button other should remain off
        womensLeagueBtn.isChecked = false //other will remain off
        coedLeagueBtn.isChecked = false
        player.leaugue = "mens"

    }

    fun onWomensClicked(view: View) { //if we clicked on button other should remain off
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.leaugue = "womens"

    }

    fun onCoedClicked(view: View) { //if we clicked on button other should remain off
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false
        player.leaugue = "coed"

    }

    fun leagueNextClicked(view: View) {
        if (player.leaugue != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }


    }

}