package Test.Level1;

/**
 * 부족한 금액 계산하기
 */
public class test15 {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;
        long answer = 0;
        int sum = 0;

        for (int i = 0; i < count; i++) {
            if(i == 0){
               sum = price;
               continue;
            }
           price += 3;
            sum += price;
        }
        if(sum > money){
            answer = sum-money;
            System.out.println("answer = " + answer);
        }else{
            answer = 0;
            System.out.println("sum = " + answer);
        }
    }




}
