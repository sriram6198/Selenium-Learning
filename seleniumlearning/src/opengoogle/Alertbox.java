package opengoogle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertbox {

	/**
	 * @param args
	 */
	public static void main(String[] args) {System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.21.0-win64\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("http://www.leafground.com/pages/Alert.html");
	WebElement alert=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
	alert.click();
	Alert alert1=driver.switchTo().alert();
	alert1.accept();
		// TODO Auto-generated method stub

	}

}
