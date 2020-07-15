package com.emailUtil;

import java.util.Scanner;

public class EmailHelper {

	private String firstName;
	private String lastName;
	private String email;
	private String altEmail;
	private String defaultPassword;
	private String newPassword;
	private int mailCapacity = 500;
	private String department="DEFAULT";
	private String companyName="GCorp.com";

	public EmailHelper(String firstname, String lastname) {
		this.firstName = firstname;
		this.lastName = lastname;
		
		String fullName = this.firstName + this.lastName;
		Function.alphabetChecker(fullName);
		
		// Setting department of an employee
		this.department=setDepartment();
		System.out.println("Department: "+this.department);
		
		// setting email address of an employee
		this.email = getEmailAddress();
		System.out.println("Email: "+this.email);
		
		//generating random password for an employee
		
		this.defaultPassword = getRandomPassword(10);
		System.out.println("Password: "+this.defaultPassword);
		

	}

	public String setDepartment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Department Code: \n" + "1. Sales100\n" + "2. Development101\n" + "3. Marketing102"
				+ "\nEnter your Department code: \t");
		int choiceCode = sc.nextInt();
		sc.close();
		switch (choiceCode) {
		case 1: {
			return "Sales";
		}
		case 2: {
			return "Development";
		}
		case 3: {
			return "Marketing";
		}
		default:
			return "";
			}
	}
	
	public void setEmailAddress(String email) {
		this.email = email;
	}
	
	public String getEmailAddress() {
		
		if(this.department==null) {
			String mail = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companyName.toLowerCase();
			return mail;
		}
		else {
		
		String mail =firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department.toLowerCase()+"."+companyName.toLowerCase();
		return mail;
		}
		
	}
	
	

	
	public String getRandomPassword(int size) {
		
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$*~";
		int length = passwordSet.length();
		char[] defPassword = new char[size];
		for(int i=0;i<size;i++) {
			int randomValue=(int) Math.random()*length;
			  defPassword[i]=passwordSet.charAt(randomValue);
			  /* since we are accessing strings that is why we do charat()	 not passwordSet[randomValue] like you did.*/
			
		}
		return defPassword.toString(); // defPassword is a bunch of character so we need to convert it into a string
		
		
	}
	
	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
		
	}
	
	public String getAltEmail() {
		return "Alternate Email: "+altEmail;
	}
	

	
	public void setMailCapacity(int mailCapacity) {
		this.mailCapacity = mailCapacity;
	}
	
	public String getMailCapacity() {
		return "Mail Capacity: "+ mailCapacity;
	}
	
	public String getNewPassword() {
		return "New Password: "+newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword=newPassword;
	}
	
	public void showInformation() {
		System.out.println("\n\n Employee Details:\n"+
							email+"  \n"+defaultPassword+"  \n"//+altEmail+"  \n"+ mailCapacity
	
				
				);
	}
	
	

}
