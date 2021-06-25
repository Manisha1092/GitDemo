package com.test;

public class StiringPlindromTest {
	
	static void returrnpalindrom(String s) {
		
		//taking string 
		char[] c=s.toCharArray();
		char s1;
		
		//abac 0,1,2,3,length= 3/2 then ..
		
		//ss=charAt(2); c+
		
		for(int i=s.length()-1;i>0;i--) {//a b a 
			
			//printing the value for debug purpose 
			System.out.println(s.length());
			s1 = s.charAt(i);
			System.out.println(s1);
			
			
			
			//System.out.println(c1);
			
		}
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		String input="aba";
		
		char firstIndex=input.charAt(0);
		char lastIndex=input.charAt(input.length()-1);
		if(firstIndex == lastIndex) {
			
		System.out.println("palinrom ");
		
		}else {
			System.out.println("not palinrom ");
		}
		
		//returrnpalindrom(input);
			
		}

 
	
}
