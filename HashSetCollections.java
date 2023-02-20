package classFiles;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
public class HashSetCollections {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> s=new HashSet<>();
        System.out.println("Enter the no of nodes: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the "+(1+i)+"th value: ");
            int data=sc.nextInt();
            s.add(data);
        }
        if(s.contains(1)) {
            System.out.println("The set contains 1");
            s.remove(1);
            System.out.println("We deleted 1");
        }
        Iterator i=s.iterator();
        System.out.print("The Set is: ");
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
    }
}
