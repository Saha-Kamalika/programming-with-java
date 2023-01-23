import java.util.Scanner;
public class prac_set6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 1 sum of float array float[] num=new float[5];
        float sum=0;
        System.out.println("Enter the numbers: ");
        for(int i=0;i<5;i++)
            num[i]=sc.nextFloat();
        for(int i=0;i<5;i++)
            sum+=num[i];
        System.out.println("Sum of the array is "+sum);*/
        /* 2 an integer present in array or not
        int[] num = new int[5];
        boolean isPresent = false;
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < 5; i++)
            num[i] = sc.nextInt();
        System.out.println("Enter the integer: ");
        int c = sc.nextInt();
        for (int element : num) {
            if (c == element) {
                isPresent = true;
                break;
            }
        }
        if (isPresent == true) {
            System.out.println(c + " is present in the array");
        } else {
            System.out.println(c + " is not present in the array");

        }*/
        /* add 2 matrix
        int[][] m1={
                {1,2,3},
                {4,5,6}
        };
        int[][] m2={
                {1,2,3},
                {4,5,6}
        };
        int[][] result={{0,0,0},{0,0,0}};
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                result[i][j]=m1[i][j]+m2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println("\n");
        }*/
        /* reverse an array(creating a new array) int[] arr={1,2,3,4,5};
        int temp=0,j=5;
        int[] b=new int[j];
        for(int i=0;i<arr.length;i++){
            b[j-1]=arr[i];
            j--;
        }
        System.out.println("The new array is: ");
        for(int element: b)
            System.out.print(element+" ");*/
        /* existing array int[] arr={1,2,3,4,5};
        int temp=0;
        for(int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println("The new array is: ");
        for(int element: arr)
            System.out.print(element+" ");*/
        /* max element in an array int[] arr={1,2,3,4,5};
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum element is "+max);*/
        /* minimum in an array int[] arr={1,2,3,4,5};
        int min=arr[0];
        for(int ele: arr)
        {
            if(ele<min) {
                min=ele;
            }
        }
        System.out.println("The minimum element is "+min);*/
        int[] a={1,7,3,4,5};
        boolean isSorted=true;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                isSorted=false;
                break;
            }
        }
        if(isSorted==false)
        {
            System.out.println("The array is not sorted");
        }
        else{
            System.out.println("The array is sorted");
        }

    }
}
