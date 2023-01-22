import java.util.Scanner;
public class bsort {


        public static void bubbleSort(int[] a,int n){
        int temp=0;
        int isSorted=0;
        for(int i=0;i<n-1;i++)
        {
            isSorted=1;
            System.out.println("\nAfter pass: "+(i+1)+"\n");
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    isSorted=0;
                }
            }
            if(isSorted==1)
                return;
        }
    }
    public static void display(int[] a,int n){
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
     public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of the array: ");
            int n=sc.nextInt();
            int[]a =new int[n];
            System.out.println("Enter the elements: ");
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            System.out.println("Array before sorting: ");
            display(a,n);
            bubbleSort(a,n);
            System.out.println("\nArray after sorting: ");
            display(a,n);

    }
}
