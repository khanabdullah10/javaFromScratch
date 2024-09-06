package array;

public class Question_8 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            if(i%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
