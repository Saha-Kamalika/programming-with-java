import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Employee e1=new Employee(1,99,"kamalika",new Address("MLB Road",100));
		Employee e2=new Employee(1,11,"srijit",new Address("Boinchipota",150));
		Employee e3=new Employee(1,28,"kama",new Address("Bally",99));
		Employee e4=new Employee(1,69,"lika",new Address("Laketown",102));
		
		List<Employee> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		System.out.println("Unsorted List: "+list);
		System.out.println("Sorted by age: ");
		Collections.sort(list,new AgeComparator());
		System.out.println(list);
		
		System.out.println("Sorted by name: ");
		Collections.sort(list,new NameComparator());
		System.out.println(list);
		
		System.out.println("Sorted by address: ");
		Collections.sort(list,new AddressComparator());
		System.out.println(list);
	}
}
