package weektwo;

public class PrimeNumber {
	
	// 2 is the lowest prime number 
	
	public static boolean isPrimeNumber(int num){
	
		if(num<=1){
			return false;
		}
		for(int i=2;i<num;i++){
			if(num% i==0);
			return false ;				
		}
		return true ;
		
	}
	public static void  getPrimeNumbers(int num){
		for(int i=2;i<=num;i++){
		if(isPrimeNumber(i));
		System.out.println(i +  "");
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2 is prime number " +isPrimeNumber(2));
		System.out.println("3 is prime number " +isPrimeNumber(3));
		System.out.println("10 is prime number " +isPrimeNumber(10));
		System.out.println("0 is prime number " +isPrimeNumber(0));
		System.out.println("-3 is prime number " +isPrimeNumber(-3));
		
		getPrimeNumbers(7);
		
		getPrimeNumbers(20);
		
		
		
		
		
	}

}


