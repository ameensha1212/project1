package automation;//my store

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcases {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ameen\\Documents\\Selenium Software\\chromedriver_83\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//creating a driver instance.
		driver.get("http://transfotech.online");
		
		driver.findElement(By.className("login")).click();
		Thread.sleep(2000L);
		driver.findElement(By.id("email")).sendKeys("aaminsha20@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("25app20");
		driver.findElement(By.id("SubmitLogin")).click();//successfuly login
		driver.findElement(By.id("my-account")).getText();//verify my account.
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();//click dresses.
		//driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")).click();//select casual dresses.
		//driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]")).click();//add to cart
		Thread.sleep(2000L);
		//driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")).click();//continue shopping.
		//driver.findElement(By.//proceed checkout.
		
		
		
		
		
		
		
		
		
		
	}

}
