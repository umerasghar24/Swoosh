package com.example.swoosh

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
const val EXTRA_String =""
fun leagueIntent(context:Context ,selectedLeague:String){
    val leagueIntent =Intent(context,LeagueActivity::class.java)
    leagueIntent.putExtra(EXTRA_String,selectedLeague)
    context.startActivity(leagueIntent)
}
class LeagueActivity :
    BaseActivity() { //we inherit from base activity so it will tell about activity life cycle
    var selectedLeague = "" //if one toogle button is clicked other shouldnt
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) { //if we clicked on button other should remain off
        womensLeagueBtn.isChecked = false //other will remain off
        coedLeagueBtn.isChecked = false
        selectedLeague = "mens"

    }

    fun onWomensClicked(view: View) { //if we clicked on button other should remain off
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "womens"

    }

    fun onCoedClicked(view: View) { //if we clicked on button other should remain off
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false
        selectedLeague = "coed"

    }


    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") { //using so user can not go to next page without selecting anything
            /* val skillIntent =Intent(this,SkillActivity::class.java)
             skillIntent.putExtra(EXTRA_LEAGUE,selectedLeague)
             startActivity(skillIntent)*/
            startSkillActivity(this, selectedLeague,4332)
        } else {
            Toast.makeText(this, "Please select a League", Toast.LENGTH_SHORT).show()
        }


    }

}