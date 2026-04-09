public class Loops {

    public static void main(String[] args) {

        // for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // while loop
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(i);
        }

        // do while loop
        int x = 5;
        do {
            System.out.println(x);
            x--;
        } while (x != 0);

        // nested loop
        int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 } };

        for (int m = 0; m < nums.length; m++) {

            for (int n = 0; n < nums[m].length; n++) {

                System.out.println(nums[m][n]);
            }
        }

        // break
        for (int m = 0; m < nums.length; m++) {

            for (int n = 0; n < nums[m].length; n++) {

                if (nums[m][n] == 5) {

                    System.out.println("number 5 is present");

                    // break; exit the loop
                }
            }
        }

        // continue
        for (int m = 0; m < nums.length; m++) {

            for (int n = 0; n < nums[m].length; n++) {

                if (nums[m][n] == 5) {
                    continue; // skip 5
                }
                System.out.println(nums[m][n]);
            }
        }
    }
}
