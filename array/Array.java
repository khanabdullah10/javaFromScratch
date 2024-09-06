package array;

public class Array {
    //To find frequency
//    public static void checkFrequency(int[] arr,int size){
//        boolean[] check = new boolean[arr.length];
//        for(int i = 0; i < size;i++){
//            if (check[i]== true)
//                continue;
//            int count = 1;
//            for (int j = i+1; j < size; j++){
//                if (arr[i]==arr[j]){
//                    check[j] = true;
//                    count ++;
//
//                }
//            }
//            System.out.println(arr[i]+": "+ count);
//
//
//        }

//    }
   public static void main(String[] args) {

       //copy of array elements
       /* int[] arr = {1,2,3,4,5};
        int[] arr1 = new int[arr.length];

        for(int i = 0; i < arr.length;i++){
            arr1[i]= arr[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }*/



int[] arr = {2,5,1,5,3};
int n = arr.length;
//To find frequency
//      checkFrequency(arr,n);

       System.out.println("Orignal Array");
       for(int i = 0; i < n; i++){
           System.out.print(arr[i] +" ");
       }
       int half = (arr.length/2);

       for (int i = 0; i < half; i++) {
           int first;
           int j;

           first = arr[0];
           for(j = 0; j < arr.length-1; j++){
               arr[j]= arr[j +1];

           }
           arr[j]= first;
       }
       System.out.println();
       System.out.println("Array after rotation");
       for(int i = 0 ; i < arr.length; i++){
           System.out.print(arr[i]+" ");
       }












    }

}

