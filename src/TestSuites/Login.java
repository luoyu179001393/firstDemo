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
		//ʵ��Actions�࣬����������
		Actions actions = new Actions(driver);
		//���õȴ��ĳ�ʱʱ��Ϊ10��
		WebDriverWait wait = new WebDriverWait(driver,10000);
		//�������
		driver.manage().window().maximize();
		/*�Զ���������ߴ磬targetSizeΪ��
		driver.manage().window().setSize(targetSize);*/
		//��ȡ�������size
		System.out.println("��ǰ�򿪵�������ߴ�Ϊ��" + driver.manage().window().getSize());
		//driver.findElement(By.id("username")).sendKeys("hahahhahahhah");
		//driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("a");
		System.out.println(driver.getTitle());
		System.out.println("��ǰURL��" + driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		WebElement userLogin = driver.findElement(By.id("userLogin"));
		/*����Ҽ������¼�
		actions.contextClick(userLogin).perform();
		*/
		//actions.click(userLogin).perform();
		//������תҳ�棬�ڵ�ǰ����������µ���ҳ
		driver.navigate().to("https://www.baidu.com");
		driver.navigate().back();
		driver.navigate().forward();
		WebElement kw = driver.findElement(By.id("kw"));
		kw.sendKeys("��ֵ���");
		//ɾ����������һ����
		kw.sendKeys(Keys.BACK_SPACE);
		//����ո��
		kw.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		//ȫѡ���������
		kw.sendKeys(Keys.CONTROL,"a");
		//�������������
		kw.sendKeys(Keys.CONTROL,"x");
		Thread.sleep(1000);
		//�����е������������������
		kw.sendKeys(Keys.CONTROL,"v");
		kw.sendKeys(Keys.ENTER);
		//driver.quit();
		/*������ʽ�ȴ������ΧΪ10��
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		//wait.until(ExpectedConditions.visibilityOf(kw));
	}

}
