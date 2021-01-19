package weektwo;

import java.util.Scanner;

public class FactorialofaNumber {

	public static void main(String[] args) {		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of  n");
		 int n=s.nextInt();
		 int fact=1;
	     for(int i=n;i>=1;i--){
	    	 
	    	 fact=fact*i;
	     }
	     System.out.println("Factorial value is " +fact);
	    	}
	}


 