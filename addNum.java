import java.util.Scanner;
class addNum
{
public static void main(String[] args)
{
Scanner scn= new Scanner(System.in);
System.out.println("please enter a number:");
int a=scn.nextInt();
int x,y,z,c,sum;
x=a/10; 
y=a%10; 
z=x%10; 
c=x/10;   
sum=y+z+c;
System.out.println("sum of integers is:"+sum);
}
}
