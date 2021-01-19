package weektwo;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC004 {

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
        driver.findElementByLinkText("Charter").click();
        
        Set<String>allwindowids1=driver.getWindowHandles();
        System.out.println(allwindowids1);
        for (String childwindowid1 : allwindowids1) {
  	    System.out.println(childwindowid1);
  	    driver.switchTo().window(childwindowid1);

	}
        driver.findElementByLinkText("Enquiry Form").click();
        
        Thread.sleep(2000);
        driver.findElementByName("name").sendKeys("Dinesh");
        driver.findElementByName("organization").sendKeys("admiral  Group");
        driver.findElementByName("address").sendKeys("Nethaji Nagar,podalakur road,nellore ");
        driver.findElementByName("mobile").sendKeys("7799395928");
        driver.findElementByName("email").sendKeys("dineshchoudari@gmail.com");
        Thread.sleep(1000);
        
        WebElement reqfor=driver.findElementByName("requestFor");
        Select sc1=new Select(reqfor);
        sc1.selectByIndex(1);
     
        driver.findElementByName("originStation").sendKeys("Nellore ");
        driver.findElementByName("destnStation").sendKeys("Chennai");
        driver.findElementByName("checkInDate").click();
        driver.findElementByXPath("//*[@id='Enquiry-just']/div/form/div/div[11]/div/div/table/tbody/tr[3]/td[4]").click();
        driver.findElementByName("checkOutDate").click();
        driver.findElementByXPath("//*[@id='Enquiry-just']/div/form/div/div[12]/div/div/table/tbody/tr[4]/td[7]").click();
        driver.findElementByName("durationPeriod").sendKeys("10");
        driver.findElementByName("coachDetails").sendKeys("2fullAc");
        driver.findElementByName("numPassenger").sendKeys("3");
        
        
       driver.findElementByName("charterPurpose").sendKeys("HOLIDAY");
        driver.findElementByName("services").sendKeys("Not at the Moment ");
        driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(2000);
       driver.findElementByXPath(" //button[text()='Submit']").click();
    
            
        
}}
