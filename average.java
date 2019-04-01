import java.util.Scanner;
class average
{
public static void main(String[] args)
{
Scanner scan= new Scanner(System.in);
System.out.println("enter the value of value of a:");
int a= scan.nextInt();
System.out.println("enter the value of value of b:");
int b= scan.nextInt();
System.out.println("enter the value of value of c:");
int c= scan.nextInt();
int sum=a+b+c;
int average= sum/3;
System.out.println("Average of three numbers is:" +average);
}
}
