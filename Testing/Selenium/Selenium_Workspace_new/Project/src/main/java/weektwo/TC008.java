package weektwo;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC008 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get( "https://www.irctc.co.in/nget/train-search");
		 
		 Actions action=new Actions(driver);
		 action.moveToElement(driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/a")).build().perform();
	     Thread.sleep(5000);
	     driver.findElementByLinkText("Lounge").click();
	     
	     //window Switching 1 
	     Set<String>currentwindowids=driver.getWindowHandles();
	     for (String childwindowid : currentwindowids) {
		    driver.switchTo().window(childwindowid);
		    }
	     
	     driver.findElementByXPath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[3]/a[3]/span").click();
	     Thread.sleep(2000);
	     
	     //windowSwitching 2 	     
      Set<String>dinesh=driver.getWindowHandles(); 
	     for (String irctchotelswindowid : dinesh) {
		    driver.switchTo().window(irctchotelswindowid);
		    }
	     Thread.sleep(2000);
	     driver.findElementByLinkText("Login").click();
	     Thread.sleep(2000);
	     driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/homeheader/div/app-loginmodal/div/div/div/ul/li[2]/a").click();
	     Thread.sleep(2000);
	     driver.findElementByName("email").sendKeys("dineshchoudari@gmail.com");
	     driver.findElementByName("mobileNo").sendKeys("7799395928"); 
	     Thread.sleep(3000);
	     driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/homeheader/div/app-loginmodal/div/div/div/div/div[2]/div[1]/form/div[3]/button").click();
	     Thread.sleep(2000);
	     driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-home/div/div/div/div/div[2]/div/app-hotelmodify/form/div/div[1]/searchbox/input").sendKeys("hyderabad");
	   //*[@id="owl-dt-picker-0"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[5]/td[6]/span
	     Thread.sleep(2000);
	     driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-home/div/div/div/div/div[2]/div/app-hotelmodify/form/div/div[1]/searchbox/div/ul/li/a/div[2]/strong").click();
	     driver.findElementByName("dt12").click();
	     Thread.sleep(2000);
	     driver.findElementByXPath("//*[@id='owl-dt-picker-0']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[4]/td[4]/span").click();	 
	     
	     driver.findElementByName("dt13").click();
	     Thread.sleep(2000);
	     driver.findElementByXPath("//*[@id='owl-dt-picker-1']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[5]/td[5]/span").click();
	     driver.findElementByName("guest").click();	     
	     Thread.sleep(2000);	     
	     WebElement room=driver.findElementByName("hotelRoom");
	     Select sc1=new Select(room);
	     sc1.selectByValue("1");;
	     Thread.sleep(2000);	     
	     WebElement adults=driver.findElementByName("hotelAdult");
	     Select sc2=new Select(adults);
	     sc2.selectByVisibleText("3");
	     Thread.sleep(2000);
	     driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-home/div/div/div/div/div[2]/div/app-hotelmodify/form/div/div[4]/div/div/div[2]/button").click();
	     Thread.sleep(2000);
	     driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-home/div/div/div/div/div[2]/div/app-hotelmodify/form/div/div[5]").click();
	     Thread.sleep(40000);	       
	     driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-hotellist/main/div/div[2]/div/div[2]/div/div/div[3]/button").click();
         Thread.sleep(40000);
	     String hotelname=driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-hoteldetail/main/div/div/div[2]/h3").getText();
	     System.out.println(hotelname);
	     
	     String price=driver.findElementByXPath("//*[@id='hotel-dtl-sticky-photo']/div[1]/div[1]/div[2]/div/div/p").getText();
	 	 System.out.println(price);
	 	 
	 	 driver.findElementByXPath("//*[@id='hotel-dtl-sticky-photo']/div[1]/div[1]/div[2]/div/div/div[4]/button").click();
	 	 
	 	  Thread.sleep(2000);
	 	  
	 	  WebElement title=driver.findElementByName("title");
	 	  Select sc3=new Select(title); 
	 	  sc3.selectByVisibleText("Mr");
	 	  
	 	  Thread.sleep(2000);
	 	  
	 	  driver.findElementByName("firstName").sendKeys("Dinesh");
	 	  driver.findElementByName("lastName").sendKeys("Avulapati");
	 	  
	 	  WebElement gst=driver.findElementByName("gst");
	 	  Select sc4=new Select(gst); 
	 	  sc4.selectByValue("Yes");
	 	  
	 	  Thread.sleep(2000);
	 	  driver.findElementByName("gstNumber").sendKeys("30369092036");
	 	  
	 	  driver.findElementByName("companyName").sendKeys("Admiral");
	 	  Thread.sleep(2000);
	 	  driver.findElementByName("companyAddress").sendKeys("London");
	 	  Thread.sleep(2000);
	 	  driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[10]/button[2]").click();
	 	  
	 	  driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[7]/div/span").getText();
	 	  Thread.sleep(2000);
	 	  driver.quit();
	 	  
	 	 

	}

}
