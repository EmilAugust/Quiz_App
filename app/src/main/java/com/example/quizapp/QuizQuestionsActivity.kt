package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity() {
    private var questionAmount = 0
    private var score = 0
    private var question = 0
    private val questions = arrayOf("Norway has the longest coastline", "Elon Musk founded PayPal", "The United States is the third most populated country", "Mercury is the hottest planet in our solar system", "Cows have three stomachs")
    private val questionAnswers = arrayOf(false, true, true, false, false)
    private val images = arrayOf(R.mipmap.norway, R.mipmap.paypal, R.mipmap.usa, R.mipmap.solarsystem, R.mipmap.cow)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        for (items in questions) {
            questionAmount ++
        }

        currentQuestion.text = ("Question " + (question + 1))
        questionText.text = questions[question]
        questionImage.setImageResource(images[question])

        trueBtn.setOnClickListener {
            verify(true)
        }

        falseBtn.setOnClickListener {
            verify(false)
        }
    }
    fun verify(answer: Boolean) : Boolean {
        if (answer == questionAnswers[question]) {
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
            score++
        } else {
            Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show()
        }
        if (question == questionAmount - 1) {
            val name = intent.getStringExtra("name")
            val intent = Intent(this, EndActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("score", score)
            intent.putExtra("questionAmount", questionAmount)
            startActivity(intent)
            finish()
        } else {
            question++
            currentQuestion.text = ("Question " + (question + 1))
            questionText.text = questions[question]
            questionImage.setImageResource(images[question])
        }
        return true
    }
}