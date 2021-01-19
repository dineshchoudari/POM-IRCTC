package weekone;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class PhpTravels {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.org/register.php");
		driver.findElementById("inputFirstName").sendKeys("Dinesh");
		driver.findElementById("inputLastName").sendKeys("Avulapati");
		driver.findElementById("inputEmail").sendKeys("dineshchoudari@gmail.com");
		driver.findElementById("inputPhone").sendKeys("07495090425");
		driver.findElementById("inputCompanyName").sendKeys("ADSSOFTWARESOLOUTIONS LTD ");
		driver.findElementByName("address1").sendKeys("Perry Vale ");
		driver.findElementByName("address2").sendKeys("Forest Hill");
		driver.findElementById("inputCity").sendKeys("london");
		driver.findElementById("stateinput").sendKeys("United Kingdom ");
		driver.findElementById("inputPostcode").sendKeys("SE23 2LR");
		WebElement country=driver.findElementById("inputCountry");
		Select select=new Select(country);
		select.selectByVisibleText("United Kingdom");		
		driver.findElementByName("customfield[2]").sendKeys("07495090425");
		driver.findElementByName("password").sendKeys("avulapati123");
		driver.findElementByXPath("//*[@id='inputNewPassword2']").sendKeys("avulapati123");
		driver.findElementByXPath("//*[@id='containerPassword']/div[4]/button").click();
		driver.findElementById("btnGeneratePasswordInsert").click();
		//driver.findElementByXPath("//*[@id='btnGeneratePasswordInsert']").click();
	
	}}