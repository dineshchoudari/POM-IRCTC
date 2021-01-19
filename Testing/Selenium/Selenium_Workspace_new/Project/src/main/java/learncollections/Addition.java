package learncollections;

import org.openqa.selenium.chrome.ChromeDriver;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new Addition(10,20);
		ChromeDriver driver = new ChromeDriver();	
	}
	public  Addition(int a, int b){
		int c= a+b;
		System.out.println(c);
	}
	
	
	
	
}
