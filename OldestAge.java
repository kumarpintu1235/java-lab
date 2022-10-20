/*
Program: 2.WAP to take input of age of 3 people by user and determine oldest and yougest amoug them.
@author: Pintu Kumar
@Date: 20 oct 2022  
*/
//import packages 
import java.util.Scanner;
//declaring a class
 class OldestAge
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		//enter the three age
		System.out.println("Enter a age1=");
		inta=sc.nextInt();
		System.out.println("Enter a age2=");
		intb=sc.nextInt();
		System.out.println("Enter a age3=");
		intc=sc.nextInt();
        //chacking age
		if
		 (a>b&&b<c)
		 System.out.println("a is older& c is youngest");
		 else if
		   (a>b&&b<c)
		    System.out.println("c is older& b is youngest");
			else if
			  (a<c&&C>b)
			   System.out.println("b is older& c is youngest");
			   else if
			     (a>c&&c>b)
			     System.out.println("a is older& b is youngest");
				 else if
			     (c>b&&b>a)
			       System.out.println("c is older& a is youngest");
				   else if
			      (b<c&&c>a)
			      System.out.println("b is older& a is youngest");
}
}