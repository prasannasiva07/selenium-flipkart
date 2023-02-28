package org.version;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("web driver.chrome.driver", "C:\\Users\\91936\\Desktop\\Selenium2001\\Driver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://greenstech.in/selenium-course-content.html");
		WebElement txtuser = driver.findElement(By.xpath("//p[@class='mail-info']"));
           String g = txtuser.getText();
           System.out.println(g);
           driver.navigate().to("https://www.naukri.com/");
         Thread.sleep(1000);
         driver.navigate().forward();
         driver.quit();
		
		
	}

}
