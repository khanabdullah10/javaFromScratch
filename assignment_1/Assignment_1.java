package assignment_1;//Assignment 2

public class Assignment_1 {

    public static int max(int a, int b, int c){
        if(a > b && a > c ){
            return a;
        } else if( b > a && b >c){
            return b;
        }else
            return c;
    }
    public static int odd_or_eve(int n){
        if(n % 2==0){
            System.out.println("Even");
        }else
            System.out.println("odd");
        return 0;

    }
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        else
            return (n * fact(n-1) );
    }

    public static int leap_year(int year) {
        if  ((year % 400 == 0) && (year % 100 == 0)) {
            System.out.println("Not a Leap year");

        }else if((year % 4 ==0) && (year % 100 != 0)){
            System.out.println(" Leap year");
        }
        return 0;
    }

    public static int rev_num(int n){
        int number = n;
        int reverse = 0;
        while(number!=0){
            int  remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;

        }
        return reverse;
    }

    public static int q8(){
        int sum = 0;
        for(int i = 101;i < 200; i++){

            if(i % 7 == 0 ){
                sum = sum + i;
            }

        }
        return sum;
    }

    public static boolean isArmstrong (int n){
        int orignal = n;
        int remainder,sum = 0;
        while(n!=0){
            remainder = n % 10;
            sum = (int) (sum + Math.pow(remainder,3));
            n = n/10;
        }
        if(sum == orignal)
            return true;

        else
            return false;

    }
    public static boolean isPrime(int n){
        if (n ==2) {
            return true;
        }
        else if((n % 2 == 0) || (n == 1) )
            return false;
        else
            return true;
    }
    public static boolean isPalindrome(int n){
        int result = 0;
        int rem = 0;
        int org = n;

        while(n!=0){

            rem = n % 10;
            result = result * 10 + rem;
            n = n/10;

        }
        if(result == org)
            return true;
        else
            return false;

    }



    public static void main(String args[]){
//         Ans .1
//        System.out.println(max(100,20,30));

//         Ans .2
//        System.out.println(odd_or_eve(1));

//        Ans .3
//        System.out.println(fact(5));

//        Ans .4
//        System.out.println(leap_year(2023));
//

//        Ans .5
//        int arr[] = {7,2,3,4,5};
//        for(int i = arr.length-1; i >= 0;i--){
//            System.out.print(arr[i]+ " ");
//        }
//        Ans 6.
//        System.out.println(rev_num(786));

//        Ans 7.
//        System.out.println(q8());

//         Ans 8.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input a number");
//        int n = sc.nextInt();
//        int days = n % 30;
//        int month = n / 30;
//        System.out.println("Months: "+ month + " Days :"+days );

//        Ans 9.
//        System.out.println(isArmstrong(371));

//        Ans 10.
//        System.out.println(isPrime(6));

//        Ans 11.
//        System.out.println(isPalindrome(123));



//        Ans 12.
//        int i ;
//        for( i = 65;i <=90;i++){
//            System.out.print((char)i + " ");
//        }

//        Ans. 13
//        Char to String
//        char c='A';
//        String s = Character.toString(c);
//        System.out.println("String is: "+s);
//
//        String to Char
//        String s="Hey";
//        char c=s.charAt(0);
//        System.out.println("1st character is: "+c);

//        Ans. 14

//        String input = "example";
//        System.out.println("Orignal string "+input);
//        char[] arr = input.toCharArray();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[j]>arr[i]){
//                    char temp = arr[i];
//                    arr[i]= arr[j];
//                    arr[j]= temp;
//                }
//            }
//
//        }
//
//        String sorted = new String(arr);
//        System.out.println("sorted: "+ sorted );


//        Ans. 15
//        String s = "Hello";
//        for(int k = 0; k <= s.charAt(s.length()); k++){
//            System.out.print(k + "");
//        }


// Ans. 16
//       Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int num1 = a;
//
//        int b = sc.nextInt();
//        int num2 = b;
//        int result = 0;
//
//        int operator = sc.next().charAt(0);
//
//        switch (operator){
//
//            case '+' :
//                result = a + b;
//                break;
//            case '*':
//                result = a * b;
//                break;
//            case '-':
//                result = a - b;
//            case '/':
//                result = a / b;
//            case '%':
//                result = a % b;
//
//            default:
//                System.out.println("You enter wrong input");
//
//        }
//        System.out.println(num1 +num2 +"= "+ result);

//        Ans . 17

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of: a");
//        double a = sc.nextDouble();
//
//        System.out.println("Enter the value of: b");
//        double b = sc.nextDouble();
//
//        System.out.println("Enter the value of: c");
//        double c = sc.nextDouble();
//
////        eqn = b^2 - 4.0 * a * c
//        double eqn = b*b - 4.0 * a * c;
//        double r1;
//        double r2;
//
//        if(eqn > 0){
//            r1 = (-b + Math.sqrt(eqn))/(2.0*a);
//            r2 = (-b - Math.sqrt(eqn))/(2.0*a);
//            System.out.println("Root1 is = "+r1+"Root2 is = "+r2 +" Therefore they are real and different");
//        } else if (eqn == 0) {
//            r1 = r2 = -b / (2.0 * a);
//            System.out.println(r1 + "and + " + r2 + "Real and equal");
//        }
//        else {
//            System.out.println("Root are unqual and are complex");
//        }

//        Ans 18.

//        int[] arr = {1,2,3,4,5,6,7,8,85,99};
//        int falg = 1;
//        for ( int i = 0; i < arr.length; i++) {
//            if(arr[i]%2!=0) {
//                falg = 0;
//            }
//
//        }
//        if(falg==1){
//            System.out.println("Does not contain odd list");
//        }else{
//            System.out.println("It does contain odd list");
//        }

//        Ans. 19
//        int[] arr = {1,2,1,2,5};
//        int[] arrr = {1,2,1,2,5};
//        boolean val = Arrays.equals(arr,arrr);
//        System.out.println("Arr1 and Arr2 are equal: "+ val );
//
//            Ans 20.
//            int arr1[] = {1,2,3,4,5,6};
//                int sum = 0;
//                for (int i :arr1){
//                    sum += i;
//                }
//        System.out.println(sum);
//
////                Ans 21.



//    bird bird1 = new bird("Sparrow");
////        bird bird11 = bird1;
//        bird1.display();
//
//    }
//
//}
//
//
//class bird{
//    private String name ;
//
//    public bird(String name){
//        this.name = name;
//    }
//
//    public void display(){
//        System.out.println("Bird Name : "+ name);



//        Ans. 22
//    int a = 6;
//    int b = 0;
//       try {
//           System.out.println(a/b);
//       }catch(ArithmeticException e){
//           System.out.println("Divided by zero cannot be possible");
//
//        }

















    }
}




