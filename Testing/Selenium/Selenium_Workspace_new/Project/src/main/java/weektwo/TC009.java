package weektwo;
import java.util.Set;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.chrome.ChromeDriver;

public class TC009 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 driver.findElementByXPath("/html/body/div[2]/div/div/button").click();
		 Thread.sleep(2000);
		 driver.findElementByXPath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input").sendKeys("samsung");
		 Thread.sleep(2000);
		 driver.findElementByXPath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/button").click();
	     Thread.sleep(2000);
	     driver.findElementByXPath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div/div[1]").click();
	   //window Switching 1 
	     
	     Set<String>currentwindowids=driver.getWindowHandles();
	     for (String childwindowid : currentwindowids) {
		    driver.switchTo().window(childwindowid);
		    }	
	     Thread.sleep(5000);
	    String amount=driver.findElementByXPath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div[4]/div[1]/div/div[1]").getText();
	    System.out.println("print the amount of the mobile"   +amount);	     
	    String name = driver.findElementByXPath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/h1/span").getText();
	    System.out.println("print the name of the mobile"  + name );	    
	    Thread.sleep(2000);
	    driver.findElementByXPath("//*[@id='container']/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button").click();
	    Thread.sleep(5000);
	    //error 
	    String cartamount=driver.findElementByXPath("//*[@id='container']/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[3]/div/span").getText();
	
	    if(amount.equalsIgnoreCase(cartamount)){
		 System.out.println("Both Amounts are same ");
	   }else{
		 System.out.println("Amounts are different ");
	  } 
	  String mobilename=driver.findElementByXPath("//*[@id='container']/div/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div[1]/a").getText();	 
	  if(name.equalsIgnoreCase(mobilename))
	  {
		 System.out.println("Both names are same ");
	  }else{
		System.out.println("Names are different "); 
		 
	 }
	  driver.quit();

}}