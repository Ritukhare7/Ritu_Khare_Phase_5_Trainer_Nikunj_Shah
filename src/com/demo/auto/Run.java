package com.demo.auto;

public class Run {
	
	public static void main(String[] args) {
		
		String s = "th$s";
		String[] arr = s.split("");
		int len = arr.length;
		
		for(int i=0;i<len;i++) {
			if(arr[i].equals("$")) {
				System.out.println("$");
			}
			if(!arr[3-i].equals("$")) {
				System.out.println(arr[3-i]);
			}
			
		}
		
		
	}

}
