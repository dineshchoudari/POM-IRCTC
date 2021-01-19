package weekone;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IrctcRegister {

	@Test
	public void irctc() throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.irctc.co.in/");
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[6]").click();
		Thread.sleep(3000);
		driver.findElementById("userName").sendKeys("Dinesh");
		driver.findElementById("usrPwd").sendKeys("avulapati123");
		driver.findElementById("cnfUsrPwd").sendKeys("avulapati123");
	    driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[5]/div[4]/input").sendKeys("kethan");
		driver.findElementById("firstName").sendKeys("Dinesh");
		driver.findElementById("middleName").sendKeys("Kumar");
		driver.findElementById("lastname").sendKeys("Avulapati");
		driver.findElementById("M").click();
		driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[10]/div[2]/p-calendar/span/input").sendKeys("16/11/1985");
		driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[11]/div[2]/label[1]/input").click();
		driver.findElementById("email").sendKeys("dineshchoudari@gmail.com");
		driver.findElementById("mobile").sendKeys("7799395928");
	    driver.findElementByName("resAddress1").sendKeys("25-1-1245");
	    driver.findElementByName("resAddress2").sendKeys("NETHAJI NAGAR");
	    driver.findElementByName("resAddress2").sendKeys("PODALAKUR ROAD ");
	    driver.findElementByName("resAddress3").sendKeys("NELLORE");
	    driver.findElementByName("resPinCode").sendKeys("524004");
	    driver.findElementById("resState").sendKeys("ANDHRAPRADESH");
	    driver.findElementById("resPhone").sendKeys("7799395928");
	    driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[19]/div[2]/input").click();
	    driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[22]/div/input").click();
	}  

}
