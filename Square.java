/*
Q3.Program: WAP to
@Author: Pintu kumar
@Date: 20 oct 2022
*/

//importing packages
import java.util.Scanner;
//Creating class
class Square
{
	public static void main(String args[])
	{
		// taking input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
		//menu
		System.out.println("1. Square");
		System.out.println("2. Cube");
		System.out.println("3. Even/Odd");
		
		int choice= sc.nextInt();
		
		//Switch case
		switch(choice)
		{
			case 1: square(int num1);
			        break;
			case 2: cube(int num1);
			       break;
			case 3: EvenOdd(int num1);
			      break;
		}
		
	}
	//Method for Square
	static void square(int num1)
	{
		int square = num*num;
		System.out.println("Square of number is : "+square);
	}
	
	//Method for Cube
	static void cube(int num1)
	{
		int cube = num*num*num;
		System.out.println("Square of number is : "+cube);
	}
	
	//Method for Even/Odd
	static void EvenOdd(int num1)
	{
		if(num1%2==0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");s
	}//end of  ifelse
	
	
}// end of class