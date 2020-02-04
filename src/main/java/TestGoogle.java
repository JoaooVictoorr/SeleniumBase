import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGoogle {
	
	@Test
	public void Test() {
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/João Victor/Downloads/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:/Users/João Victor/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.google.com.br");
		Assert.assertEquals("Google", driver.getTitle());
	}

}
