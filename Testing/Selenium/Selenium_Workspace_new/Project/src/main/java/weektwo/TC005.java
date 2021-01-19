package weektwo;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC005{

	public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get( "https://www.irctc.co.in/nget/train-search");
	 Actions action=new Actions(driver);
	 action.moveToElement(driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/a")).build().perform();
     Thread.sleep(5000);
     driver.findElementByLinkText("Lounge").click();
     
     Set<String>allwindowids=driver.getWindowHandles();
     System.out.println(allwindowids);
     for (String childwindowid : allwindowids) {
	    System.out.println(childwindowid);
	    driver.switchTo().window(childwindowid);
	}
    
     
     driver.findElementByName("city").click();
     
     WebElement stationname=driver.findElementByXPath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[1]/select");
     
      Select sc1= new Select(stationname );
     
       sc1.selectByValue("JP");
    		 
    
     WebElement noofpassengers=driver.findElementByXPath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[3]/select");
     Select sc3= new Select(noofpassengers ); 
     sc3.selectByIndex(2);
     
     Thread.sleep(2000);
     
    driver.findElementByName("acservicecheckindate").click();
    Thread.sleep(2000);
    driver.findElementByXPath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[4]/div/div/table/tbody/tr[5]/td[6]/span").click();
    driver.findElementByName("checkInTime").click();
     
    WebElement checkintime=driver.findElementByXPath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[5]/select");
    Select sc4=new Select(checkintime);
    sc4.selectByIndex(5);
    Thread.sleep(3000);
    
   
    driver.findElementByName("checkOutTime").click();
    WebElement checkouttime=driver.findElementByXPath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[6]/select");
    Select sc5=new Select(checkouttime);
    sc5.selectByIndex(4);
    
    Thread.sleep(1000);
    driver.findElementByXPath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[12]/button[2]").click();
     
    Thread.sleep(2000);
    driver.findElementByXPath("/html/body/app-root/acbooklogin/main/div/section/div/div/div/div[2]/div/div/div/ul/li[2]/a").click();
    
    Thread.sleep(3000);
    
    
    
    driver.findElementByXPath("/html/body/app-root/acbooklogin/main/div/section/div/div/div/div[2]/div/div/div/div/div[2]/form/div/div[1]/input").sendKeys("dineshchoudari@gmail.com");
    		
   driver.findElementByXPath("/html/body/app-root/acbooklogin/main/div/section/div/div/div/div[2]/div/div/div/div/div[2]/form/div/div[2]/input").sendKeys("7799395928");
   Thread.sleep(2000);
   driver.findElementByXPath("/html/body/app-root/acbooklogin/main/div/section/div/div/div/div[2]/div/div/div/div/div[2]/form/div/div[3]/button").click();
   
 
   Thread.sleep(2000);
   WebElement GST=driver.findElementByName("gstGet");
   Select g=new Select(GST);
   g.selectByVisibleText("Yes");
   
   driver.findElementByName("gstNo").sendKeys("763435452365625");
  
   driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
   Thread.sleep(2000);
   driver.findElementByXPath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[1]/td[2]/input").sendKeys("Dinesh");
   driver.findElementByXPath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[1]/td[3]/input").sendKeys("33");
   
    WebElement gen=driver.findElementByXPath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[1]/td[4]/select");
     Select sc6=new Select(gen);
     sc6.selectByIndex(1);
     
      Thread.sleep(2000);
     driver.findElementByXPath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[2]/td[2]/input").sendKeys("sravanthi");
     driver.findElementByXPath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[2]/td[3]/input").sendKeys("30");
     Thread.sleep(1000);
     WebElement gg=driver.findElementByXPath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[2]/td[4]/select");
     Select sc7=new Select(gg);
     sc7.selectByVisibleText("Female");
     
     
     driver.findElementByXPath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[3]/td[2]/input").sendKeys("kethan");
     driver.findElementByXPath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[3]/td[3]/input").sendKeys("04");
     Thread.sleep(1000);
     
     WebElement kk=driver.findElementByXPath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[3]/td[4]/select");
     Select sc8=new Select(kk);
     sc8.selectByIndex(1);
      Thread.sleep(2000);
      
   
      WebElement state =driver.findElementByXPath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[5]/div[4]/select");
      Select sc9=new Select(state);
      sc9.selectByVisibleText("ANDHRA PRADESH");
       Thread.sleep(1000);
       
       driver.findElementByXPath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[6]/button[3]").click();
       
    		 
     String errormsg= driver.findElementByClassName("ERR2").getText();
     System.out.println(errormsg);
     if (errormsg.equals("Please Enter Valid GST number")) {
		System.out.println("verified");
	 }else {
		System.out.println("failed");
	 }
   
   
   
	}}

