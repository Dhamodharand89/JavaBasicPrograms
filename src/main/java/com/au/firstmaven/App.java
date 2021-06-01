package com.au.firstmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhamu\\eclipse-workspace\\firstmaven\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.google.com");
        driver.close(); 
    }
}
