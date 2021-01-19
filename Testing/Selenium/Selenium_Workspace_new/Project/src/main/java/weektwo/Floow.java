package weektwo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Floow {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qar3ad.eu.fleet-dashboard.com/");
	    driver.findElementByXPath("//label[contains(text() ,'Enter your username')]").sendKeys("tester");
	    Thread.sleep(1000);
	    driver.findElementByXPath("//*[@id='new_session']/fieldset/div[2]/label").sendKeys("YVP&-gEh8N");
	    Thread.sleep(2000);
	    driver.findElementByXPath("//*[@id='new_session']/fieldset/div[4]/div[1]/div/input").click();
	    

	}
}