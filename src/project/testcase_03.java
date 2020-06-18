package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase_03 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ameen\\Documents\\Selenium Software\\chromedriver_83\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//creating a driver instance.
		
		driver.get("http://transfotech.online/");
		//navigate to website
		driver.findElement(By.className("login")).click();
		Thread.sleep(2000L);
		driver.findElement(By.id("email_create")).sendKeys("aaminsha20@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		Thread.sleep(2000L);
		
		driver.findElement(By.id("id_gender2")).click();//click gender.
		driver.findElement(By.id("customer_firstname")).sendKeys("Aminsha");
		driver.findElement(By.id("customer_lastname")).sendKeys("Dhakal"); 
		//driver.findElement(By.id("email")).sendKeys("aaminsha200@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("25app20");
		
		Thread.sleep(2000l);
		
		Select day = new Select (driver.findElement(By.id("days")));
		day.selectByIndex(30);//selecting days from drop down.
		Select month = new Select (driver.findElement(By.id("months")));//select month
		month.selectByValue("4");
		Select year = new Select (driver.findElement(By.id("years")));//select year
		year.selectByValue("2020");
		
		driver.findElement(By.id("optin")).click();//click on offers.
		driver.findElement(By.id("address1")).sendKeys("51st street");//address
		driver.findElement(By.id("city")).sendKeys("Queens");
		
		//Thread.sleep(2000L);
		
		Select state = new Select (driver.findElement(By.id("id_state")));
		state.selectByValue("32");
		driver.findElement(By.id("postcode")).sendKeys("11377");
		driver.findElement(By.id("phone_mobile")).sendKeys("9292222222");
		driver.findElement(By.id("alias")).sendKeys("Sunnyside NY");
		
		driver.findElement(By.id("submitAccount")).click(); //account registered.
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
