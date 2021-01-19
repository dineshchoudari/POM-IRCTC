package weektwo;

import java.util.Scanner;

public class ConditionsAndLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		
			int a=sc.nextInt();
		
		//int a=17;
		
		if(a>10){
			System.out.println("a is greater than 10");
		}else if(a<10){
			System.out.println("a is less than 10");
		}else if(a==10){
			System.out.println("a equals to 10");
		}
		
	
		//i=i+1;
		
		for(int i=10;i>=1;i--){
		System.out.println("good morning");
		}
		
		/*
		while(a>10){
			System.out.println("I am in while loop");
			a--;
		}
		*/
		
		/*
		do{
			System.out.println("i am in do while loop");
			a--;
		}while(a>10);
		*/
		
		
		
		switch (a) {
		case 1:
			System.out.println("English");
			break;
		case 2:
			System.out.println("Hindi");
			break;
		case 3:
			System.out.println("Regional Langauage");
			break;
		default:
			System.out.println("Invalid Option!!!");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
