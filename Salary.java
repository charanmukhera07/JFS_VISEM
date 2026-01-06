import java.util.*;
public class Salary
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList<Integer> a=new ArrayList<>();
	for(int i=0;i<n ;i++)
	{
	    System.out.println("enter salary of employee"+(i+1)+":");
	    int salary=sc.nextInt();
	    a.add(salary);
	}
	int sum=0;
	for(int sal:a)
	{
	    sum+=sal;
	}
	float avg=(float)sum/n;
	System.out.println("Average salary is:" +avg);
    }
}