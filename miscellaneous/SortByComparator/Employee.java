
public class Employee {
	private int age;
	private int id;
	private String name;
	private Address address;
	
	public Employee(int id,int age,String name,Address address) {
		super();
		this.id=id;
		this.age=age;
		this.name=name;
		this.address=address;
	}
	public int getid() {return id;}
	public void setid(int id) { this.id=id;}
	public int getage() {return age;}
	public void setage(int age) {this.age=age;}
	public String getname() {return name;}
	public void setname(String name) {this.name=name;}
	public Address getadd() {return address;}
	public void setadd(Address address) {this.address=address;}
	
	public String toString() {
		return "Employee (id=" +id +", age="+age+", name="+name+",address="+address+")";
		
	}
	
	
}
