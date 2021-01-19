package weekone;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PanCardApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://panind.com/india/new_pan/");
		
		WebElement title=driver.findElementById("pan_title");
		
		Select sel = new Select(title);
		
		//sel.selectByIndex(3);
		
	//	sel.selectByValue("1");
		
		sel.selectByVisibleText("MRS.");
		
		/*driver.findElementById("pan_firstname").sendKeys("Dinesh");
		driver.findElementById("pan_middlename").sendKeys("Kumar");
		driver.findElementById("pan_lastname").sendKeys("Avulapati");
		driver.findElementById("pan_fatherfirstname").sendKeys("Gopalaiah");
		driver.findElementById("pan_fathermiddlename").sendKeys("kumar");
		driver.findElementById("pan_fatherlastname").sendKeys("Avulapati");
		driver.findElementById("pan_mobilenumber").sendKeys("7799395928");
		driver.findElementById("pan_email").sendKeys("dineshchoudari@gmail.com");
		
		WebElement sourceofincome=driver.findElementById("pan_sourceofincome");
		Select sc1=new Select(sourceofincome);
		sc1.selectByVisibleText("Capital Gains");
		
		//Select HousepropertyDropDown= new Select(driver.findElementById("pan_sourceofincome"));
	    //HousepropertyDropDown.selectByVisibleText("House Property");
		driver.findElementById("residence").click();
		driver.findElementById("pan_dob").sendKeys("16111985");
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
	    driver.findElementByName("pan_addressline1").sendKeys("Nethaji nagar");
        driver.findElementByXPath("//*[@id='pan_addressline1']").sendKeys("25-1-1245");
        driver.findElementByName("pan_addressline2").sendKeys("podalakur Road ");
		driver.findElementById("pan_cityname").sendKeys("NEllore");
		
		
		driver.findElementById("pan_pincode").sendKeys("524004");
		driver.findElementById("pan_source").click();
      
		*/

	}

}
