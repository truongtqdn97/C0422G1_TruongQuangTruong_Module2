package ss2.bai_tap;

import java.util.Scanner;

public class PrimeDisplay {
    public static boolean isPrime(int number){
        if (number<2) return false;
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if (number%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 20, count = 0, N = 2;
        while (count<numbers){
            if (isPrime(N)){
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
