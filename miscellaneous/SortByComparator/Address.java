
public class Address implements Comparable<Address> {
	private String stname;
	private int pin;
	
	public Address(String stname,int pin) {
		super();
		this.stname=stname;
		this.pin=pin;
	}
	public String getStname() { return stname;}
	public void setStname(String stname) { this.stname=stname;}
	public int getpin() { return pin;}
	public void setpin(int pin) { this.pin=pin;}	
	public int compareTo(Address o) { return this.getpin()-o.getpin();}
	
	public String toString() { return stname+","+pin;}
}
