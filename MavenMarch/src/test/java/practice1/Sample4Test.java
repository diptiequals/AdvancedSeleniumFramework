package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample4Test{

	@Test(groups={"SmokeTest","RegressionTest"})
	
		public void m4()
		{
		System.out.println("m4 running");
		
		/*WebDriver driver;
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();			
		}
		else
		{			
			driver=new ChromeDriver();
		}
		driver.get(URL);*/

	}

}
