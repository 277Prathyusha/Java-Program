package conditionals;

import java.util.Scanner;

public class Projectbank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		String str=sc.nextLine();
		System.out.println("enter age:");
		int age=sc.nextInt();
		System.out.println("enter number:");
		String n=sc.next();
		System.out.println("enter Gender:");
		char c=sc.next().charAt(0);
		System.out.println("enter the balance:");
		double b=sc.nextDouble();
		System.out.println("enter 1 if you want loan & 2 if other operation");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
		{
			System.out.println("do you want loan? 1 for loan & 2 for not");
			int ch1=sc.nextInt();
			if(ch1==1)
			{
				System.out.println("enter loan amount");
				double loan=sc.nextDouble();
				if(loan<0) {
					System.out.println("enter valid amount");}
				else {
				System.out.println("enter the principle:");
				double p=sc.nextDouble();
				System.out.println("enter the time:");
				double t=sc.nextDouble();
				System.out.println("enter the rate of interest:");
				double r=sc.nextDouble();
				double intr=(p*t*r)/100;
				System.out.println("Interest:"+intr);
				double RT=(loan+intr);
				System.out.println("Return amount:"+RT);
				}}
			if(ch1==2)
			{
				System.out.println("THANK YOU");
			}
		}
		break;
		case 2:
		{
			System.out.println("enter 2 for deposit & 1 for withdraw");
			int ch2=sc.nextInt();
			if(ch2==1)
			{
				System.out.println("enter withdawal amount:");
				double WD=sc.nextDouble();
				if(b<WD)
				{
					System.out.println("insufficient balance");
				}
				else
				{
					double remain=(b-WD);
					System.out.println("Remaining balance after withdrawal:"+remain);
				}
			}
			if(ch2==2)
			{
				System.out.println("enter deposit amount:");
				double D=sc.nextDouble();
				double rmg=(b+D);
				System.out.println("Remaining balance after deposit:"+rmg);
			}
		}
		break;
		default:
			System.out.println("invalid number");
			
		}
	}

}
