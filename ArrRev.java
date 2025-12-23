import java.util.*;
class ArrRev
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
	    int num=arr[i];
	    int rev=0;
	    while(num>0)
	    {
		int d=num%10;
	        rev=rev*10+d;
	        num=num/10;

	    }
	    System.out.println("reverse number:"+rev);
	}
    }
} 