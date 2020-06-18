package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase_01 {

	public static void main(String[] args) {
		//setting up driver location
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ameen\\Documents\\Selenium Software\\chromedriver_83\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//creating a driver instance.
		
		driver.get("http://transfotech.online/");
		//navigate to website
		
 String title= driver.getTitle();
 
  
 System.out.println(title);//prints title as myStore.
 
 
	 
	

	





	}

}
