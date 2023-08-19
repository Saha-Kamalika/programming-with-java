public class Test{
    public static void main(String[] args) {
        String s="kama";
        System.out.println(s.hashCode());
        s=s+"lika";
        System.out.println(s.hashCode());
        StringBuilder sb=new StringBuilder("kama");
        System.out.println(sb.hashCode());
        sb.append("lika");
        System.out.println(sb.hashCode());
    }
}
