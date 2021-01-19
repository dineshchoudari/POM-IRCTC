package weekone;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookSignup {

	@Test
	public void fb() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// ClassName objectName = new ClassName
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		Thread.sleep(4000);
		driver.findElementByName("firstname").sendKeys("Dinesh");
		
		try {
			driver.findElementByName("lastname").sendKeys("Avulapati");
			System.out.println("The element with name lastname is entered with data : Avulapati");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("The element with name lastnam is not found in DOM");
		} catch (ElementNotVisibleException e) {
		
			// TODO: handle exception
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
		} catch (NoSuchFrameException e) {
			// TODO: handle exception
		} catch (NoSuchWindowException e) {
			// TODO: handle exception
		} catch (StaleElementReferenceException e) { 
			// TODO: handle exception
		} catch (SessionNotCreatedException e) {
			// TODO: handle exception
		} catch (WebDriverException e) {
			// TODO: handle exception
		} finally {
			System.out.println("finally");
		}
		
		driver.findElementByName("reg_email__").sendKeys("dineshchoudari@gmail.com");
		driver.findElementByName("reg_email_confirmation__").sendKeys("dineshchoudari@gmail.com");
		driver.findElementByName("reg_passwd__").sendKeys("avulapati123");
		WebElement day=driver.findElementById("day");
		WebElement month=driver.findElementById("month");
		WebElement year=driver.findElementById("year");
		Select select =new Select(day);
		select.selectByVisibleText("10");
		Select select1 =new Select(month);
		select1.selectByVisibleText("May");
		Select select2 =new Select(year);
		select2.selectByVisibleText("1990");
		driver.findElementByXPath("(//input[@name='sex'])[2]").getText();	
		
		
		
		
	}

}
