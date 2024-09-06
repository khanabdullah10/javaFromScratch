package array;

public class Question_29 {
    public static void main(String[] args) {
        int[][] arr1 ={{1,2,3},{4,5,6},{7,8,9}};
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if(arr1[i][j]%2==0){
                    countEven++;
                } else if (arr1[i][j]%2!=0) {
                    countOdd++;
                }
            }
        }
        System.out.println("Frequency of Odd Matrix is :"+ countOdd);
        System.out.println("Frequency of Even Matrix is :"+ countEven);
    }
}
