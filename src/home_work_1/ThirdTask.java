package home_work_1;

public class ThirdTask {
    static int numberOne=-5;
    static int numberTwo=7;
    static double numberThree=3.34D;
    static double numberFour=-2.55D;
    public static void main(String[] args) {
        int result=Math.abs(numberOne);
        System.out.println(result);
        int result1=Math.addExact(numberOne,numberTwo);
        System.out.println(result1);
        double result2=Math.copySign(numberThree,numberFour);
        System.out.println(result2);
        int result4=Math.floorDiv(numberOne,numberTwo);
        System.out.println(result4);
        int result5=Math.max(numberOne,numberTwo);
        System.out.println(result5);
        int result6=Math.incrementExact(numberOne);
        System.out.println(result6);
        double result7=Math.asin(numberThree);
        System.out.println(result7);
        double result8=Math.cbrt(numberFour);
        System.out.println(result8);
        int result9=Math.floorMod(numberOne,numberTwo);
        System.out.println(result9);
    }
}
