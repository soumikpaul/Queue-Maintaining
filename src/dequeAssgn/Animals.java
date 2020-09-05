package dequeAssgn;

import java.util.Scanner;

public class Animals extends Parent{
	Scanner sc=new Scanner(System.in);
	String name;
	Animals()
	{
		System.out.println("Enter name of animal");
		name=sc.next();
	}

	String getName()
	{
		return this.name;

	}
	void printDetails() {
		System.out.println("Animal name : "+this.name+"\n");
	}
}
