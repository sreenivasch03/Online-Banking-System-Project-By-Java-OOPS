package sre;
import java.util.Scanner;
public class OnlineBankingSystem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BankAccount ba = new BankAccount();
		
		boolean status = true;
		
		while(status)
		{
			System.out.println("--------------------------------");
			System.out.println("   * ONLINE BANKING SYSTEM *");
			System.out.println("--------------------------------");;
			System.out.println(" 1.Money withdraw \n 2.Deposit \n 3.Check balance \n 4.Exit");
			System.out.print("SELECT YOUR OPTION :");
			int choice = sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("* YOU SELECTED MONEY WITHDRAW *");
				System.out.print("Enter your account number : ");
				int accNumber = sc.nextInt();
				ba.withdrawMoney(accNumber, sc);
				break;
			
			case 2:
				System.out.println("* YOU SELECTED DEPOSIT *");
				System.out.print("Enter your account number : ");
				int accountNumber = sc.nextInt();
				ba.deposit(accountNumber, sc);
				break;
			case 3:
				System.out.println("* YOU SELECTED CHECK BALANCE *");
				System.out.println("Enter your account number :");
				int acNumber = sc.nextInt();
				ba.checkBalance(acNumber, sc);
				break;
			case 4:
				System.out.println("Thank you for visting..!");
				status = false;
				break;
			default :
				System.out.println("Invalid option..Please Check!");
				
			}
				
		}
		
	}

}
