package dequeAssgn;

import java.util.Scanner;

public class Books extends Parent{
	Scanner sc=new Scanner(System.in);
	String name;
	int price;
	Books()
	{
		System.out.println("Enter name of book and price");
		name=sc.next();
		price=sc.nextInt();
	}

	String getName()
	{
		return this.name;

	}
	int getPrice()
	{
		return this.price;
	}
	void printDetails() {
		System.out.println("Book name : "+this.name+"\nBook Price : "+this.price+"\n");
	}
}
