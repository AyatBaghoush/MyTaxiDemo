package com.mytaxi.android_demo.Robots;

import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.contrib.DrawerActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.view.Gravity;

import com.mytaxi.android_demo.TestUtils.BaseTestRobot;
import com.mytaxi.android_demo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import static android.support.test.espresso.contrib.DrawerActions.closeDrawer;
import static android.support.test.espresso.contrib.DrawerActions.openDrawer;
import static android.support.test.espresso.contrib.DrawerMatchers.isClosed;
import static android.support.test.espresso.contrib.DrawerMatchers.isOpen;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

public class LoginRobot extends BaseTestRobot {

    /**/
    ViewInteraction userNameTextBox=onView(ViewMatchers.withId(R.id.edt_username));
    ViewInteraction passwordTextBox=onView(withId(R.id.edt_password));
    ViewInteraction loginButton=onView(withId(R.id.btn_login));

    public void userLogin(String userName, String password) {



        //clickButton(onView(withId(R.id.nav_view)));
        //checkTitle("mytaxi demo");


       // onView(withText("Logout")).perform(click());
        // Start the screen of your activity.
       // onView(withId(R.id.nav_view))
         //       .perform(NavigationViewActions.navigateTo(R.id.your_navigation_menu_item));

    }

    public void EditUsername(String username)
    {
        fillTextBox(userNameTextBox, username);
    }

    public void EditPassword(String password)
    {
        fillTextBox(passwordTextBox, password);
    }

    public void ClickLoginButton()
    {
        clickButton(loginButton);
    }





}
