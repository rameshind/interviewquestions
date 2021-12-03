package main.hackerearth;

import java.util.Scanner;

public class LexiSmallestString {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Integer test = Integer.parseInt(s.nextLine());
        while (test-- > 0) {
            Integer n = s.nextInt();
            Integer k = s.nextInt();
            s.nextLine();
            char[] input = s.nextLine().toCharArray();
            for (int i = 0; i < n; i++) {
                if (input[i] == 'a') {
                    continue;
                }
                int diff = 'z' - input[i] + 1;
                if (diff > k)
                    continue;
                input[i] = 'a';
                k = k - diff;
            }
            input[n - 1] = (char) ((input[n - 1] - 'a' + k) % 26 + 'a');
            for(char c : input){
                System.out.print(c);
            }
            System.out.println();
        }
    }

}
