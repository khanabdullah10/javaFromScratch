package array;

public class Question_17 {
    public static void main(String[] args) {
        int[] arr = {1,2,60,4,5} ;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max){
                max = arr[i];
            }
        }
        System.out.println("The largest element in the array is "+ max);
    }
}
