public class MultiD {
    public static void main(String[] args) {

        int array2d[][] = new int[3][3];

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d.length; j++) {

                array2d[i][j] = (int) (Math.random() * 10);

                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
