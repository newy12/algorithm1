/**
 * 핸드폰 번호 가리기
 */
public class test5 {

    public static void main(String[] args) {
        String phone_number = "01033334444";
        String phone_number2 = "027778888";


        System.out.println("phone_number.length()-4 = " + phone_number.length());



        System.out.println("phone_number???? = " + phone_number.replaceAll(phone_number.substring(0,phone_number.length()-4),"*"));

            System.out.println("value === "  + phone_number.replaceAll(phone_number.substring(phone_number.length()-4),"****"));
            System.out.println("value === "  + phone_number2.replaceAll(phone_number2.substring(phone_number2.length()-4),"****"));

        System.out.println("i = " + phone_number.substring(0,phone_number.length()-4).replace("*"));
        System.out.println("phone_number = " + phone_number.substring(phone_number.length()-4));
        System.out.println("phone_number = " + phone_number2.substring(phone_number2.length()-4));


    }
}
