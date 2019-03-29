import java.util.Scanner;
class evenOdd
{
 public static void main(String[] args)
{
 Scanner scn= new Scanner(System.in);
 System.out.println("please enter a valid value:");
 int a=scn.nextInt();
 if(a%2==0)
{
System.out.print("value of a is even");
}
else
{
System.out.print("value of a is odd");
}
}
}