package array;

public class Question_31 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] transpose = new int[arr.length][arr.length];

        System.out.println("Orignal array.Array :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Transpose array.Array :");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose.length; j++) {
                transpose[i][j] = arr[j][i];
                System.out.print(transpose[i][j] +" ");
            }
            System.out.println();
        }


    }
}
