package assignement1;

import java.util.Scanner;

public class q6nthoccurenceusingLinearsearch {

	public static int linearsearch(int arr[],int key,int occur)
	{
		int count=0;
		
		for (int i = 0; i <arr.length; i++)
		{
			if(arr[i]==key)
			{
				count++;
				//System.out.println("count is :"+count);
		       if(count==occur)	  
				{
		    	   return i;
				
				}
			}
			
		}
		return -1;
		
	}
	public static void main(String[] args)
	{
		int arr[]= {20,10,50,80,10,90,50,70,50,90};
	    int key,occur;
	   
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter key to be searched");
	    key=sc.nextInt();
	    System.out.println("enter the occurance no");
	    occur=sc.nextInt();
	   
	   
	   int index=linearsearch(arr,key,occur);
	   
	   if(index!=-1)
	   {
		   System.out.println(occur+"th occurrence is at index :"+index);
		 //  System.out.println("no of comparisons="+(arr.length-index));
	   }
	   else
	   {
		   System.out.println("element not found");
	   }
		

	}
}
