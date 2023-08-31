
public class CheckRotation {
	public static boolean check(String or,String rot) {
		String dup=or+or;
		if(dup.indexOf(rot)!=-1) return true;
		else return false;
	}
	public static void main(String[] args) {
		if(check("kamalika","malikaka"))//yes
			System.out.println("True");
		else System.out.println("False");	
	}
}
