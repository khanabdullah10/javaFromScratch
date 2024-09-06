package array;

public class Question_33 {
    public static void main(String[] args) {
        int arr[][] = {
                {4, 0, 0},
                {0, 5, 0},
                {0, 0, 6}
        };

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 0) count++;
            }

        }

        if(count> (arr.length/2)) System.out.println("Given matrix is sparse");
        else System.out.println("Not a Sparse Matrix");
    }
}
