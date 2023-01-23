import java.util.Scanner;
public class prac_set7 {
    /* multiplication table static void multi(int n)
    {
        for(int i=1;i<=10;i++)
            System.out.format("%d X %d = %d\n",n,i,(n*i));
    }*/
    /*static void pattern(int n)
    {
        for(int i=01;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }*/
    /*static int nsum(int n)
    {
        if(n==1)
            return 1;
        return n+nsum(n-1);

    }*/
    static int fibo(int n)
    {
        if(n==1 || n==2)
            return n-1;
        else
            return fibo(n-1)+fibo(n-2);
    }
    static int fibbo(int n)
    {
        if(n<=1)
            return n;
        else
            return fibbo(n-1)+fibbo(n-2);
    }
    static void average(float[] arr,int n)
    {
        float sum=0;
        for(int i=0;i<n;i++)
           sum+=arr[i];
        System.out.println("Average of these "+n+" marks is "+(sum/n));
    }
    static void pattern_rec(int n)
    {
        if(n>0)
        {
            pattern_rec(n-1);
            for(int i=0;i<n;i++)
                System.out.print("* ");
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        //multi(7);
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Enter the no of rows: ");
        int n=sc.nextInt();
        pattern(n);*/
        //System.out.println("Enter the value of n: ");
        /*int n=sc.nextInt();
        System.out.println("Sum of first "+n+" natural numbers is "+nsum(n));*/
        /*System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("The "+n+" th term of the fibonacci is "+fibo(n));*/
        /*System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            System.out.print(fibbo(i)+ " ");*/

        System.out.println("Enter the no of subjects: ");
        int n=sc.nextInt();
        float[] arr=new float[n];
        System.out.println("Enter the marks: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextFloat();
        average(arr,n);
    }
}
