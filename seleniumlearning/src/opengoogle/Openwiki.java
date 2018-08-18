package opengoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openwiki {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
	




			
				System.setProperty("webdriver.gecko.driver", "F:/geckodriver-v0.21.0-win64/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.google.com/");
				// enter the search term as trichy
				WebElement textbox=driver.findElement(By.name("q"));
				textbox.sendKeys("trichy"+Keys.ENTER);
				Thread.sleep(3000);
				// click the wikipedia link
				WebElement link=driver.findElement(By.linkText("Tiruchirappalli - Wikipedia"));
				link.click();
				Thread.sleep(5000);
				//click 46 more button
				WebElement button=driver.findElement(By.xpath("//button[text()='46 more']"));
			    button.click();
				
				

				
				
				
			}

		// TODO Auto-generated method stub

	}


