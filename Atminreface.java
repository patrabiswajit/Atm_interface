//import required classes and packages
import java.util.Scanner;

//create ATMExample class to implement the ATM functionality
class ATMExample
{
	//main method starts
	public static void main(String[] args)
	{
		//declare and initialize balance,withdraw and depsit

		int balance=10000,withdraw,deposite;

		//create scanner class object to get choice of user

		Scanner sc=new Scanner(System.in);

		while(true)
		{
			System.out.println("Automated Teller Machine");
			System.out.println("choose 1 for Withdraw");
			System.out.println("choose 2 for Deposite");
			System.out.println("choose 3 for Check Balance");
			System.out.println("choose 4 for Exit");
			System.out.println("choose the operation you want to perform:");

			//get choice from user

			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				System.out.println("Enter money to be withdrawn:");

			//get the withdrawl money from user
			
			withdraw=sc.nextInt();

			//check whether the balance is greater than or equalto the withdrawal amount

			if(balance>=withdraw)
			{
				//remove the withdrawl amount from the total balance

				balance=balance-withdraw;
				System.out.println("please colllect your money");
			}
			else
			{
				//show custom error message
				System.out.println("Insufficient Balance");
			}
			System.out.println("");	

			break;
				case 2:

				System.out.println("Enter money to be deposited:");

				//get deposited amount from to user

				deposite=sc.nextInt();

				//add the deposite amount to the total balance

				balance=balance+deposite;
				System.out.println("Your Money has been successfully deposited");
				System.out.println("");
			break;
				case 3:
				//displaying the total balance of the user

				System.out.println("Balance:"+balance);
				System.out.println("");
			break;
				case 4:
				//exit from the menu
				System.out.println(0);
			}
		}	
	}		
}			
			

		
	
