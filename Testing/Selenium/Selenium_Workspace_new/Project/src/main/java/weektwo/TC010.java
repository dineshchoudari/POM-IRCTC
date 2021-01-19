package weektwo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class TC010 {
public static void main(String[] args) throws InterruptedException {		    
	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(" https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");	 
		 driver.findElementByXPath("/html/body/table/tbody/tr[1]/td/center[1]/table/tbody/tr[1]/td/a").click();
		 driver.findElementByName("u_id").sendKeys("dI1nE2sH3");
		 driver.findElementById("u_pwd").sendKeys("avulapati123");
		 driver.findElementById("u_repwd").sendKeys("avulapati123");		 
		 WebElement secq=driver.findElementById("u_secques");
		 Select sc1=new Select(secq);
		 sc1.selectByVisibleText(" where did you meet your spouse?");
		 Thread.sleep(2000);
		 driver.findElementById("u_secans").sendKeys("Nellore");
		 driver.findElementByName("u_name").sendKeys("Dinesh");
		 Thread.sleep(2000);	 
		 WebElement Gender=driver.findElementById("u_gender");		 
		 Select sc2=new Select(Gender);
		 sc2.selectByValue("M");		 
		 Thread.sleep(2000);	 
		 driver.findElementById("u_dob").sendKeys("16/11/1985");
		 driver.findElementById("u_designation").sendKeys("tester");
		 driver.findElementById("u_emailid").sendKeys("dineshchoudari@gmail.com");
		 driver.findElementById("u_mobile").sendKeys("7799395928");
		 driver.findElementById("u_phone").sendKeys("02083144944");
		 
		 WebElement nationality=driver.findElementById("u_nationality");
		 Select sc3=new Select(nationality);
		 sc3.selectByIndex(0);
		 Thread.sleep(2000);		 
		 
		 driver.findElementByName("name").sendKeys("MR Dinesh Avulapati");	
		 driver.findElementById("capacity").sendKeys("Manager");
		 driver.findElementById("address").sendKeys("6th Street ,Nethaji Nagar Nellore ");
		 Thread.sleep(2000);
		 
		 
		 WebElement state=driver.findElementById("state");
		 Select sc4=new Select(state);
		 sc4.selectByVisibleText(" ANDHRA PRADESH");;
		 Thread.sleep(2000);	 
		 WebElement district=driver.findElementById("city_distr");
		 Select sc5=new Select(district);
		 sc5.selectByValue("15D");
		 Thread.sleep(2000);
		 WebElement actype=driver.findElementById("acco_type");
		 Select sc6=new Select(actype);
		 sc6.selectByVisibleText(" Hotel");;
		 Thread.sleep(2000);	 
		 WebElement grade=driver.findElementById("star_rat");
		 Select sc7=new Select(grade);
		 sc7.selectByVisibleText(" Five Star");
		 Thread.sleep(2000);	 
		 driver.findElementByName("email").sendKeys("dineshchoudari@gmail.com");		 
		 Thread.sleep(2000);
		 driver.findElementByName("mcontact").sendKeys("7799395928");
		 Thread.sleep(2000);
		 driver.findElementByName("contact").sendKeys("02083144944");		 
		 Thread.sleep(2000);
		// for 1 passenger  
		 driver.findElementByName("name_o").sendKeys("Dinesh");
		 driver.findElementByName("address_o").sendKeys("Nethaji Nagar");
		 Thread.sleep(2000);		 
		 WebElement  stateone=driver.findElementByName("state_o");
		 Select sc8=new Select(stateone);
		 sc8.selectByVisibleText(" ANDHRA PRADESH");
         Thread.sleep(2000);
         
	     WebElement city1=driver.findElementByName("citydistr_o");
		 Select sc9=new Select(city1);
		 sc9.selectByValue("15D");
		 Thread.sleep(2000);	 
		 driver.findElementByName("emailid_o").sendKeys("dineshchoudari@gmail.com");
		 driver.findElementByName("phoneno_o").sendKeys("02083144944"); 
		 Thread.sleep(2000);
		 driver.findElementByName("mobile_o").sendKeys("7799395928");
		 
		 Thread.sleep(3000);
		 driver.findElementByName("add").click();
		 
		 // for 2 passengers 
		 
		 driver.findElementByName("name_o").sendKeys("Sravanthi");
		 driver.findElementByName("address_o").sendKeys("Podalakur Road");
		 Thread.sleep(2000);
		 
		 WebElement  statetwo=driver.findElementByName("state_o");
		 Select sc10=new Select(stateone);
		 sc10.selectByVisibleText(" ANDHRA PRADESH");
         Thread.sleep(2000);
         
	     WebElement city2=driver.findElementByName("citydistr_o");
		 Select sc11=new Select(city2);
		 sc11.selectByValue("15D");
		 Thread.sleep(2000);	 
		 driver.findElementByName("emailid_o").sendKeys("Sravanthichowdary08@gmail.com");
		 driver.findElementByName("phoneno_o").sendKeys("02083144944"); 
		 Thread.sleep(2000);
		 driver.findElementByName("mobile_o").sendKeys("7799395928");
		 
		 Thread.sleep(3000);
		 driver.findElementByName("add").click();
		 
		 // for 3 passengers 
		 driver.findElementByName("name_o").sendKeys("kethan");
		 driver.findElementByName("address_o").sendKeys("Water Tank Road");
		 Thread.sleep(2000);
		 
		 WebElement  statethree=driver.findElementByName("state_o");
		 Select sc12=new Select(statethree);
		 sc12.selectByVisibleText(" ANDHRA PRADESH");
         Thread.sleep(2000);
         
	     WebElement city3=driver.findElementByName("citydistr_o");
		 Select sc13=new Select(city3);
		 sc13.selectByValue("15D");
		 Thread.sleep(2000);	 
		 driver.findElementByName("emailid_o").sendKeys("Kethanchowdary08@gmail.com");
		 driver.findElementByName("phoneno_o").sendKeys("02083144944"); 
		 Thread.sleep(2000);
		 driver.findElementByName("mobile_o").sendKeys("7799395928");
		 
		 Thread.sleep(3000);
		 driver.findElementByName("add").click();
		 
		 Thread.sleep(6000);
		 
		 driver.close();
		
	    
	    
	}
}