package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("moorthi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("mathyu");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("5678908905");
driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("567");
WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select dd = new Select(date);
	dd.selectByValue("4");
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Select mn = new Select(month);
	mn.selectByValue("8");
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	Select yy = new Select(year);
	yy.selectByValue("2004");
	driver.findElement(By.xpath("//label[text()='Female']")).click();
	
	
	}
}
