package Test.Level1;

public class test17 {
    public static void main(String[] args) {
        System.out.println("test start");
        String t = "3141592";
        String p = "271";

        for (int i = 0; i < t.length(); i++) {
            System.out.println("t = " + t.substring(i,p.length()));
        }

    }
}
