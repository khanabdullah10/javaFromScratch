package array;

public class Question_32 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };

        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==j && arr[i][j]!=1){
                    flag = false;
                    break;
                }
                if(i!=j && arr[i][j]!=0){
                    flag = false;
                    break;
                }

            }
        }

        if(flag == true) System.out.println("Given matrix is an identity Matrix");
        else System.out.println("Givene matrix is not an identity Matrix");






























    }
}
