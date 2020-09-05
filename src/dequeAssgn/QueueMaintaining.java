package dequeAssgn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QueueMaintaining {

	int last=0;
	int first=-1;
	int size;
	static Parent[] arrParent;
	BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
	QueueMaintaining(){
		while(true) 
		{
			try {
				System.out.println("Enter the maximum number of objects you want to create");
				size=Integer.parseInt(inp.readLine());
				arrParent=new Parent[size];
				break;
			}
			catch(Exception e)
			{
				System.out.println("Interger input require");
			}
		}
	}
	boolean isFull() 
	{ 
		return ((first == 0 && last == size-1)|| 
				first == last+1); 
	} 
	boolean isEmpty () 
	{ 
		return (first == -1); 
	} 
	void insertfirst(Parent key) 
	{ 
		if (isFull()) 
		{ 
			System.out.println("No of objects more than specified");  
			return; 
		}   
		if (first == -1) 
		{ 
			first = 0; 
			last = 0; 
		} 
		else if (first == 0) 
		{first = size - 1 ; 
		System.out.println("Check1");
		System.out.println(size);

		}

		else {
			first = first-1; 
			System.out.println("Check2");}

		System.out.println("first"+first);
		arrParent[first] = key ; 
	} 
	void insertlast(Parent key) 
	{ 
		if (isFull()) 
		{ 
			System.out.println(" No of objects more than specified "); 
			return; 
		} 
		if (first == -1) 
		{ 
			first = 0; 
			last = 0; 
		} 
		else if (last == size-1) 
			last = 0; 

		else
			last = last+1; 

		arrParent[last] = key ; 
	} 
	void deletefirst() 
	{ 
		if (isEmpty()) 
		{ 
			System.out.println("No objects\n"); 
			return ; 
		} 

		if (first == last) 
		{ 
			first = -1; 
			last = -1; 
		} 
		else
			if (first == size -1) 
				first = 0; 

			else  
				first = first+1; 
	} 
	void deletelast() 
	{ 
		if (isEmpty()) 
		{ 
			System.out.println(" No objects"); 
			return ; 
		} 

		if (first == last) 
		{ 
			first = -1; 
			last = -1; 
		} 
		else if (last == 0) 
			last = size-1; 
		else
			last = last-1; 
	}
	void display()
	{
		System.out.println(first+" "+last);
		int maxCount=size;
		for(int i=first;;i++)
		{
			if(i==size)
			{
				i=(i)%size;
			}
			arrParent[i].printDetails();
			if(i==maxCount||i==last)
				break;

		}
}
}

