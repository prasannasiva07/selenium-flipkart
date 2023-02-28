package org.version;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {


	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91936\\Desktop\\Selenium2001\\Driver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Mobiles");
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		TakesScreenshot tk= (TakesScreenshot) driver;
		File src =tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		File desc = new File("C:\\Users\\91936\\Desktop\\Selenium2001\\Takesscreenshot\\lanuch.png/");
		
		FileUtils.copyFile(src, desc);
		driver.quit();
	
	}

}
