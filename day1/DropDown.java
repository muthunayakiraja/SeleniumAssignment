package week2.day1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
		Select mm = new Select(tool);
		mm.selectByVisibleText("Puppeteer");
driver.findElement(By.xpath("//label[text()='Select Country']")).click();
driver.findElement(By.xpath("//li[text()='Germany']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//label[text()='Select City']")).click();
driver.findElement(By.xpath("//li[text()='Frankfurt']")).click();
driver.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']/input")).click();
driver.findElement(By.xpath("//li[text()='JMeter']")).click();
driver.findElement(By.xpath("//label[text()='Select Language']")).click();
driver.findElement(By.xpath("//li[text()='Tamil']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//label[text()='Select Values']")).click();
driver.findElement(By.xpath("//li[text()='இரண்டு']")).click();
	}
}




















