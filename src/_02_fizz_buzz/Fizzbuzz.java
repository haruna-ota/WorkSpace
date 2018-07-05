package _02_fizz_buzz;

public class Fizzbuzz {
    public static void main(String[] args) {
        //"1〜100"までの数字でFizzBuzz
        int i;
        for (i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {   //15の倍数の時”Fizz Buzz”表示
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");         //3の倍数の時”Fizz”表示
            } else if (i % 5 == 0) {
                System.out.println("Buzz");         //5の倍数の時”Buzz”表示
            } else {
                System.out.println(i);
            }
        }
    }
}
