package APIandAnnotation;

/**
 * LaunchDt
 */
public class LaunchDt {

   public static void main(String[] args) {
      java.util.Date dt = new java.util.Date();
      System.out.println(dt);

     long  dt1 = dt.getTime();

     java.sql.Date dt2 = new java.sql.Date(dt1);
     System.out.println(dt2);

   }
}