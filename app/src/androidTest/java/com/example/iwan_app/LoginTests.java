package com.example.iwan_app;

import android.util.Log;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class LoginTests {

    private String stringToBeTyped;

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule
            = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void initValidString() {
        stringToBeTyped = "xXxX999";
    }

    @Test
    public void validWithEmptyNickname() {
        onView(withId(R.id.nickname))
                .perform(clearText());
        onView(withId(R.id.password))
                .perform(typeText(stringToBeTyped));
        onView(withId(R.id.button))
                .check(matches(isDisplayed()));
    }

    @Test
    public void validWithEmptyPassword() {
        onView(withId(R.id.password))
                .perform(clearText());
        onView(withId(R.id.nickname))
                .perform(typeText(stringToBeTyped));
        onView(withId(R.id.button))
                .check(matches(isDisplayed()));
    }

    @Test
    public void validWithFilledNicknameAndPassword() {
        onView(withId(R.id.nickname))
                .perform(typeText(stringToBeTyped));
        onView(withId(R.id.password))
                .perform(replaceText(stringToBeTyped));
        onView(withId(R.id.button))
                .check(matches(isDisplayed()));
    }

    @After
    public void cleanLoginAndPassword() {
        onView(withId(R.id.nickname))
                .perform(clearText());
        onView(withId(R.id.password))
                .perform(clearText());
        Log.e("@After", "It's end of the test.");
    }
    /*@Test
    public void checkIfUserNicknameIsEmpty() {
        onView(withId(R.id.nickname))
                .perform(typeText(stringToBeTyped)).check();
    }*/

}
