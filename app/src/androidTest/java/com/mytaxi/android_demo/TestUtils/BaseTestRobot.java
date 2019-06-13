package com.mytaxi.android_demo.TestUtils;


import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.contrib.DrawerActions;
import android.support.test.rule.ActivityTestRule;
import android.test.ActivityInstrumentationTestCase2;
import android.view.Gravity;

import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.activities.MainActivity;

import org.junit.Rule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.contrib.DrawerMatchers.isClosed;
import static android.support.test.espresso.matcher.RootMatchers.isPlatformPopup;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import static android.support.test.espresso.assertion.ViewAssertions.* ;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

public class BaseTestRobot extends ActivityInstrumentationTestCase2<MainActivity> {


    public BaseTestRobot()
    {
        super(MainActivity.class);
    }

    @Rule
    public ActivityTestRule<MainActivity> intentsRule =
            new ActivityTestRule<>(MainActivity.class);


    @Override
    protected void setUp() throws Exception
    {
        super.setUp();
        getActivity();
    }

    public static void checkTextIsDisplayed(ViewInteraction ve , String expectedTitle )
    {
        ve.check(matches(withText(expectedTitle)));
    }

    public static void fillTextBox(ViewInteraction ve, String textValue)
    {

        ve.perform(typeText(textValue), closeSoftKeyboard());
    }


    public static void clickButton(ViewInteraction ve)
    {
        ve.perform(click());
    }


    public static void chooseElementFromList (String element)
    {
        onView(withText(element))
                .inRoot(isPlatformPopup ())
                .perform(click());

    }


}
