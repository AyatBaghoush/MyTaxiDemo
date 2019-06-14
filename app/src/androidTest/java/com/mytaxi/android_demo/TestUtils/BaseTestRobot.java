package com.mytaxi.android_demo.TestUtils;


import android.content.res.Resources;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.contrib.DrawerActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.rule.GrantPermissionRule;
import android.test.ActivityInstrumentationTestCase2;
import android.util.JsonReader;
import android.view.Gravity;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mytaxi.android_demo.DataProvider.JsonData;
import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.Robots.LoginRobot;
import com.mytaxi.android_demo.Robots.SearchRobot;
import com.mytaxi.android_demo.activities.MainActivity;

import org.junit.Before;
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

import com.mytaxi.android_demo.DataProvider.JsonFileReader;


public class BaseTestRobot extends ActivityInstrumentationTestCase2<MainActivity> {

    public JsonData jsonDataReader;
    Gson gson = new Gson();
    JsonObject jsonObject;

    public BaseTestRobot()
    {
        super(MainActivity.class);
    }

    @Rule
    public ActivityTestRule<MainActivity> intentsRule =
            new ActivityTestRule<>(MainActivity.class);

    @Rule
    public GrantPermissionRule permissionRule = GrantPermissionRule.grant(android.Manifest.permission.ACCESS_FINE_LOCATION);
    public Resources resources;

    @Override
    protected void setUp() throws Exception
    {
        super.setUp();
        getActivity();
    }


    @Before
    public void init() {

        resources = intentsRule.getActivity().getResources();
        jsonObject = JsonFileReader.getJSONResource(resources, R.raw.data );
        jsonDataReader = gson.fromJson(jsonObject, JsonData.class);
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
