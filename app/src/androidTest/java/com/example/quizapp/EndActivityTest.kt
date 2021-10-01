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

@RunWith(JUnit4::class)
class EndActivityTest {

    @get:Rule
    var activityRule : ActivityScenarioRule<EndActivity> = ActivityScenarioRule(EndActivity::class.java)

    @Test
    fun buttonFinishTest() {
        assertNotNull(onView(withId(R.id.btn_finish)))
        onView(withId(R.id.btn_finish)).perform(click())
    }
}