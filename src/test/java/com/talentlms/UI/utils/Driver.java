package com.talentlms.UI.utils;

import com.talentlms.UI.dataProvider.ConfigReader;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class Driver {

        private Driver(){
            // Singleton pattern - kogda my ukazyvaem modifokator private
        }
        private static WebDriver driver;

        public static WebDriver getDriver(){
            if (driver == null){
                switch (ConfigReader.gerProperty("browser").toLowerCase()){
                    case "chrome":
                        driver = ChromeWebDriver.loadChromeDriver();
                    case "firefox":
                        driver = FireFoxWebDriver.loadFireFoxDriver();
                    case "safari":
                        driver = SafariWebDriver.loadSafariDriver();
                    default:
                        driver=ChromeWebDriver.loadChromeDriver();

                }
            }
            return driver;
        }

        public static void closerDriver(){
            try {
                if (driver != null){
                    driver.close();
                    driver.quit();
                    driver = null;
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
    }


