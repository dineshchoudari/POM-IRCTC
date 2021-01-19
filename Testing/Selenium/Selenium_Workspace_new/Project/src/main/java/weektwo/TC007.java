package weektwo;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC007 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get(" https://irctc.co.in");
		 
		 Actions action=new Actions(driver);
		 action.moveToElement(driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/a")).build().perform();
	     Thread.sleep(5000);
	     driver.findElementByLinkText("Lounge").click();
	     
	     //window Switching 1 
	     Set<String>currentwindowids=driver.getWindowHandles();
	     for (String newwindowid : currentwindowids) {
		    driver.switchTo().window(newwindowid);
		    }
	     
	     driver.findElementByXPath("/html/body/app-root/homeheader/nav/div/div[2]/a[3]").click();
	     driver.findElementByLinkText("Hill Railways").click();
	     

	     //window Switching 2
	     Set<String>hillrailways=driver.getWindowHandles();
	     for (String irctctourisam : hillrailways) {
		    driver.switchTo().window(irctctourisam);
		    
		    }
	     Thread.sleep(5000);
	     driver.findElementByXPath("//*[@id='test2']/div[1]/h3/a[3]").click();
	     
	     Thread.sleep(3000);
	     //window Switching 3
	     Set<String>irctctourisam=driver.getWindowHandles();
	     for (String irctpackages: irctctourisam) {
		    driver.switchTo().window(irctpackages);
		    
		    }

	     Thread.sleep(3000);
	     
	     driver.findElementByXPath("/html/body/app-root/ng-component/div/div/div/div/a").click();
	     
	     Thread.sleep(2000);
	     
	     WebElement start=driver.findElementByName("country");
	     
	     Select sc1=new Select(start);
	    
	     sc1.selectByVisibleText("06-FEB-20");
	    
	      Thread.sleep(2000);
	      
		   WebElement bstation=driver.findElementByName("boardst");
		   Select sc2=new Select(bstation);
		   sc2.selectByValue("ARAKKONAM JN");
		   Thread.sleep(3000);
		   
		  driver.findElementByXPath(" /html/body/app-root/tourpackagebooking/main/div/section/div/div/div/div[3]/form/div[3]/button").click();
		
		  Thread.sleep(3000);
		  

		   WebElement room1=driver.findElementByXPath("//*[@id='selectID0']");
		   Select sc3=new Select(room1);
		   sc3.selectByVisibleText("2 Adult + 1 Child without bed (28580 /-)");
		   Thread.sleep(4000);
		   
		   driver.findElementByXPath("/html/body/app-root/tourpackagebooking/main/div/section/div/div/div/div[3]/form/div[4]/button").click();
		   
		   Thread.sleep(2000);
		  
		   
		   
		   
		   driver.findElementByXPath("/html/body/app-root/booklogin/main/div/section/div/div/div/div[2]/div/div/div/ul/li[2]/a").click();
		   
		   Thread.sleep(2000);
		   
		
		   driver.findElementByName("email").sendKeys("dineshchoudari@gmail.com");
		   driver.findElementByName("mobileNo").sendKeys("7799395928");
           Thread.sleep(3000);
           driver.findElementByXPath("/html/body/app-root/booklogin/main/div/section/div/div/div/div[2]/div/div/div/div/div[2]/form/div/div[3]/button").click();
           
           Thread.sleep(2000);
           
           //Passenger 1 
           
           driver.findElementByName("item.firstName").sendKeys("Dinesh");
           driver.findElementByName("item.lastName").sendKeys("Avulapati");
           Thread.sleep(2000);
           driver.findElementByXPath("/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[1]/td[3]/span/input").sendKeys("32");
           WebElement gen=driver.findElementByName("item.gender");
           
           Select sc4=new Select(gen);
           sc4.selectByIndex(1);
           Thread.sleep(2000);
           
           //Passenger 2 
           
           driver.findElementByXPath("/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[2]/td[2]/div/div[1]/input").sendKeys("Sravanthi");
           driver.findElementByXPath("/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[2]/td[2]/div/div[2]/input").sendKeys("kadiyala");
           Thread.sleep(2000);
           driver.findElementByXPath("/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[2]/td[3]/span/input").sendKeys("30");
            WebElement gen1=driver.findElementByXPath("/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[2]/td[4]/select");
           
           Select sc5=new Select(gen1);
           sc5.selectByIndex(2);
           Thread.sleep(2000);
           
           driver.findElementByXPath("/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[3]/td[2]/div/div[1]/input").sendKeys("Kethan");
           driver.findElementByXPath("/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[3]/td[2]/div/div[2]/input").sendKeys("Avulapati");
           Thread.sleep(2000);
           driver.findElementByXPath("/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[3]/td[3]/input").sendKeys("10");
           
           WebElement gen2=driver.findElementByXPath("/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[3]/td[4]/select");
           Select sc6=new Select(gen2);
           sc6.selectByIndex(1);
           Thread.sleep(2000);
           
           driver.findElementByName("nomineeName").sendKeys("Gopal");
           driver.findElementByName("RelationwithPassenger").sendKeys("Father");
           driver.findElementByName("contactNo").sendKeys("7799395928");
           driver.findElementByName("phoneNo").sendKeys("+918612377046");
           Thread.sleep(2000);
           
           driver.findElementByName("faxNo").sendKeys("+918612377046");
           driver.findElementByName("address").sendKeys("25/1/1245,Nethaji Nagar,Podalakur road");
           driver.findElementByName("street").sendKeys("Nellore");
           Thread.sleep(2000);
           
           WebElement state=driver.findElementByName("state");
           Select dd=new Select(state);
           dd.selectByVisibleText("ANDHRA PRADESH");
           
           Thread.sleep(2000);
           
           WebElement idcard=driver.findElementByName("idcardType");
           
           Select c=new Select(idcard);
           c.selectByIndex(4);
           
           Thread.sleep(2000);
           
           driver.findElementByName("idcardno").sendKeys("+918612377046");
           
           Thread.sleep(2000);
          driver.findElementByXPath("/html/body/app-root/passangers/main/div/section/div/div/form/div/div[7]/button[2]") .click();
          
          String totalAmount=driver.findElementByXPath("/html/body/app-root/summery/main/div/section/div/div/form/div/div[5]/div[2]/div/table/tbody/tr[4]/td[2]").getText();     
         System.out.println("The total amount is   "+totalAmount);        
         Thread.sleep(2000);        
         driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
         driver.findElementByXPath("/html/body/app-root/summery/main/div/section/div/div/form/div/div[6]/div/div/label/span").click();        
         Thread.sleep(2000);
         driver.findElementByXPath("/html/body/app-root/summery/main/div/section/div/div/form/div/div[7]/button[2]").click();        
         Thread.sleep(2000);
         
         String tranId = driver.findElementByXPath("//*[@id='payform']/div/div/div/div/div[1]/input").getAttribute("value");
	     System.out.println("Transaction ID is "   + tranId);      
        String transactionAmount=driver.findElementByXPath("//*[@id='payform']/div/div/div/div/div[2]/input").getAttribute("value");      
        System.out.println("the transaction amount is  "+transactionAmount);
          driver.quit();
      
    
           
          
           
           
           
           
		  
		    
	    		 
	     
	    
	     
	     
		
		
		
		
	}

}
