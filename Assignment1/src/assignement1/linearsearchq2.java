package assignement1;

public class linearsearchq2 
{

	public static int linearsearch(int arr[],int key)
	{
		for (int i = (arr.length-1); i >=0; i--)
		{
			if(arr[i]==key)
			{
			  return i;	
			}
			
		}
		return -1;
		
	}
	public static void main(String[] args)
	{
		int arr[]= {20,10,50,80,90,50,70,50,90};
	   int index=linearsearch(arr,50);
	   if(index!=-1)
	   {
		   System.out.println("last occurrence is at index :"+index);
		   System.out.println("no of comparisons="+(arr.length-index));
	   }
	   else
	   {
		   System.out.println("element not found");
	   }
		

	}

}
