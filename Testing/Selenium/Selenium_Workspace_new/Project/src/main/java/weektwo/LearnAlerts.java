package weektwo;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("http://libertytechnologies.co.in");
		Thread.sleep(5000);
		driver.findElementByLinkText("Forgot Password?").click();
	    String text=driver.switchTo().alert().getText();
		System.out.println(text);	
		driver.switchTo().alert().accept();
		
		
	}

}
