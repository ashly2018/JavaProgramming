package com.coreJavaProgramming;

public class IsAnagram {
	
	String s1 = "abc";
	String s2 = "bca";
	
	public boolean checkAnagram(String a1, String a2){
		char[] chars = a1.toCharArray();
		StringBuilder secondString = new StringBuilder(a2);
		for(char ch: chars){
			//indexOf check particular character in string a2
			int index = secondString.indexOf("" + ch);
			//if index not found we will get -1;
			System.out.println(index);
			if(index!= -1){
				secondString.deleteCharAt(index);
			}
		}
		if(secondString.length() == 0){
			return true;
			
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		
		IsAnagram obj = new IsAnagram();
		boolean returnData = obj.checkAnagram("abc", "bca");
		System.out.println("returnData----" + returnData);

	}

}
