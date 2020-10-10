package emailapp;
import java.util.Scanner;
import java.util.Random;
public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity;
	private String alternateEmail;


// constructor gets first name and last name
// ask for department
//generate random password
// set alternate email
//change the password

	public Email(String first, String last)
	{
		firstName = first;
		lastName = last;
		System.out.println("EMAIL CREATED: " + firstName + " " + lastName);
		// call a method asking for department - return department
		department = setDepartment();
		System.out.println("Department: " + department);
		// call a method to create random password
		password = randomPassword(8);
		System.out.println("Your password is: " + password);
		// combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + "aeycompany.com";
		System.out.println("Your email is: " + email);
	}
	private String setDepartment()
	{
		System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1)
		{
			return "sales";
		}
		else if(depChoice == 2)
		{
			return "development";
		}
		else if(depChoice == 3)
		{
			return "accounting";
		}
		else 
		{
			return "";
		}
	}
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		char[] password = new char[length];
		for (int i = 0; i < length; i++)
		{
			int rand = (int)(Math.random()*passwordSet.length());
			password[i] =passwordSet.charAt(rand);
		}
		return new String(password);
	}
	public void setMailboxCapacity(int capacity)
	{
		mailboxCapacity = capacity;
	}
	public void setAlternateEmail(String altEmail)
	{
		alternateEmail = altEmail;
	}
	public void changePassword(String pass) 
	{
		password = pass;
	}
	public int getMailboxCapacity()
	{
		return mailboxCapacity;
	}
	public String getAlternateEmail()
	{
		return alternateEmail;
	}
	public String getPass()
	{
		return password;
	}
	public String showinfo()
	{
		return "Display name: " + firstName + " " + lastName +
				"\nCompany email: " + email +
				"\nMailbox capacity: " + mailboxCapacity;
	}
}