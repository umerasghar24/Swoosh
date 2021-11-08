package com.example.swoosh.Controller

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_age.*

const val EXTRA_AGE = "Age"
fun startAgeActivity(context: Context, selectedAge: String ,leauge:String,skill:String) {
    val ageIntent = Intent(context, AgeActivity::class.java)
    ageIntent.putExtra(EXTRA_AGE, selectedAge) //setters need must both getters and setters
    ageIntent.putExtra(EXTRA_LEAGUE, leauge)
    ageIntent.putExtra(EXTRA_SKILL, skill)
//    skillIntent.putExtra(KEY_NEW, age)
    context.startActivity(ageIntent)
}


class AgeActivity : BaseActivity() {
    var age = ""
    var skill=""
    var leaugue=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age)
        leaugue = intent.getStringExtra(EXTRA_LEAGUE).toString() //getters
        skill = intent.getStringExtra(EXTRA_SKILL).toString()
//        age = intent.getStringExtra(EXTRA_AGE).toString()
    }
    fun onAgeClick(view: View){
        adultAgeBtn.isChecked = false
        age = "Children"
    }
    fun onAgeChilClick(view: View){
        childrenAgeBtn.isChecked = false
        age = "Adult"
    }
    fun onAgeSelected(view:View){
        if (age!=""){
            startfinsihActivity(this,skill,leaugue,age)
        }else{
            Toast.makeText(this, "Please Select An Age Prefrence", Toast.LENGTH_SHORT).show()
        }
    }

}