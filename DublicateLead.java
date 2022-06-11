package Week2DAY2SeleniumAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DublicateLead {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
	 driver.findElement(By.className("decorativeSubmit")).click();
	 String text =driver.findElement(By.tagName("h2")).getText();
	 System.out.println(text);
	 driver.findElement(By.linkText("CRM/SFA")).click();
	 driver.findElement(By.linkText("Leads")).click();
	 driver.findElement(By.linkText("Create Lead")).click();
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("JAMEELMOHAMED");
	 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("JAMEEL");
	 driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("MR");
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("MOHAMED");
	 driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("MOH");
	 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("AUTOMATION TESTER");
	 driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000");
	 driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("14/04/1999");
	 WebElement Element1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
	 Select obj = new Select (Element1);
	 obj.selectByVisibleText("Employee");
	 WebElement Element2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
	 Select obj2 = new Select (Element2);
	 obj2.selectByIndex(3);
	 WebElement element3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	 Select obj3 = new Select (element3);
	 obj3.selectByValue("OWN_CCORP");
	 WebElement Element4 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	 Select obj4 = new Select (Element4);
	 obj4.selectByVisibleText("Automobile");
	 WebElement Element5 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	 Select obj5 = new Select (Element5);
	 obj5.selectByVisibleText("India");
	 WebElement Element6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	 Select obj6 = new Select (Element6);
	 obj6.selectByVisibleText("TAMILNADU");
	 WebElement element = driver.findElement(By.id("createLeadForm_currencyUomId"));
	 Select obj7 = new Select (element);
	 obj7.selectByIndex(70);
	 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("INSPECTOR");
	 driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1000");
	 driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
	 driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
     driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("9999");
	 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("JAMEEL123@gmail.com");
	 driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("123456789");
	 driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("MOHAMED");
	 driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("JAMEEL");
	 driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("MOHAMED");
	 driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("5/12,PERUNGALATHUR,6500083");
	 driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("5/112,PERUNGALATHUR,6500083");
	 driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
	 driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600");
	 driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("600658");
	 driver.findElement(By.name("submitButton")).click();
	 
	 driver.findElement(By.xpath("//a[contains(@class,'subMenuButton')]")).click();
	
	 String name=driver.findElement(By.id("viewLead_firstName_sp")).getText();
	 System.out.println(name);
}}