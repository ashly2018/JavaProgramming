package com.coreJavaProgramming;

public class CompressString {
	String s1 = "aaabbccd";

	// output should be a3b2c2d1
	public void compressString(String s1) {
		int count = 0;
		char temp = s1.charAt(0);
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == temp) {
				count++;

			} else {
				System.out.println(temp + " " + count);
				count = 1;
				temp = s1.charAt(i);

			}
		}
		System.out.println(temp + " " + count);
	}

	public static void main(String[] args) {

		CompressString obj = new CompressString();
		obj.compressString(obj.s1);

	}

}
