package org.version;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Facebook {

	public static void main(String[] args) {
		System.setProperty("web driver.chrome.driver", "C:\\Users\\91936\\Desktop\\Selenium2001\\Driver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/ ");
		WebElement txtbr = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		txtbr.sendKeys("prasanna@gmail.com");
		String h = txtbr.getAttribute("value");
		System.out.println(h);
   		

	}

}
