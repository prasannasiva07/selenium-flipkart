package org.version;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Siva {

	public static void main(String[] args) {
		System.setProperty("web driver.chrome.driver", "C:\\Users\\91936\\Desktop\\Selenium2001\\Driver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.greenstechnologys.com/");
		WebElement course = driver.findElement(By.xpath("//a[contains(text(),'Online Courses')]"));
		Actions acc = new Actions(driver);
		acc.moveToElement(course).perform();
		WebElement testing = driver.findElement(By.xpath("//a[contains(text(),'Software Testing')]"));
		acc.moveToElement(testing).perform();
		testing.click();

	}

}
