import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Myclass {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.get("http://ju.edu.jo/ar/arabic/Home.aspx");
		
		driver.navigate().back();
		
//		driver.manage().window().fullscreen();
		
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("abdulraheem green"+Keys.ARROW_DOWN + Keys.ENTER);
		

		
		
	} 

}
