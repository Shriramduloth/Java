public class type_overload {

   // public void show(byte n) {
   //     System.out.println("byte " + n);
   // }

    //2nd cmnt==
    //public void show(short n) {
    //    System.out.println("short " + n);
    //}

        //3rd cmnt==
    //public void show(char n) {
    //    System.out.println("char " + n);
    //}

    public void show(double n) {
        System.out.println("double " + n);
    }

   // 4th cmnt
   // public void show(int n) {
    //    System.out.println("int " + n);
    //}

    //5th cmnt
    //public void show(long n) {
    //    System.out.println("long " + n);
    //}

    public static void main(String[] args) {
        type_overload obj = new type_overload();
        byte b = 3;
        obj.show('P');
    }
}
