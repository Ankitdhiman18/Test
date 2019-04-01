import java.util.Scanner;
class compare
{
public static void main(String[] args)
{
	Scanner scn= new Scanner(System.in);
	System.out.println("enter the value of a:");
	int a= scn.nextInt();
	System.out.println("enter the value of b:");
	int b= scn.nextInt();
	if(a>b)
	{
		System.out.println("a is greater");
	}
	else
	{
		System.out.println("b is greater");
	}
}
}
