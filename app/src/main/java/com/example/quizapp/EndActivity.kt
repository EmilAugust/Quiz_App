package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_end.*

class EndActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)

        val name = intent.getStringExtra("name").toString()
        val score = intent.getIntExtra("score", 0)
        val questionAmount = intent.getIntExtra("questionAmount", 0)

        scoreText.text = "Your score is $score out of $questionAmount"
        nameText.text = "Congratulations, $name!"

        btn_finish.setOnClickListener {
            finishAffinity()
        }
    }
}