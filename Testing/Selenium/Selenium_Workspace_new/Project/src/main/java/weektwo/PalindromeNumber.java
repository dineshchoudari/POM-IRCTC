package weektwo;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n ");
		int n=sc.nextInt();
		int temp=n,rev =0;
		while(temp!=0)
		{
		  rev=rev*10;             //0=0*10=0                //0=0*10=0                //1=1*10=10      //11=11*110                            
		  rev=rev+temp%10;        //0=0+0%10  rev=0              //0=0+12%10=1.2=rev  //10=10+1%10=11=rev//1221=1221+1%10=122
		 temp=temp/10;            //121=121/10 =  temp=12.1 //12=12/10=1.2            // 1=1/10=1        //
		  }
		  if(n==rev)
		  System.out.println("Given number is palindrome" );
			  
	      else{
		  System.out.println("Given number is not a palindrome "); 
			  }
		  }}
		



