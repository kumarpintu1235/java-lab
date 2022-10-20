/*
Q1.Program: WAP to 10% discount
@Author: Pintu kumar
@Date: 20oct2022
*/

//Importing packages
import java.util.Scanner;

//Creating class
class Discount1
{
	public static void main(String args[])
	{
		//taking input
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantity of Diwali Lights you want: ");
		int qty = sc.nextInt();
	    //total bill
		int total = 540*qty;
		System.out.println("Your bill amount is = "+total);
		
		//if else
		if(total>=2000)
		{
			int bill = total-(total*10)/100;
			System.out.println("Bill after 10% Discount is: "+bill);
		}
		else
		{
			System.out.println("Thanks for shopping...");
		}//end of  ifelse	
	}// end of main
}// end of class