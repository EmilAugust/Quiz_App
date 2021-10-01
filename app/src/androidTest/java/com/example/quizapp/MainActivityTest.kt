package com.example.quizapp

import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.junit.Test
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import junit.framework.Assert.assertNotNull
import org.junit.Rule

const val testText = "Emil"

@RunWith(JUnit4::class)
class MainActivityTest {

    @get:Rule
    var activityRule : ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun buttonStartTest() {
        assertNotNull(onView(withId(R.id.btn_start)))
        onView(withId(R.id.btn_start)).perform(click())
    }

    @Test
    fun verifyName() {
        onView(withId(R.id.nameInput)).perform(typeText(testText))
    }

}