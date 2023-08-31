import java.util.HashMap;
import java.util.Set;
public class Unmatched {
public static void main(String[] args) {
	HashMap<Character,Integer> hm=new HashMap<>();
	String str="kamalika";
	for(int i=0;i<str.length();i++) {
		char c=str.charAt(i);
		if(hm.containsKey(c)) {
			int count=hm.get(c);
			hm.put(c,++count);
		}else hm.put(c,1);
	}
	Set<Character> chars=hm.keySet();
	for(Character ch: chars) {
		int c=hm.get(ch);
		if(c==1) System.out.println(ch+" "+c);
	}
}
}
