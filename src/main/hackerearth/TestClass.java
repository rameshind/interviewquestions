package main.hackerearth;

import java.util.Scanner;
import java.util.stream.Stream;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[]) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT**/

        //Scanner
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());

        while (n-- > 0) {
            int len = Integer.parseInt(s.nextLine());
            int[] b = new int[len];
            b[0] = s.nextInt();
            for (int i = 1; i < len; i++) {

                int k = s.nextInt();
                if(b[i-1]% k !=0){
                    int divs =(int)((Math.ceil(b[i - 1] / k)));

                        b[i] = k *(divs+1);


                } else {
                    b[i] = k;
                }
            }
            for(int x:b)System.out.print(x);
            System.out.println();
            if(s.hasNextLine()) {
                s.nextLine();
            }

        }


    }
}