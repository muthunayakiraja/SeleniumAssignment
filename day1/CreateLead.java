package week2.day1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CreateLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Muthu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("nayaki");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select option = new Select(source);
option.selectByVisibleText("Employee");
WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select ops = new Select(market);
ops.selectByValue("9001");
WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select  ops1 = new Select(owner);
ops1.selectByIndex(4);
driver.findElement(By.name("submitButton")).click();

String title = driver.getTitle();
System.out.println(title);






	
		
		
		
		
		
		
		

	}

}
