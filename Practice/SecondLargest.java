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
