public class LaunchEnum3 {
    enum Result {
        PASS, FAIL, NR;
    }

    public static void main(String[] args) {
        Result res = Result.PASS;

        switch (res) {
            case PASS:
                System.out.println("Passed!");
                break;
            case FAIL:
                System.out.println("Failed");
                break;
            case NR:
                System.out.println("No Result");
                break;
            default:
                break;
        }
    }
}
