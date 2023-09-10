import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class SecondLargest {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		int a[]= {2,1,3,5,7};
		for(int i=0;i<a.length;i++) {
			list.add(a[i]);
		}
		Collections.sort(list);
		System.out.println(list.get(list.size()-2));
	}
}
/*
class Solution {
    int print2largest(int arr[], int n) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int el: arr) set.add(el);
        Integer num[]=new Integer[set.size()];
        num=set.toArray(num);
        int size=num.length;
        if(size==1) return -1;
        else return num[size-2];
    }
}
*/
