package main;/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

class TestClass {
    public static void main(String args[]) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input*/


        //Scanner
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();                 // Reading input from STDIN
        // Writing output to STDOUT

        s.nextLine();
        // Write your code here
        while (t-- > 0) {
            int[] line1 = Stream.of(s.nextLine().split(" ")).mapToInt(tt -> Integer.parseInt(tt)).toArray();
            int[] array = Stream.of(s.nextLine().split(" "))
                    .mapToInt(token -> Integer.parseInt(token))
                    .toArray();
            Arrays.sort(array);
            if (array[0] < line1[1]) {
                System.out.println(line1[1] - array[0]);
            } else
                System.out.println(0);
        }
    }
}
