package weektwo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

     public class TC002 {
	 public static void main(String[] args) throws InterruptedException{
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 
	 ChromeDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.get( "https://www.irctc.co.in/nget/train-search"); 
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/a");
	/* Actions builder = new Actions(driver);
	 builder.moveToElement(stays).perform();
	 builder.click(stays).perform();
	 WebDriverWait wait = new WebDriverWait(driver, 15);
	 wait.until(ExpectedConditions.elementToBeClickable(stays));
	 builder.contextClick(stays).perform();
	 builder.doubleClick(stays).perform();
     driver.findElementByLinkText("Lounge").click();
     */
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
     
     Thread.sleep(5000);
     
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
      Thread.sleep(2000);
      //Verify  email   
      
      driver.findElementByXPath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[6]/button[3]").click();
      
      Thread.sleep(2000);

      driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
      
      
      String expectedText = "dineshchoudari@gmail.com";

     String  actualText=driver.findElementByXPath("/html/body/app-root/acsummery/main/div/section/div/div/div/div[4]/div[2]/span").getText();
     if(actualText.equals(expectedText)){
    	 System.out.println("email id is verified"    +actualText);
     }else{
    	 System.out.println("email id is in correct"   +actualText);
    	 
     }

		// verify mobile number
		String actualmobile = "7799395928";
		
		String mobile=driver.findElementByXPath("/html/body/app-root/acsummery/main/div/section/div/div/div/div[4]/div[3]/span").getText();
		if (actualmobile.equals(mobile)) {
			System.out.println("Mobile Number is Verified: " + mobile);
		} else
			System.out.println("Mobile Number is Incorrect." + mobile);
		// Print amount
				
		String amount = driver.findElementByXPath("/html/body/app-root/acsummery/main/div/section/div/div/div/div[5]/div[4]/span").getText();
						
		System.out.println("The total amount is " + amount);
				Thread.sleep(2000);
				
	    driver.findElementByXPath("/html/body/app-root/acsummery/main/div/section/div/div/div/div[6]/div/label/span").click();	
		Thread.sleep(4000);
		driver.findElementByXPath("/html/body/app-root/acsummery/main/div/section/div/div/div/div[7]/button").click();
		Set<String> prewinid = driver.getWindowHandles();
		for (String transid : prewinid) {
			driver.switchTo().window(transid);
		}
		
		Thread.sleep(3000);
      
		String tranId = driver.findElementByXPath("/html/body/form/div/div/div/div/div[1]/input").getAttribute("value");
		System.out.println("Transaction ID is "   + tranId);
		driver.close();
       
	}}

