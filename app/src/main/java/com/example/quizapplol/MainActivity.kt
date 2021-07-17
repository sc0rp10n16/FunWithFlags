package com.example.quizapplol

import android.content.Intent
import android.graphics.Color
import android.graphics.Color.RED
import android.graphics.fonts.FontFamily
import android.hardware.camera2.params.RggbChannelVector.RED
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spanTitle()
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        btn_start.setOnClickListener()
        {
            if(et_name.text.toString().isEmpty())
            {
                Toast.makeText(this,"Please enter your name", Toast.LENGTH_SHORT).show()
            }
            else
            {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, et_name.text.toString())
                startActivity(intent)
                finish()
            }
        }




    }
    private fun spanTitle()
    {
        var intro = tv_app_name.text.toString()
        val ss = SpannableString(intro)
        val fcolor = ForegroundColorSpan(Color.RED)
        ss.setSpan(fcolor, 0,4,Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
        tv_app_name.text = ss
    }

}