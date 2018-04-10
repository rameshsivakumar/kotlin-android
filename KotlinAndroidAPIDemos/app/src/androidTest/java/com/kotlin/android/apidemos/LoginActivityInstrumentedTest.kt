package com.kotlin.android.apidemos

import android.support.test.espresso.Espresso
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText

import android.support.test.espresso.action.ViewActions
import android.support.test.rule.ActivityTestRule
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class LoginActivityInstrumentedTest() {

    /**
     * The ActivityTestRule is a rule provided by Android used for functional testing of a single
     * activity. The activity that will be tested will be launched before each test that's annotated
     * with @Test and before methods annotated with @Before. The activity will be terminated after
     * the test and methods annotated with @After are complete. This rule allows you to directly
     * access the activity during the test.
     */
    @Rule @JvmField
    var mActivityTestRule = ActivityTestRule<LoginActivity>(LoginActivity::class.java)

    private val username_tobe_typed="jramesh@prokarma.com"
    private val wrong_password = "passme123"

//    @Test
//    fun login_success(){
//
//        Thread.sleep(10000)
//        //Log.e("@Test","Performing login success test")
//        Espresso.onView((withId(R.id.email)))
//                .perform(ViewActions.typeText(username_tobe_typed))
//
//        Espresso.onView(withId(R.id.password))
//                .perform(ViewActions.typeText(correct_password))
//
//        Espresso.onView(withId(R.id.email_sign_in_button))
//                .perform(ViewActions.click())
//
//        Espresso.onData(withId(R.id.rv_androidFeatureList)).atPosition(1)
//                .check(matches(withText(R.string.ui_widgets)))
//    }

    @Test
    fun login_failure(){
        Espresso.onView((withId(R.id.email)))
                .perform(ViewActions.typeText(username_tobe_typed))

        Espresso.onView(withId(R.id.password))
                .perform(ViewActions.typeText(wrong_password))

        Espresso.onView(withId(R.id.email_sign_in_button))
                .perform(ViewActions.click())

        Espresso.onView(withId(R.id.login_error_txt))
                .check(matches(withText(R.string.login_failed)))
    }
}
