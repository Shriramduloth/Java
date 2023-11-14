public class local_instance_var {

    int a=2;
    String name;

    public static void main(String[] args) {


        local_instance_var obj1 = new local_instance_var();
        local_instance_var obj2 = new local_instance_var();

        obj1.a=5;
        obj2.name="ram";

        System.out.println(obj1.a);
        System.out.println(obj1.name);
        System.out.println(obj2.a);
        System.out.println(obj2.name);
        
        




    }
}