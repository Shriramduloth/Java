class Calc {

    public int add(int nums[]){
        int result=0;
        for (int n : nums) {
           result =result+n;
        }
        return result;   
    }
}

public class anonymousArray {
    public static void main(String1[] args) {
        Calc obj =new Calc();
      int  result=obj.add(new int[]{5,3,7,9});
        System.out.println(result);

    }


    
}
