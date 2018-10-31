package pack;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TC001 
{

	public static void main(String[] args) 
	
	{		
		
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Mozilla Firefox\\browsergeckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		
		
	}

}
