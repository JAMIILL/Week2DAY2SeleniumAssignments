package Week2DAY2SeleniumAssignments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following::input")).click();
		
		driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input")).isSelected();
		
		
		System.out.println( driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).isSelected());
		
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']//following::input[5]")).click();
	}
}
