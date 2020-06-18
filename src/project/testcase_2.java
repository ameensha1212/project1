package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase_2{

			public static void main(String[] args) throws InterruptedException {
				
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ameen\\Documents\\Selenium Software\\chromedriver_83\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();//creating a driver instance.
				
				driver.get("http://transfotech.online/");
				//navigating to website
				driver.findElement(By.className("login")).click();
				Thread.sleep(2000L);
				
				driver.findElement(By.id("email_create")).sendKeys("abcdefg@.com");//adding email
				driver.findElement(By.id("SubmitCreate")).click();


	}

}
