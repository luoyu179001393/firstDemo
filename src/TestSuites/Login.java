package TestSuites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String loginUser;
		Dimension targetSize = new Dimension(1024,768);
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://100.98.100.229:8081/chinapopin-dzxt-dev/oauth2/index.html#/?redirect_uri=aHR0cDovLzEwMC45OC4xMDAuMjI3OjgwODAvbWFuYWdlci10ZXN0LyMvbG9naW4=";
		driver.get(url);
		//实例Actions类，用于鼠标操作
		Actions actions = new Actions(driver);
		//设置等待的超时时间为10秒
		WebDriverWait wait = new WebDriverWait(driver,10000);
		//窗口最大化
		driver.manage().window().maximize();
		/*自定义浏览器尺寸，targetSize为类
		driver.manage().window().setSize(targetSize);*/
		//获取浏览器的size
		System.out.println("当前打开的浏览器尺寸为：" + driver.manage().window().getSize());
		//driver.findElement(By.id("username")).sendKeys("hahahhahahhah");
		//driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("a");
		System.out.println(driver.getTitle());
		System.out.println("当前URL：" + driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		WebElement userLogin = driver.findElement(By.id("userLogin"));
		/*鼠标右键单击事件
		actions.contextClick(userLogin).perform();
		*/
		//actions.click(userLogin).perform();
		//用于跳转页面，在当前浏览器加载新的网页
		driver.navigate().to("https://www.baidu.com");
		driver.navigate().back();
		driver.navigate().forward();
		WebElement kw = driver.findElement(By.id("kw"));
		kw.sendKeys("奇怪的人");
		//删除输入的最后一个字
		kw.sendKeys(Keys.BACK_SPACE);
		//输入空格键
		kw.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		//全选输入框内容
		kw.sendKeys(Keys.CONTROL,"a");
		//剪切输入框内容
		kw.sendKeys(Keys.CONTROL,"x");
		Thread.sleep(1000);
		//将剪切的内容重新输入输入框
		kw.sendKeys(Keys.CONTROL,"v");
		kw.sendKeys(Keys.ENTER);
		//driver.quit();
		/*设置隐式等待，最大范围为10秒
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		//wait.until(ExpectedConditions.visibilityOf(kw));
	}

}
