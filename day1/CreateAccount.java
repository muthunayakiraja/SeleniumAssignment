package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CreateAccount {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
driver.findElement(By.xpath("//a[text()='Create Account']")).click();
driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("meenal");
driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("uma");
driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("testleaf");
driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("4000");
WebElement industry = driver.findElement(By.name("industryEnumId"));
Select op2 = new Select(industry);
op2.selectByValue("IND_SOFTWARE");
WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
Select op3 = new Select(ownership);
op3.selectByVisibleText("S-Corporation");
WebElement source = driver.findElement(By.id("dataSourceId"));
Select op4 = new Select(source);
op4.selectByValue("LEAD_EMPLOYEE");
WebElement market = driver.findElement(By.id("marketingCampaignId"));
Select op5 = new Select(market);
op5.selectByIndex(5);
WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
Select op6 = new Select(state);
op6.selectByValue("TX");
driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

	}	
}
