/*Enter No Of Value Input In First Link List:-  
4
5
6
7
8
First Link List values are =	[5, 6, 7, 8]
Enter No Of Value Input In Second Link List:-  
4
9
10
11
12
Second Link List values are =	[9, 10, 11, 12]
After Operation First Link List values are =	[5, 6, 7, 8, 9]
After Operation Second Link List values are =	[10, 11, 12]
*/
package com.sathya.raghu;

import java.util.LinkedList;
import java.util.Scanner;

public class ListNone {

	public static void main(String[] args) {
		
		LinkedList<Integer> obj=new LinkedList<Integer>();
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No Of Value Input In First Link List:-  ");
		int n= sc.nextInt();
		for(int i=0;i<n;i++)
		{
			obj.add(sc.nextInt());
		}
		
		System.out.println("First Link List values are =" +"\t" +obj);
				
		LinkedList<Integer> obj1=new LinkedList<Integer>();
		System.out.println("Enter No Of Value Input In Second Link List:-  ");
		int n1= sc.nextInt();
		for(int i=0;i<n1;i++)
		{
			obj1.add(sc.nextInt());
		}
		
		System.out.println("Second Link List values are =" +"\t" +obj1);
		int c=obj1.element();
		//System.out.println(c);
		obj.add(c);
		System.out.println("After Operation First Link List values are =" +"\t" +obj);
		obj1.removeFirst();
		
		System.out.println("After Operation Second Link List values are =" +"\t" +obj1);
	}

}
