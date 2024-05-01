import java.util.*;
import java.lang.*;
class Atm
{
    public static void main(String[] args)
    {
        int p=123;
        System.out.println("enter the pin");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a==p)
        {
    {
        System.out.println("welcome to atm");
        System.out.println("1.withdraw");
        System.out.println("2.deposite");
        System.out.println("3.account balance");
        System.out.println("select your option");
    }
    int x=30000;
    Scanner Sc=new Scanner(System.in);
    int b=sc.nextInt();
    switch(b)
    {
        case 1:
        System.out.println("enter  your amount");
        int y=sc.nextInt();
        if(y<=x)
        {
            System.out.println("transaction successful");
        }
        else
        {
            System.out.println("insufficient balance");
        }
        x-=y;
        System.out.println("remaining back balance:"+x);
        break;
        case 2:
        System.out.println("enter amount");
        int z=sc.nextInt();
        System.out.println("deposite successful");
        x+=z;
        System.out.println("bank balance:"+x);
        case 3:
        System.out.println("bank balance:"+x);
    }
    }
    if(a!=p)
    {
    System.out.println("pin incorrect");
    }
    }
}
 