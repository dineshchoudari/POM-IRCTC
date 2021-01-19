package weekone;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class OnlinePassportApplication {
	
	@Test
	public void passport() throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
    driver.get("https://passportconsult.com/"); 
   // DropDowns 
    WebElement Applyingfor=driver.findElementById("applying_for");
    		Select sc=new Select( Applyingfor) ;	
    		sc.selectByIndex(1);  
   
   	WebElement typeofappliction=driver.findElementById("frequent");
    Select sc1=new Select( typeofappliction); 
    sc1.selectByVisibleText("Tatkaal") ;  
    
	
   	WebElement typeofpassportbooklet=driver.findElementByName("type_of_booklet");
    Select sc2=new Select( typeofpassportbooklet); 
    sc2.selectByValue("60 Pages"); 
    
    driver.findElementById("txt_firstname").sendKeys("Dinesh");
    driver.findElementById("txt_middlename").sendKeys("Kumar");
    driver.findElementById("txt_lastname").sendKeys("Avulapati");
    driver.findElementById("txt_aadharno").sendKeys("564535196441");
    
	WebElement gender=driver.findElementById("sel_gender");
    Select sc3=new Select( gender); 
    sc3.selectByIndex(1); 
    
    WebElement maritalstatus=driver.findElementById("sel_marital_status");                                                                       
    Select sc4=new Select( maritalstatus); 
    sc4.selectByIndex(2); 
  
    driver.findElementById("txt_dob").sendKeys("16/11/1985");
    driver.findElementById("txt_place_birth").sendKeys("Nellore ");
    
    
    WebElement state=driver.findElementById("applicant_state");                                                                       
    Select sc5=new Select( state); 
    sc5.selectByIndex(2); 
    Thread.sleep(2000);
    
    WebElement district=driver.findElementById("applicant_district");                                                                       
    Select sc6=new Select( district); 
    sc6.selectByValue("11");
    
    driver.findElementById("txt_pan").sendKeys("CKJPA7237G");
    driver.findElementById("txt_voter_id").sendKeys("30369092036");
    
    WebElement educationqualification=driver.findElementById("sel_qualification");                                                                       
    Select sc7=new Select(educationqualification ); 
    sc7.selectByVisibleText("Graduate and above");
    
    
    WebElement employementtype=driver.findElementById("sel_emp_type");                                                                       
    Select sc8=new Select(employementtype ); 
    sc8.selectByVisibleText("Self Employed");
    
    driver.findElementById("txt_visible_dmark").sendKeys("A MOLE ON MY EYE");
    driver.findElementById("txt_Ffirstname").sendKeys("Gopaliah");
    driver.findElementById("txt_Fmiddlename").sendKeys("kumar");
    driver.findElementById("txt_Flastname").sendKeys("Avulapati");
    driver.findElementById("txt_Mfirstname").sendKeys("Thirupathamma");
    driver.findElementById("txt_Mmiddlename").sendKeys("Kumari");
    driver.findElementById("txt_Mlastname").sendKeys("Avulapati");
    driver.findElementById("txt_Gfirstname").sendKeys("Sravanthi");
    driver.findElementById("txt_Gmiddlename").sendKeys("Dinesh");
    driver.findElementById("txt_Glastname").sendKeys("kadiyala");
    
    driver.findElementById("txt_spouse_firstname").sendKeys("dinesh");
    driver.findElementById("txt_spouse_middlename").sendKeys("kumar");
    driver.findElementById("txt_spouse_lastname").sendKeys("Avulapati");
    
    driver.findElementById("txt_adr_res_house").sendKeys("Nethaji Nagar");
    driver.findElementById("txt_adr_res_city").sendKeys("Podalakur Road ");
    
    //WebElement  selectState =driver.findElementById("postal-state");
   // Select sc9= new Select(selectState );
    //  sc9.selectByVisibleText("Andhra Pradesh");
      

    WebElement state1=driver.findElementById("postal-state");
    Select sc10= new Select(state1);
     sc10.selectByValue("2");
     
     WebElement district2=driver.findElementById("postal-state");
     Select sc11= new Select(district2);
      sc11.selectByValue("8");
   
    
    driver.findElementById("txt_adr_res_pin").sendKeys("524004");
    driver.findElementById("txt_mobile").sendKeys("07495090425");
    driver.findElementByName("txt_email").sendKeys("dineshchoudari@gmail.com");
    driver.findElementByName("emergency_contact_add").sendKeys("Sravanthi kadiyla,89 closDewiSant,Cardiff,CF11 9EX");
    driver.findElementById("txt_emer_mobile").sendKeys("07495090425");
    driver.findElementById("txt_emer_email").sendKeys("Sravanthichowdary08@gmail"); 
    //driver.findElementByXPath("//input[@name='txt_emer_email'").sendKeys("sravanthichowdary08@gmail.com");
                                                                                                        
	
}}
