package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment1 {
	public static void main(String[] args) {
	    ChromeDriver driver = new ChromeDriver();
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
		driver.findElement(By.id("createLeadForm_lastName ")).sendKeys("nayaki");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Muthunayaki");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("create a new Lead");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("muthunayaki0902@gmail.com");
		WebElement drop = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select op = new Select(drop);
		op.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		
			
		            			     
	}
}
