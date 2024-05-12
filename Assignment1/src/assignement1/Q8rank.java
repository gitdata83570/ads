package assignement1;

import java.util.Scanner;

public class Q8rank
{

	public static void main(String[] args) 
	{
		int arr[]= {10, 20, 15, 3, 4, 4, 1};
		int ele,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the rank of element to be found : ");
		ele=sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) 
		{
		  if(arr[i]<=ele)
		  {
			count++;  
		  }
		}
		System.out.println("rank of element "+ele+" is :  "+count);
		

	}

}
