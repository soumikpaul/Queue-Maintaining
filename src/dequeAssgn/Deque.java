package dequeAssgn;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Deque {
	public static void main(String[] args) {
		int choice=0,position;
		QueueMaintaining qm=new QueueMaintaining();
		Scanner sc=new Scanner(System.in);
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		while(true)
		{
			while(true) {
				try {
					System.out.println("What do you want to do\nCreate animal\nCreate book\nCreate Grocery\npress 1 2 3 4 to quit and display");
					choice=Integer.parseInt(br.readLine());//sc.nextInt();
					break;
				}
				catch(Exception e){
					System.out.println("Please give proper input");
				}
			}
			if(choice==4)
			{	
				break;
			}
			while(true) {
				try {
					System.out.println("Where do you want to push 1 for first, 2 for last");
					position=Integer.parseInt(br.readLine());
					break;
				}
				catch(Exception e)
				{
					System.out.println("Please give int input");
				}
			}
			if(choice==1)
			{
				Animals a=new Animals();
				if(position==1)
					qm.insertfirst(a);			
				else
					qm.insertlast(a);
			}
			if(choice==2)
			{
				Books book1=new Books();
				if(position==1)
					qm.insertfirst(book1);			
				else
					qm.insertlast(book1);
			}
			//		if(choice==3)
			//		{
			//			Grocery a=new Grocery();
			//		}
			while(true)
			{
				try {
					System.out.println("Do you want to pop? 1 for yes, 2 for no");
					int decision=Integer.parseInt(br.readLine());
					if(decision==1)
					{
						System.out.println("From where do you want to pop, 1 for first,2 for last");
						int value=Integer.parseInt(br.readLine());
						if(value==1)
							qm.deletefirst();
						else
							qm.deletelast();
					}
					break;
				}
				catch(Exception e)
				{
					System.out.println("Pleasee give proper input.");
				}

			}
		}
		qm.display();
		sc.close();
	}
}

