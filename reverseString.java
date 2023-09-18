public class reverseString {
    

    public static void main(String[] args) {
        
        // String str1 = "VAibhav";
        // String str2= "";


        // for (int i = str1.length()-1; i >=0; i--) {

        //     str2= str2+ str1.charAt(i) ;
            
        // }

        // System.out.println("Bfore reversing "+ str1);
        // System.out.println("After reversing "+ str2);


        // String str1 = "Vaibhav Pardhan";
        // String str2 = "";
        
        // String sarr[]=str1.split(" ");

        // for (int i = sarr.length-1; i>=0; i--) {

        //     str2 = str2+sarr[i]+ " ";
        // }
        // System.out.println("Bfore reversing "+ str1);
        // System.out.println("After reversing "+ str2);

            
        
        // String str1 = "Vaibhav Pardhan";
        // String str2 = "";
        
        
        // for (int i = str1.length()-1; i>=0; i--) {
            
        //     str2 = str2+str1.charAt(i);
        // }
        // System.out.println("Bfore reversing "+ str1);
        // System.out.println("After reversing "+ str2);



        String str1 = "Vaibhav Pardhan";
        String str2 = "";
        String sarr[]=str1.split(" ");
        
        for (String A: sarr) {
            for (int i = A.length()-1; i >=0; i--) {

                str2=str2+A.charAt(i);
                
            }   
            


           str2 =str2 + " " ;
        
        }
        System.out.println("Bfore reversing "+ str1);
        System.out.println("After reversing "+ str2);
    }
}

