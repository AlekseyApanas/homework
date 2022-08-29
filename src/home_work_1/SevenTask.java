package home_work_1;

import java.util.Arrays;
import java.util.Random;

public class SevenTask {
    public static void main(String[] args) {
        int[] arrayPhoneNumber = new int[10];
        for (int i = 0; i < arrayPhoneNumber.length; i++) {
            int number=RandomUtil.getRandom(0,9);
            arrayPhoneNumber[i]=number;
        }
        String finalNumberPhone=createPhoneNumber(arrayPhoneNumber) ;

        System.out.println(finalNumberPhone);
    }

    public static String createPhoneNumber(int [] arrayPhoneNumber){
        String numberPhone= Arrays.toString(arrayPhoneNumber);
        /*numberPhone=numberPhone.replaceAll("[|]","");-не отрабатывает ,пришлось увеличить substring на 1 индекс*/
        numberPhone=numberPhone.replaceAll(", ","");
        String firstThreeElements=numberPhone.substring(1,4);
        String secondThreeElements=numberPhone.substring(4,7);
        String lastFourElements=numberPhone.substring(7,11);
        return "(".concat(firstThreeElements).concat(")").concat(" ").concat(secondThreeElements).concat("-").concat(lastFourElements);
    }

    public static class RandomUtil {
        private static final Random random = new Random();
        public static int getRandom(int min, int max) {
            return random.nextInt((max - min) + 1) + min;
        }
    }
}
