package Week2DAY2SeleniumAssignments;

		import java.time.Duration;

import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class Createcontact {

			public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Contacts")).click();
				driver.findElement(By.linkText("Create Contact")).click();
				driver.findElement(By.id("firstNameField")).sendKeys(" JAMEEL");
				driver.findElement(By.id("lastNameField")).sendKeys("MOHAMED");
				driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("M");
				driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("M");
				driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Mechanical engineering");
				driver.findElement(By.id("createContactForm_description")).sendKeys("HI");
				driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("jameelmohamed@gmail.com");
				driver.findElement(By.id("createContactForm_primaryPhoneAreaCode")).sendKeys("+91");
				driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("82481232");
				WebElement element1 = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
			    Select dd2=new Select(element1);
     			dd2.selectByValue("IND");
				WebElement element = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
			    Select dd1=new Select(element);
     			dd1.selectByValue("IN-TN");
     			driver.findElement(By.className("smallSubmit")).click();
     			String text = driver.findElement(By.xpath("(//span[contains(@id,'viewContact_fullName_sp')])")).getText(); 
     			System.out.println(text);

				String title = driver.getTitle();
				System.out.println(title);
		
				
	}

}
