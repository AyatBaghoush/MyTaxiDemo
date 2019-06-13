package com.mytaxi.android_demo.Robots;

import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.matcher.ViewMatchers;

import com.mytaxi.android_demo.TestUtils.BaseTestRobot;
import com.mytaxi.android_demo.R;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

public class DriverProfileRobot extends BaseTestRobot {

    ViewInteraction callButton = onView(ViewMatchers.withId(R.id.fab));


    public void ClickCallDriverOverPhone()
    {
        clickButton(callButton);
    }

    public void VerifyDriverIsCalled(String phoneNumber)
    {
        onView(withText(phoneNumber)).check(matches(isDisplayed()));
        //checkTextIsDisplayed(onView(withText(phoneNumber)), phoneNumber);
      // ;
    }
}
