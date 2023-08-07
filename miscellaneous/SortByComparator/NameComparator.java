import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
	public int compare(Employee o1,Employee o2) {
		return o1.getname().compareTo(o2.getname());
	}

}
