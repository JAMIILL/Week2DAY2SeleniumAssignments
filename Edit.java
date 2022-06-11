package Week2DAY2SeleniumAssignments;


		import org.openqa.selenium.chrome.ChromeDriver;


		import java.time.Duration;

		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebElement;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class Edit {
			public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://www.leafground.com/pages/Edit.html");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.manage().window().maximize();
				
			
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("JAM123@gmail.com");
				
				driver.findElement(By.xpath("//input[@id='email']//following::input")).clear();
				
				driver.findElement(By.xpath("//input[@id='email']//following::input")).sendKeys("JAMEEL"+Keys.HOME);
				
				//get the attribute value by using Getattribute method 
				System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
				
				driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
				
				//going to check "Confirm that edit field is disabled editable == empty box or not"
				System.out.println(driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled());
				
	}

}
