package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginUtils {
	
	public void login(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		String url = "http://100.98.100.229:8081/chinapopin-dzxt-dev/oauth2/index.html#/?redirect_uri=aHR0cDovLzEwMC45OC4xMDAuMjI3OjgwODAvbWFuYWdlci10ZXN0LyMvbG9naW4=";
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("a");
		WebElement userLogin = driver.findElement(By.id("userLogin"));
		/*鼠标右键单击事件
		actions.contextClick(userLogin).perform();
		*/
		actions.click(userLogin).perform();
	}
}
