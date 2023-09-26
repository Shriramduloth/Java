public class mutableString3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity());
        sb.append("s");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        
        StringBuilder sb1 = new StringBuilder("Ram");
        System.out.println(sb1.capacity());
        System.out.println(sb1.charAt(1));
        sb1.setCharAt(1, 'A');
        System.out.println(sb1);

         
        StringBuilder sb2 = new StringBuilder(100);
        System.out.println(sb2.capacity());
        sb2.append("Ram");
        System.out.println(sb2);
        sb2.trimToSize();
        System.out.println(sb2.capacity());

         
        StringBuilder sb3 = new StringBuilder("Ram yadav");
        System.out.println(sb3);
        System.out.println(sb3.reverse());
    }

}
