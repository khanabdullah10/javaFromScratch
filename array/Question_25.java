package array;

public class Question_25 {
    public static void main(String[] args) {
        int[][] arr1 ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("array.Array 1:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("array.Array 2:");
        int[][] arr2 = {{9,8,7},{6,5,4},{3,2,1}};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Array1 - Array2 :");
        int[][] arr3 = new int[3][3];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr3[i][j] = arr1[i][j] - arr2[i][j];
                System.out.print(arr3[i][j]+" ");

            }
            System.out.println();
        }

    }
}
