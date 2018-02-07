package com.coreJavaProgramming;

public class CommonElementInArray {

	public static void main(String[] args) {
		int[] arr1 = {4,7,3,9,2};
		int[] arr2 = {3,12,2,9,40,30,4};
		
		for(int i = 0; i < arr1.length; i++){
			for(int j = 0; j < arr2.length ; j++){
				if (arr1[i] == arr2[j]){
					System.out.println("Common Element is : " + arr1[i]);
				}
			}
		}
		

	}

}
