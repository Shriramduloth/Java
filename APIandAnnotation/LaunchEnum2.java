enum Result {
    PASS, FAIL, NR;

    int marks;

    Result() {
        System.out.println("Constructor in enum");
    }

    void setMarks(int marks) {
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }
}

public class LaunchEnum2 {
    public static void main(String[] args) {
        Result.PASS.setMarks(50);

        int m1 = Result.PASS.getMarks();
        System.out.println(m1);

        int m2 = Result.FAIL.getMarks();
        System.out.println(m2);
    }
}
