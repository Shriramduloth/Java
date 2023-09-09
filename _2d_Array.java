public class _2d_Array {
    public static void main(String1[] args) {
        int nums[][] = new int[3][2];
        nums[0][0] = 5;
        nums[0][1] = 2;
        nums[1][0] = 8;
        nums[1][1] = 3;
        nums[2][0] = 9;
        nums[2][1] = 4;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        int nums1[][] = {
                { 5, 2 },
                { 8, 3 },
                { 9, 4 }
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.print(nums1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        // jagged arrays

        int nums2[][] = {
                { 5, 2, 4, 1 },
                { 8, 3 },
                { 8, 1, 9 }
        };
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j++) {

                System.out.print(nums2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        int nums3[][] = new int[3][];
        nums3[0] = new int[4];
        nums3[1] = new int[2];
        nums3[2] = new int[3];

       

}}
