package main.hackerearth;

import java.util.Scanner;
import java.util.stream.Stream;

public class MinimunXOR {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer test = Integer.parseInt(s.nextLine());                 // Reading input from STDIN
        // Writing output to STDOUT


        while (test > 0) {
            int size = Integer.parseInt(s.nextLine());

            Long minxor = Long.MAX_VALUE;
            int[] arr = Stream.of(s.nextLine().split(" "))
                    .mapToInt(token -> Integer.parseInt(token))
                    .toArray();
            for (int i = 0; i < size-1; i++) {
                minxor = Math.min(minxor, arr[i] ^ arr[i + 1]);

            }
            size--;
            System.out.println(minxor);
        }
    }
}
