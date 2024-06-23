package dsa;

public class linearSearch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int n=5;
        int key=10;
        for(int i=0;i<n;i++){
            if(a[i]==key) {
                System.out.println("found at "+i);
                return;
            }
        }
        System.out.println("not found");
    }
}
