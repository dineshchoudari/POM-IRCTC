package learnstrings;

public class TwoStrings {

	public static void main(String[] args) {
		String temp="";
	    String s1="ABCDEFG";
	    String s2="XYZ";
	    for(int i=0;i<s1.length();i++){
	    		 temp= temp+s1.charAt(i);
	    		if (i<s2.length()) {
	    			temp=temp+s2.charAt(i);
	    	}
	    		System.out.println(temp);
	    }

	}

}