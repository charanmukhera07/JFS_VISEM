import java.util.*;
class Reverse
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int a=sc.nextInt();
	int rev=0;
	while(a>0)
	{
	    int d=a%10;
	    rev=rev*10+d;
	    a=a/10;
	}
	System.out.println("reverse number:"+rev);
    }
}