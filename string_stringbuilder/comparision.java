package string_stringbuilder;

public class comparision {
    public static void main(String[] args) {
        String a="swarn";
        String b="swarn";
        System.out.println(a==b);
        //proves about no recreation of same object in string pool
        String c=new String("swarn");
        String d=new String("swarn");
        System.out.println(c==d);
        System.out.println(c.equals(d));
        System.out.println(c.charAt(0));
    }
}
