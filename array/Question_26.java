package array;

public class Question_26 {
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
//        int[][] arr2 = {{9,8,7},{6,5,4},{3,2,1}};
        int[][] arr2 ={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        boolean flag = false;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    for (int l = 0; l < arr2.length; l++) {
                        if(arr1[i][j]==arr2[k][l]){
                            flag = true;
                        }else
                            flag = false;
                    }
                }
            }

        }

        if (flag==true) System.out.println("Matrix are equal!");
        else System.out.println("Not equal!");

    }
}
