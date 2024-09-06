package array;

public class Question_30 {
    public static void main(String[] args) {
        int[][] arr1 ={{1,2,3},{4,5,6},{7,8,9}};
        int countRow ;
        int countColummn = 0;

        int rows = arr1.length;
        int cols = arr1.length;

        for (int i = 0; i < rows; i++) {
             countRow = 0;
            for (int j = 0; j < cols; j++) {
                countRow += arr1[i][j];
            }
            System.out.println("Sum of " + (i) +" row: " + countRow);
        }
        System.out.println();
        for (int i = 0; i < rows; i++) {
            countRow = 0;
            for (int j = 0; j < cols; j++) {
                countRow += arr1[j][i];
            }
            System.out.println("Sum of " + (i) +" column: " + countRow);
        }



    }
}
