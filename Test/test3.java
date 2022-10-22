package Test;

public class test3 {
    public static void main(String[] args) {


        //음양 더하기




        /*int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};*/
        int[] absolutes = {1,2,3};
        boolean[] signs = {false,false,true};
        int sum = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if(signs[i] == false) {
                int value = absolutes[i] * -1;
                absolutes[i] = value;
            }
            sum += absolutes[i];
        }
        System.out.println("sum = " + sum);
    }

}
