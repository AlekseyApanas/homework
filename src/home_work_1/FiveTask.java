package home_work_1;

public class FiveTask {
    public static void main(String[] args) {
        boolean result=sleepIn(true,true);
        if (result) {
            System.out.println("Sleep on " );
        } else {
            System.out.println("Go to work ");
        }
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday|| vacation) {
            return true;
        } else {
            return false;
        }
    }
}



