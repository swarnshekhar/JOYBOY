package recursion;

public class stream {
    public static void main(String[] args) {
        // skip("", "apurva");
        System.out.println(skip("swarn"));
        System.out.println(skipappnotapple("akuulaapplckha"));
    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }

    }   static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip(up.substring(1));
        } else {
           return ch + skip(up.substring(1));
        }

    }
      static String skipapple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skip(up.substring(5));
        } else {
           return up.charAt(0) + skip(up.substring(1));
        }

    }
    
      static String skipappnotapple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app")&&!up.startsWith("apple")) {
            return skip(up.substring(3));
        } else {
           return up.charAt(0) + skip(up.substring(1));
        }

    }
}