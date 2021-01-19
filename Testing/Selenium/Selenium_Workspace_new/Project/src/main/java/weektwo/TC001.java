package weektwo;

import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class TC001 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );			
	    ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.irctc.co.in/nget/train-search");			
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[6]").click();
		Thread.sleep(3000);
		driver.findElementById("userName").sendKeys("Dinesh");
		driver.findElementById("usrPwd").sendKeys("avulapati123");
		driver.findElementById("cnfUsrPwd").sendKeys("avulapati123");	
		Thread.sleep(3000);	
		driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[5]/div[2]/p-dropdown/div/label").click();
		driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[5]/div[2]/p-dropdown/div/div[4]/div/ul/li[2]/span").click();
		/*driver.findElementByXPath("//label[text()= 'Select Security Question']").click();
		List<WebElement>secQList=driver.findElementsByXPath("//ul[contains(@class, 'ui-dropdown-items')]//li//span");
		for (int i = 0; i <secQList.size(); i++) {
			System.out.println(secQList.get(i).getText());
			if (secQList.get(i).getText().equalsIgnoreCase("What was the name of your first school?")) {
				secQList.get(i).click();
				break;
			}
		}*/
	    driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[5]/div[4]/input").sendKeys("kutty");

	    driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[6]/div[2]/p-dropdown/div/label").click();
		driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[6]/div[2]/p-dropdown/div/div[4]/div/ul/li[1]/span").click();
	
		//driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[10]/div[4]/p-dropdown/div/label").click();
	  
		driver.findElementById("firstName").sendKeys("Dinesh");
		driver.findElementById("middleName").sendKeys("Kumar");
		driver.findElementById("lastname").sendKeys("Avulapati");
		driver.findElementById("M").click();
		driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[10]/div[2]/p-calendar/span/input").sendKeys("16-11-1985");
		Thread.sleep(2000);
		
		driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[11]/div[2]/label[1]/input").click();
		// occupation 
		driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[10]/div[4]/p-dropdown/div/label").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[10]/div[4]/p-dropdown/div/div[4]/div/ul/li[4]/span").click();
		
		//driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[10]/div[4]/p-dropdown/div/div[4]/div/ul/li[4]/span").click();
		driver.findElementById("email").sendKeys("dineshchoudari@gmail.com");
		driver.findElementById("mobile").sendKeys("7799395928");
		// Drop down for nationality
		WebElement nationality=driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[13]/div[5]/select");
		Select sc2=new Select(nationality);
		sc2.selectByValue("94");	
	    driver.findElementByName("resAddress1").sendKeys("25-1-1245");
	    driver.findElementByName("resAddress2").sendKeys("NETHAJI NAGAR");
	    driver.findElementByName("resAddress2").sendKeys("PODALAKUR ROAD ");
	    driver.findElementByName("resAddress3").sendKeys("NELLORE");
	    driver.findElementByName("resPinCode").sendKeys("524004");
	    driver.findElementById("resState").sendKeys("ANDHRAPRADESH");    
	    // Drop down for city/town 
	    WebElement city=driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[17]/div[4]/select");
	     Select sc3=new Select(city);
	     sc3.selectByValue("Nellore");
	     
	     // Drop down for Post office 
	       Thread.sleep(3000);
	     WebElement postoffice=driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[18]/div[2]/select");
	     Select sc4=new Select(postoffice);
	     sc4.selectByIndex(4);
	      
	    driver.findElementById("resPhone").sendKeys("7799395928");
	    driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[19]/div[3]/input").click();
	    driver.findElementByName("offAddress1").sendKeys("25-1-1245");
	    driver.findElementById("offAddress2").sendKeys("NETHAJI NAGAR");
	    driver.findElementById("offAddress3").sendKeys("PODALAKUR ROAD");
	    driver.findElementById("offPinCode").sendKeys("524004");
	    driver.findElementById("offState").sendKeys("ANDHRAPRADESH");
	    // Drop down for city/town	    
	    WebElement town=driver.findElementByXPath(" //*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[20]/div[5]/div[2]/select");
	    Select sc5=new Select(town);
	     sc5.selectByIndex(1);	     
	     Thread.sleep(2000);	     
	     // Drop down for post  office      
	     WebElement postoffice1=driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[20]/div[5]/div[4]/select");
	     Select sc6=new Select(postoffice1);
	     sc6.selectByVisibleText("Andhrakesari Nagar S.O");;
	    
	    driver.findElementById("offPhone").sendKeys("7799395928");
	    driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
	    driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[23]/div/input").click();  
	    
	}}

