public class mutableString {
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer("Ram");
        // //StringBuffer sb="";//invalid
        // System.out.println(sb);
        // sb.append(" Yadav");
        // System.out.println(sb);

        StringBuilder sb = new StringBuilder("Ram ");
        System.out.println(sb);
        sb.append("Yadav");
        System.out.println(sb);
    }
    
}
