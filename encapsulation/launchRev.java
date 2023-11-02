package encapsulation;


class Book{
 private int pgNo;

 void setPgno(int x){
    if (x>0)
    {pgNo=x;}
    else{
        System.out.println("pagal hai");
    }
 }
 
 int getPgno(){
    return pgNo;
 }

}
public class launchRev {

    public static void main(String args[])

    {
        Book b = new Book();
        b.setPgno(-100);
        System.out.println(b.getPgno());
    }

}