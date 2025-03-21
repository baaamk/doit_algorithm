package _03;

import java.util.Scanner;

public class P2018_006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while (end_index != N) {
            if (sum == N) {
                count++;
                end_index++;
                sum = sum + end_index;
            } else if (sum > N) {
                sum = sum - start_index;
                start_index++;
            } else {
                end_index ++;
                sum = sum + end_index; // 주의
            }
        }
        System.out.println(count);
    }
}
