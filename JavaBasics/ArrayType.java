public class ArrayType {
    public static void main(String[] args) {
        
        int[] numbers;

        // assigning array length
        numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        System.out.println(numbers[3]);


        // assigning values to each index
        int[] numArray = {1, 2, 3, 4, 5};

        System.out.println(numArray[3]);

        System.out.println(numArray.length);


        // iterate an array
        for(int i = 0; i < numArray.length; i++) {

            System.out.println(numArray[i]);
        }

        for(int num : numbers) {

            System.out.println(num);
        }


        // Multi-dimensional array
        // 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(matrix[2][1]);

        // iterate 2D array
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
