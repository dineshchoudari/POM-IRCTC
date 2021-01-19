package weektwo;

import java.util.Set;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");		
		Thread.sleep(5000);
		
		WebElement myframe=driver.findElementById("iframeResult");
		
		driver.switchTo().frame(myframe);
		
		driver.findElementByXPath("//html/body/button").click();
		
		
		String text=driver.switchTo().alert().getText();
		
		System.out.println(text);
		
		driver.switchTo().alert().sendKeys("Dinesh");
		
		driver.switchTo().alert().dismiss();
		
		driver.switchTo().defaultContent(); //to comeout of the frame

		String winIdBeforeClick=driver.getWindowHandle();
		
		System.out.println(winIdBeforeClick);
		
		//Set<String> allWinIdBeforeClick=driver.getWindowHandles();
		
		//System.out.println(allWinIdBeforeClick);
		
		driver.findElementById("tryhome").click();
		
		//String winIdAfterClick=driver.getWindowHandle();
		
		//System.out.println(winIdAfterClick);
		
		Set<String> allWinIdAfterClick=driver.getWindowHandles();
		
		System.out.println(allWinIdAfterClick);
		
		for(String eachId:allWinIdAfterClick){
			driver.switchTo().window(eachId);
		}
		
		
		driver.findElementByLinkText("LEARN HTML").click();
		
		//driver.switchTo().window(winIdBeforeClick);

	for(String eachId:allWinIdAfterClick){
			driver.switchTo().window(eachId);
//			break;
//		}
		
		
		driver.findElementByXPath("/html/body/div[5]/div/a[4]").click();
	}}}
		
		
			
		
	

