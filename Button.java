package Week2DAY2SeleniumAssignments;


import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Button{
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Button.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	
	//Get a location by get location method
	System.out.println( driver.findElement(By.id("position")).getLocation());
	
	driver.findElement(By.xpath("//button[@id='home']")).click();
	
	driver.navigate().back();
	
	//Get a color of the value by  get CSSvalue method
	System.out.println(driver.findElement(By.xpath("(//button[@id='home']//following::button)[2]")).getCssValue("background-color"));
	
	//Get a size by get size method
	System.out.println(driver.findElement(By.xpath("(//button[@id='home']/following::button)[3]")).getSize());
	
	System.out.println(driver.findElement(By.id("home")).isDisplayed());
	
	}
}
