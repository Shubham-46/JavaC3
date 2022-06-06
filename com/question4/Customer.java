package com.question4;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class Customer {

	private String username;
	private String password;
	private String mobileNumber;
	private String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
class Demo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Customer cs=new Customer();
		System.out.println("Enter the userName");
		String userName=sc.next();
		System.out.println("Enter the password");
		String pass=sc.next();
		System.out.println("Enter the MobileNo");
		String mobileNo=sc.next();
		System.out.println("Enter the Email");
		String email=sc.next();
		
		
		if(!Pattern.matches("[a-zA-z]{3,8}",userName)) {
			return;
		}else if(!Pattern.matches("[0-9a-zA-Z]{3,8}",pass)){
			return;
		}else if(!Pattern.matches("[6789]{1}[0-9]{9}",mobileNo)) {
			return;
		}else {
			cs.setUsername(userName);
			cs.setPassword(pass);
			cs.setMobileNumber(mobileNo);
			cs.setEmail(email);
		}
		
		
		
		System.out.println("Your UserName "+cs.getUsername());
		System.out.println("Your Password "+cs.getPassword());
		System.out.println("Your Mobile "+cs.getMobileNumber());
		System.out.println("Your Email "+cs.getEmail());
		

	}















}
