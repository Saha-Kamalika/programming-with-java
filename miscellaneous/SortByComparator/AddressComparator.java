import java.util.Comparator;

public class AddressComparator implements Comparator<Employee>{
	public int compare(Employee o1,Employee o2) {
		return o1.getadd().compareTo(o2.getadd());
	}

}
