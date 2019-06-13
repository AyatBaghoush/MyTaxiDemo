package com.mytaxi.android_demo.Tests;


import android.graphics.Point;
import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import com.mytaxi.android_demo.TestUtils.BaseTestRobot;
import com.mytaxi.android_demo.Robots.DriverProfileRobot;
import com.mytaxi.android_demo.Robots.SearchRobot;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;



@RunWith(AndroidJUnit4.class)
public class SearchRobotTest extends BaseTestRobot {

    DriverProfileRobot driverProfileObject = new DriverProfileRobot();
    SearchRobot searchRobotObject = new SearchRobot();



    @Before
    public void init(){

       /* UiDevice uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        Point[] coordinates = new Point[4];
        coordinates[0] = new Point(248, 1520);
        coordinates[1] = new Point(248, 929);
        coordinates[2] = new Point(796, 1520);
        coordinates[3] = new Point(796, 929);
        try {
            if (!uiDevice.isScreenOn()) {
                uiDevice.wakeUp();
                uiDevice.swipe(coordinates, 10);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }*/
    }

    /*Test Case: Validate user can search for a driver by name and call the driver
     *
     * Test Steps:
     * 1. fill driver name search box with driver initials
     * 2. choose a driver from the list
     * 3. click on the call button
     *
     * Expected: user should get directed to the driver profile page and a phone call is performed*/

    @Test
    public void testSearchForDriverAndCallDriver() {

        searchRobotObject.EditSearchForDriver("Sa");
        searchRobotObject.ChooseDriverFromList("Sarah Scott");

        driverProfileObject.ClickCallDriverOverPhone();

        }



}
