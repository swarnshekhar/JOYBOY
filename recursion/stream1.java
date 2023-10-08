package recursion;

public class stream1 {
    public static void main(String[] args) {
        System.out.println("hi");
        skip("apurva", " ");
    }

    public static String skip(String p, String q) {
        for (int j = 0; j < p.length(); j++) {
            char ch = p.charAt(j);
            if (ch!= 'a') {
                return q + j;
            } else {
                return "aaka";
            }

        }
        return q;

    }
}