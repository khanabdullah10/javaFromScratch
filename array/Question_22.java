package array;

public class Question_22 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10,11,12};
        System.out.println("Even nos. :");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                System.out.print(+arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Odd nos. :");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) System.out.print(arr[i]+" ");
        }
    }
}
