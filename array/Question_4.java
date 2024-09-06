package array;

public class Question_4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 1, 8, 3, 7, 7};
        int[] newarr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) newarr[i] = arr[j];
            }
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}
