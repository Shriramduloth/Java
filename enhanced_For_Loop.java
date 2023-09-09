
public class enhanced_For_Loop {

    public static void main(String1[] args) {

        int nums[] = { 4, 3, 2, 1 };
        for (int n : nums) {
            System.out.print(n + " ");

        }

        System.out.println();

        int nums1[][] = {
                { 5, 3, 2, 1 },
                { 3, 4 },
                { 2, 5, 8 }
        };
        for (int a[] : nums1) {
            for (int b : a) {
                System.out.print(b + " ");

            }
            System.out.println();

        }

    }

}