import java.util.Scanner;
class Min_max_search{
public static void main(String args[])
{
	Min_max_search sc=new Min_max_search();
	Scanner sc1=new Scanner(System.in);
	System.out.println("How many numbers you wnat in Array...");
	int size_arr=sc1.nextInt();
	int arr[]=new int[size_arr];
	System.out.println("Enter the "+size_arr+" Element in Array...");
	for(int i=0;i<arr.length;i++)
	{
	    arr[i]=sc1.nextInt();
	}
	System.out.println("Which Operation do u want to perform on array");
	System.out.println("1)  Find Minimum..");
	System.out.println("2)  Find Maximum..");
	System.out.println("3)  I want to search a element...");
	System.out.println("Enter Your Choise..");
	int choise=sc1.nextInt();
	switch(choise)
	{
		case 1:
		       System.out.println("The Minimun number from Array is "+sc.min(arr));
			   break;
		case 2:
		       System.out.println("The Maximum number from Array is "+sc.max(arr));
		       break;
		case 3:
		       System.out.println("Which Number do u want to find...");
		       int number =sc1.nextInt();
			   sc.search(arr,number);
		       break;
		default:
		       System.out.println("Enter Choise is Wrong Error...!!");	break;
	}
	
	
}
Min_max_search(){
	System.out.println("Welcome To Array World...!!");	
}
int min(int arr[]){
    int min=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<min)
		{
			min=arr[i];
		}
	}

    return min;
}
int max(int arr[]){
	 int max=arr[0];
	 for(int i=0;i<arr.length;i++)
	   {
		  if(arr[i]>max)
		   {
			max=arr[i];
		   }
	  }

    return max;
}
void search(int arr[],int number){
	int index=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==number)
		{
			System.out.println("Number is Found at index "+(i+1));
			index++;
		}
	}
	if(index==0)
	{
	System.out.println("Sorry Number is not present in given array..!! ");	
	}
	
}
}