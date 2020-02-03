import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGoogle {
	
	@Test
	public void Test() {
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Jo�o Victor/Downloads/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com.br");
		Assert.assertEquals("Google", driver.getTitle());
	}

}
