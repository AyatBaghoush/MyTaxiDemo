package com.mytaxi.android_demo.Robots;

import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.contrib.DrawerActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.view.Gravity;

import com.mytaxi.android_demo.TestUtils.BaseTestRobot;
import com.mytaxi.android_demo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.DrawerMatchers.isClosed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.is;



public class SearchRobot extends BaseTestRobot {

    ViewInteraction textSearchTextBox=onView(ViewMatchers.withId(R.id.textSearch));
    //textSearch
    //ViewInteraction toolBarItem= onView(allOf(CoreMatchers.<View>instanceOf(TextView.class),withParent(withId(R.id.toolbar))));

    public void ChooseDriverFromList(String driverName)
    {
        chooseElementFromList(driverName);
    }

    public void EditSearchForDriver (String text) {

        fillTextBox(textSearchTextBox , text);

    }

    public void VerifySuccessfulLoginUsernameIsDisplayed(String username)
    {
        onView(withId(R.id.drawer_layout))
                .check(matches (isClosed (Gravity.LEFT))) // Left Drawer should be closed.
                .perform(DrawerActions.open()); // Open Drawer

        onView(withText(username)).check(matches(isDisplayed()));
    }


}
