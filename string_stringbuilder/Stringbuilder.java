package string_stringbuilder;

public class Stringbuilder {
    public static void main(String[] args) {
      StringBuilder builder =new StringBuilder();
      for (int i = 0; i < 26; i++) {
        char alphabet=(char)('a'+i);
        builder.append(alphabet);
    }
    System.out.println(builder);
    builder.deleteCharAt(4);
    System.out.println(builder);
    builder.reverse();
    System.out.println(builder);
builder.append("hello");
System.out.println(builder);
    // or builder.tostring it's same
}

}