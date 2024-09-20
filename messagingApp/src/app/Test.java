package app;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        actions(371);
//        isPrime(21);
//        String str = "shubham";
//        reverseString(str);
//        Integer [] arr = {3,5,5,2,2,6,7,8,4,3,7};
//        duplicateElement(arr);
//        printFibonacciSeries(5);

    }

    public static void isPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is not prime number");
        }
    }

    public static void reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();
        System.out.println(reverse);

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    public static void duplicateElement(Integer[] arr) {
        Set<Integer> set = new HashSet<>();
        System.out.println("Array size: " + arr.length);

        Arrays.stream(arr).filter(x -> !set.add(x)).forEach(System.out::println);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("duplicate are " + arr[i]);
                }
            }
        }
    }

    public static int fibonacci(int num){
        if(num==0){
            return 0;
        } else if (num ==1) {
            return 1;
        }else {
            return fibonacci(num-1)+fibonacci(num-2);
        }
    }

    public static void printFibonacciSeries(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static void actions(int num){
    int number =num;
    int nm =0;
        int numberOfDigits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            nm += (int) Math.pow(digit, numberOfDigits);
            num /= 10;
        }
        if(nm==number){
            System.out.println(number + " is a armstrong number");
        }else {
            System.out.println("it is not amstrong number");
        }

    }



}
