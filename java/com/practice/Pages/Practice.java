package com.practice.Pages;

public class Practice {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Raj");
		sb.append("kumar");
		sb.insert(0, "Darani$#&&%#&565666464646");
		System.out.println(sb);
		sb.deleteCharAt(3);
		System.out.println(sb);
        String s=sb.toString();
		System.out.println(s);
		s=s.replaceAll("[^a-zA-Z]","");
		System.out.println(s);
		StringBuilder sb1=new StringBuilder(s);
		System.out.println(sb1);
		int b=sb1.compareTo(sb);
		System.out.println(b);
		


	}

}
