package string_stringbuilder;

public class performance {
    public static void main(String[] args) {
        String series="";
        for (int i = 0; i < 26; i++) {
            char alphabet=(char)('a'+i);
            series=series+alphabet+"     ";
            // System.out.println(series);
        }
        System.out.println(series);
     }
}
