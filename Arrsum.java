import java.util.*;
class Arrsum
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int input[]=new int[n];
	int output[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    input[i]=sc.nextInt();
	    int sum=0;
	    int d=0;
	    int t=input[i];
	    while(t>0)
	    {
		d=t%10;
		output[i]=output[i]+d;
		t=t/10;
	    }
	}
	System.out.println("sum of digits:");
	for(int j=0;j<n;j++)
	{
	    System.out.println("sum of "+input[j]+"="+output[j]);
	}
    }
}