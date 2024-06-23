package dsa;

public class binarySearch {
    static int binary(int low,int high,int a[],int key){
        if(high<=low) return -1;
        int mid=low+(high-low)/2;
        if(a[mid]==key) return mid;
        else if(key>a[mid]) return binary(mid+1,high,a,key);
        return binary(low,mid-1,a,key);
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int n=4;
        int key=5;
        System.out.println(binary(0,n-1,a,key));
    }
}
