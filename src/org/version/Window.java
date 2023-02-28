package org.version;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("web driver.chrome.driver", "C:\\Users\\91936\\Desktop\\Selenium2001\\Driver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		//WebElement btnok = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
    //btnok.click();
//Alert f = driver.switchTo().alert();
//f.accept();
//		WebElement btncon = driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]  "));
//		btncon.click();
//		WebElement btnconfim = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
//		btnconfim.click();
//	Thread.sleep(1000);
//	Alert r = driver.switchTo().alert();
//		r.dismiss();
		WebElement btnvalue = driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')] "));
		btnvalue.click();
		WebElement btnpro = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btnpro.click();
	Thread.sleep(1000);
	Alert t = driver.switchTo().alert();
	t.sendKeys("prasanna");
		t.accept();
		
	}

}
