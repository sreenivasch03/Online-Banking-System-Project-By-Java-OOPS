package sre;
import java.util.Scanner;
public class BankAccount {
	public int accountNumber = 123456;
	public String holderName = "Bhagat singh";
	public int password = 1234;
	public double balance = 1000.0;
	
	public void withdrawMoney(int accountNum,Scanner sc)
	{
		if(accountNum==accountNumber)
		{
			System.out.print("Enter your amount to withdraw : ");
			double amount = sc.nextDouble();
			if(amount>0 && amount<=balance)
			{
				System.out.print("Enter your password : ");
				int passWord = sc.nextInt();
				if(passWord==password)
				{
					balance = balance - amount;
					System.out.println("Holder Name :"+holderName);
					System.out.println("Account Number :"+accountNumber);
					System.out.println(amount+" Withdraw succesfully..");
					System.out.println("Now, Your account balance is :"+balance);
				}
				else
				{
					System.out.println("Incorrect password..Please Check!");
				}
			}
			else
			{
				System.out.println("Insufficient balance in your account..Please Check!");
			}
		} 
		else
		{
			System.out.println("Your account not found..Please Check!");
		}
	
	
	}
	public void deposit(int accountnumber,Scanner sc)
	{
		if(accountnumber==accountNumber)
		{
			System.out.print("Enter your amount to deposit : ");
			double amount = sc.nextDouble();
			if(amount>0)
			{
				System.out.print("Enter your password : ");
				int passWord = sc.nextInt();
				if(passWord==password)
				{
					balance = balance +amount;
					System.out.println("Holder Name :"+holderName);
					System.out.println("Account Number :"+accountNumber);
					System.out.println(amount+" Deposited succesfully..");
					System.out.println("Now, Your account balance is :"+balance);
				}
				else
				{
					System.out.println("Incorrect password..Please Check!");
				}
			}
			else
			{
				System.out.println("Invalid amount..Please Check!");
			}
		} 
		else
		{
			System.out.println("Your account not found..Please Check!");
		}
	}
	public void checkBalance(int accountNum,Scanner sc)
	{
		if(accountNum==accountNumber)
		{
			System.out.print("Enter your password :");
			int pass = sc.nextInt();
			if(pass==password)
			{
				System.out.println("Your current balance is : "+balance);
			}
			else
			{
				System.out.println("Incorrect password..Please Check!");
			}
		} 
		else
		{
			System.out.println("Your account not found..Please Check!");
		}
	}

}
