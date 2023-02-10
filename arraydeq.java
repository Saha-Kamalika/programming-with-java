package classFiles;
import java.util.ArrayDeque;
public class arraydeq {
    public static void main(String[] args){
        ArrayDeque<Integer>ad=new ArrayDeque();
        ad.add(10);
        ad.add(15);
        ad.add(30);
        ad.addFirst(1);
        ad.offerFirst(0);  //same as above
        ad.removeFirst();
        ad.pollFirst(); //same as above
        for(Integer i: ad)
            System.out.print(i+" ");
        System.out.println();
    }
}
