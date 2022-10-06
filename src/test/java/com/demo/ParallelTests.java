package com.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTests {
	
    
    WebDriver driver;
    @Test(groups="Chrome")
    public void LaunchChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test(groups="Chrome", dependsOnMethods="LaunchChrome")
    public void TryFacebook1() {
    
        driver.findElement(By.id("email")).sendKeys("ravi10thstudent@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("12345");
        driver.findElement(By.name("login")).click();
    }
  
    
    
    
    
    @Test(groups="Edge")
    public void LaunchEdge() {
    	 System.setProperty("webdriver.edge.driver", "C:\\Users\\ADMIN\\Downloads\\edgedriver_win64/msedgedriver.exe");
         driver = new EdgeDriver();
     
        
         
        driver.get("https://www.facebook.com");
    	
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    @Test(groups="Edge", dependsOnMethods="LaunchEdge")
    public void TryFacebook2() {
       
        driver.findElement(By.id("email")).sendKeys("ravi10thstudent@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("ravi28394");
        driver.findElement(By.name("login")).click();
       
    }
   
}
