package dsa;

public class arr {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int n=5,d=2;
        int p=1;

//        while(p<=d){
//            int last=a[0];
//            for(int i=0;i<n-1;i++){
//                a[i]=a[i+1];
//            }
//            a[n-1]=last;
//            p++;
//        }
        d = d % n; // Ensure d is within the bounds of the array length
        for (int i = 0; i < n; i++) {
            if (i < d) {
                // For the first 'd' elements, print the elements from the end of the array
                System.out.print(a[n - d + i] + " ");
            } else {
                // For the rest of the elements, print the elements from the beginning of the array
                System.out.print(a[i - d] + " ");
            }
        }


//        for(int i=0;i<n;i++){
//            System.out.print(a[i]+" ");
//        }
    }
}
