/**
 * LaunchEnum
 */
enum Week {
    MON, TUE, WED, THR, FRI, SAT, SUN;
}

public class LaunchEnum {

    enum Result
    {
        PASS,FAIL,NR;
    }
    public static void main(String[] args) {
        System.out.println(Week.MON);

        Week[] w = Week.values();
        for (Week w1 : w) {

            System.out.println(w1 + ":" + w1.ordinal());
        }
        int index = Week.MON.ordinal();
        System.out.println(index);

        Result r = Result.PASS;
        System.out.println(r);

    }
}