package com.string;

import java.util.Scanner;

public class GmailOrYahoo {
	//WAP to accept email id of the user and check if it has "gmail" or "yahoo" in it.
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your email Id : ");
			String mailId=sc.nextLine();
			
			if(mailId.contains("gmail.com")) {
				System.out.println("Given id is Gmail");
			}
			else if(mailId.endsWith("yahoo.com")) {
				System.out.println("Given id i Yahoo");
			}
			else {
				System.out.println("Email doesn't contains email or yahoo");
			}
		}
}
