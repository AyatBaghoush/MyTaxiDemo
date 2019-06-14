package com.mytaxi.android_demo.Tests;

import android.net.Uri;
import android.support.test.runner.AndroidJUnit4;
import com.mytaxi.android_demo.TestUtils.BaseTestRobot;
import com.mytaxi.android_demo.Robots.DriverProfileRobot;
import com.mytaxi.android_demo.Robots.LoginRobot;
import com.mytaxi.android_demo.Robots.SearchRobot;
import org.junit.Test;
import org.junit.runner.RunWith;



@RunWith(AndroidJUnit4.class)
public class LoginRobotTest extends BaseTestRobot {

    SearchRobot searchRobotObject = new SearchRobot();
    LoginRobot loginRobotObject = new LoginRobot();
    DriverProfileRobot driverProfileObject = new DriverProfileRobot();

    /*Test Case: Validate login functionality with valid username and valid password
    *
    * Test Steps:
    * 1. fill user name with valid username
    * 2. fill password with valid password
    * 3. click login button
    *
    * Expected: user login successfully and username is displayed*/
    @Test
    public void testLoginWithValidUserNameValidPassword() {


        loginRobotObject.EditUsername(jsonDataReader.getValidUsername());
        loginRobotObject.EditPassword(jsonDataReader.getValidPassword());
        loginRobotObject.ClickLoginButton();
        searchRobotObject.VerifySuccessfulLoginUsernameIsDisplayed(jsonDataReader.getValidUsername());

    }

}
