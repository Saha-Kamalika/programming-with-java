import java.util.Scanner;
public class prac_set5 {
    public static void main(String[] args) {
        /*1 ****
            ***
            **
            *
        */
        Scanner sc=new Scanner(System.in);
        /*for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }*/
        /* 2 sum first n even nos using while
        System.out.println("Enter the value of n: ");;
        int n=sc.nextInt();
        int i=n,num=0,sumEven=0;
        System.out.println("first "+n+" even numbers are: ");
        while(i!=0)
        {
            if(num%2==0) {
                System.out.print(num + " ");
                sumEven = sumEven + num;
                i--;
            }
            num++;
        }
        System.out.println("\nThe sum of first "+n+" even numbers is "+sumEven);*/
        /* 3 multiplication table of n
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" X "+ i +" = "+(num*i));
        }*/
        /* 4 multiplication table of n in reverse order
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        for(int i=10;i>=1;i--)
        {
            System.out.println(num+" X "+ i +" = "+(num*i));
        }*/
        /* 5 factorial using for loop
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int fact=1;
        for(int i=num;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println("The factorial of "+num+" is "+fact);*/
        /* 6 factorial using while loop
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int fact=1,i=num;
        while(i>=1)
        {
            fact=fact*i;
            i--;
        }
        System.out.println("The factorial of "+num+" is "+fact);*/
        /* 9 sum of the nos occurring in the multiplication table of 8*/
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            sum=sum+(8*i);
        }
        System.out.println("Sum is "+sum);
    }
}