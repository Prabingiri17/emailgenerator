package com.emailapplication;

import java.util.Scanner;

import com.emailUtil.EmailHelper;

public class EmailMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee's First Name: ");
		String fname = sc.nextLine();
		System.out.println("Enter Employee's Last Name: ");

		String lname = sc.nextLine();
		
		EmailHelper emailhelper = new EmailHelper(fname, lname);

		//emailhelper.setAltEmail("Prabin.giri.17@gmail.com");
		//	System.out.println(emailhelper.getAltEmail());
		//emailhelper.setNewPassword("Prabin200");
		//System.out.println(emailhelper.getNewPassword());
		//System.out.println(emailhelper.getMailCapacity());

		emailhelper.showInformation();
	}

}
