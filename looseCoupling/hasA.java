package looseCoupling;

class student {
    private heart h;

    public student(heart h) {
        this.h = h;
    }

    public void call() {
        h.heartbeat();
    }

    public void setH(heart h)
    {
        this.h = h;
    }
}

class heart {
    public void heartbeat() {
        System.out.println("heart beats");
    }

}

public class hasA {
    public static void main(String[] args) {
        heart h = new heart();
        student s = new student(h);
        s.setH(h);
    }
}
