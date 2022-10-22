package Test;



/**
 * 핸드폰 번호 가리기
 */
public class test5{

    public static void main(String[] args) {
        String phone_number = "01033334444";
        String phone_number2 = "027778888";
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("phone_number = " + phone_number.replace(phone_number2.substring(0,phone_number2.length()-4),"*"));
        for (int i = 0; i < phone_number2.length()-4; i++) {
            stringBuilder.append(phone_number.substring(i,i+1).replaceAll("[0-9]","*"));
        };
        stringBuilder.append(phone_number2.substring(phone_number2.length()-4));
        System.out.println("phone_number = " + stringBuilder);
        answer = String.valueOf(stringBuilder);
        System.out.println("answer = " + answer);





    }
}
