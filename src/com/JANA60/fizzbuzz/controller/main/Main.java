package com.JANA60.fizzbuzz.controller.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int num=0;
		
		do
		{
			System.out.println("Insert the maximum number you want to reach playing from 1 up to 200:");
			num= Integer.parseInt(keyboard.nextLine());
			
			if (num<1 && num>=200)
				System.out.println("Invalid number: accepted values are between 1 and 200. Try again");
			
		}while(num<1 && num>=200);
			
		
		

		for (int i=1; i<=num;i++)
		{
			String res="";
			
			if (i%3==0)
				res+="fizz ";
			if(i%5==0)
				res+="buzz";
			
			if(i%3!=0 && i%5!=0)
				res+=i;
			
			System.out.println(res);
		}
		
		keyboard.close();
	}

}
