package learncollections;
import java.awt.AWTException;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpLoad {
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		//driver.findElementById("uploadBtnCont").click();
		
		driver.findElementById("input_resumeParser").sendKeys("C:\\Users\\Sravanthi\\Desktop\\Dinesh.docx");
		
		Thread.sleep(5000);
		
		/*Clipboard obj =Toolkit.getDefaultToolkit().getSystemClipboard();
		
		StringSelection str= new StringSelection("C:\\Users\\Sravanthi\\Desktop\\Dinesh.docx");
		
		obj.setContents(str,null);+
		
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_V);
		
		rbt.keyRelease(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(5000);
		
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);*/
	}

}
