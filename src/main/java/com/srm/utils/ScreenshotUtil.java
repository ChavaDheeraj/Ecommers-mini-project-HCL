package com.srm.utils;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil {

    public static void takeScreenshot(WebDriver driver, String fileName) {

        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);

            File dest = new File("screenshot/" + fileName + "_" + System.currentTimeMillis() + ".png");
            FileHandler.copy(src, dest);

            System.out.println("Screenshot saved: " + fileName);

        } catch (Exception e) {
            System.out.println("Screenshot failed: " + e.getMessage());
        }
    }
}