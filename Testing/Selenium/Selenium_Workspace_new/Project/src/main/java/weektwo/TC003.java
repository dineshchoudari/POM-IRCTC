package weektwo;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC003 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/train-search");
        Actions action=new Actions(driver);
   	    action.moveToElement(driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/a")).build().perform();
        Thread.sleep(2000);
        driver.findElementByLinkText("Lounge").click();
        Thread.sleep(1000);
        
        Set<String>allwindowids=driver.getWindowHandles();
        System.out.println(allwindowids);
        for (String childwindowid : allwindowids) {
  	    System.out.println(childwindowid);
  	    driver.switchTo().window(childwindowid);
	}
        driver.findElementByXPath("/html/body/app-root/homeheader/nav/div/div[2]/a[3]").click();
        driver.findElementByLinkText("Book Your Coach/Train").click();
        
        Set<String>allwindowids1=driver.getWindowHandles();
        for (String childwindowid1 : allwindowids1) {
         	    driver.switchTo().window(childwindowid1);
  	
	}
        
  	    
        driver.findElementByLinkText("New User? Signup").click();
        
        Thread.sleep(2000);
        
        driver.findElementById("userId").sendKeys("935064318dI1nE2sH3");
        driver.findElementById("password").sendKeys("dI1nE2sH3avulapati");
        driver.findElementById("cnfPassword").sendKeys("dI1nE2sH3avulapati123");
        
          WebElement Secq=driver.findElementById("secQstn");
          Select sc1=new Select(Secq);
          sc1.selectByVisibleText("Where did you first meet your spouse?");
          
          driver.findElementById("secAnswer").sendKeys("Nellore ");
          Thread.sleep(2000);
          driver.findElementById("dateOfBirth").sendKeys("16/11/1985");
          driver.findElementById("gender0").click();
          driver.findElementById("maritalStatus0").click();
          
          driver.findElementById("email").sendKeys("dineshchoudari@gmail.com");
          
          WebElement occupation=driver.findElementById("occupation");
          Select sc11=new Select(occupation);
          sc11.selectByIndex(3);
          
          
          driver.findElementById("fname").sendKeys("Dinesh");
          driver.findElementById("mname").sendKeys("Kumar");
          driver.findElementById("lname").sendKeys("Avulapati");
          
          WebElement nationality=driver.findElementById("natinality");
          Select sc2=new Select(nationality);
          sc2.selectByValue("94");
          
          driver.findElementById("flatNo").sendKeys("25-1-1245");
          driver.findElementById("street").sendKeys("Nethaji Nagar");
          driver.findElementById("area").sendKeys("Podalakur Road");
          
          WebElement country=driver.findElementById("country");
          Select sc3=new Select(country);
          sc3.selectByIndex(1);
          //driver.findElementById("isdPrefix").sendKeys("0091");
          driver.findElementById("mobile").sendKeys("7799395928");
          driver.findElementById("pincode").sendKeys("524004");
          Thread.sleep(2000);
          
          WebElement city=driver.findElementById("city");
          Select sc4=new Select(country);
          sc4.selectByIndex(1);
          
          Thread.sleep(2000);
          driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
          WebElement state=driver.findElementById("state");
          Select sc5=new Select(state);
          sc5.selectByIndex(1);
          
          Thread.sleep(2000);
         driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
          
         
         WebElement postoffice=driver.findElementById("postOffice");
         Select sc6=new Select(postoffice);
          sc6.selectByVisibleText("Kottur B.O");
          
          
           driver.findElementById("sameAddresses1").click();
           
           driver.findElementById("flatNoOffice").sendKeys("25-1-1245");
           driver.findElementById("streetOffice").sendKeys("Nethaji Nagar");
           driver.findElementById("areaOffice").sendKeys("Podalakur Road");
           
           
          WebElement country1=driver.findElementById("countryOffice");
           Select sc7=new Select(country1);
           sc7.selectByIndex(1);
           
          driver.findElementById("mobileOffice").sendKeys("7799395928");
           driver.findElementById("pincodeOffice").sendKeys("524004");
           
           driver.findElementByXPath("//html/body").sendKeys(Keys.TAB);
           
           	Thread.sleep(2000);
           WebElement town=driver.findElementById("cityOffice");
           Select sc8=new Select(town);
           sc8.selectByValue("Nellore");;
           
           Thread.sleep(2000);
           WebElement state1=driver.findElementById("stateOffice");
           Select sc9=new Select(state1);
           sc9.selectByValue("ANDHRA PRADESH");
          
            Thread.sleep(2000);
           
          WebElement postoffice1=driver.findElementById("postOfficeOffice");
          Select sc10=new Select(postoffice1);
           sc10.selectByValue("Vedayapalem S.O");
           
           
        }}
           
           
          
           
          
           
         
          
          
          
          
          
          
	


