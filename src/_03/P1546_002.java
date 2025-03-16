package _03;

import java.util.Scanner;

public class P1546_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        int[] A = new int[n];
//        for (int i = 0; i < n; i++) {
//            A[i] = scanner.nextInt();
//        }
        long sum = 0;
        long max = 0;

        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            if (temp > max) {
                max = temp;
            }
            sum += temp;
        }
        System.out.println(sum*100.0/max/n);
    }
}
