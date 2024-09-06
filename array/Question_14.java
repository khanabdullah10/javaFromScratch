package array;

public class Question_14 {
    public static void main(String[] args) {
        int[] arr = {10,5,3,19,1};
        int temp = 0;
        System.out.println("Orignal array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
        System.out.println();
        System.out.println("array.Array after sorting in descending order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
