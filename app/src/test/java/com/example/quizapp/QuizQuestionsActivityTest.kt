package com.example.quizapp

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import com.google.common.truth.Truth.assertThat
import kotlin.reflect.typeOf

@RunWith(JUnit4::class)
class QuizQuestionsActivityTest {
    val activity : QuizQuestionsActivity = QuizQuestionsActivity()


    @Test
    fun whenInputIsValid() {
        println("${activity::class.simpleName}")
        val svar = true
        val result = activity.verify(svar)
        println("${result::class.simpleName}")


        print(result)
        //assertThat(result).isEqualTo(true)
    }


    @Test
    fun whenInputIsInvalid() {
        val svar = true
        val result = activity.verify(svar)
        assertThat(result).isEqualTo(false)
    }


}
