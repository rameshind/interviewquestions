package main.hackerearth;

import java.util.Scanner;

public class EqulizeStrings {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer length = Integer.parseInt(s.nextLine());
        char[] s1 = s.nextLine().toCharArray();
        char[] s2 = s.nextLine().toCharArray();
        long minCost = 0;
        for (int i = 0; i < length; i++) {
            if (s1[i] == s2[i]) {
                continue;

            }
            minCost++;
            if(i+1< length && s1[i]!=s2[i]) {
                if (s1[i] == s2[i + 1] && s2[i] == s1[i + 1]) {

                    i++;
                }
            }

        }
        System.out.println(minCost);
    }
}

