public class ternary 
{
    public static void main(String[] args) 
    {
        //int a = 30;
        //int b = 20;
        //int res = (a < b) ? a : b;
        //System.out.println(res);
        //String result = (a < b) ? "a is less " : "b is less";
        //System.out.println(result);

        
        int a = 30, b = 20, c = 40;
        int num = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        System.out.println(num);

        String result = (a < b) ? (a < c ? "a is less" : "c is less") : (b < c ? "b is less" : "c is less");
        System.out.println(result);

        



    }
}
