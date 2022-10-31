package Test.Level1;

/**
 * 하샤드 수
 */
public class test11 {
    public static void main(String[] args) {
        int x = 11;
        String number = String.valueOf(x);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
           sb.append(number.charAt(i));

        }
        System.out.println("value = " + sb);
        System.out.println("value = " + number.length());
      /*  System.out.println("first = " + first);
        System.out.println("second = " + second);
        int numberFirst = Integer.parseInt(first);
        int numberSecond = Integer.parseInt(second);
        if(x%(numberFirst+numberSecond) == 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }*/
    }



}
