package main.hackerearth;

import java.util.Arrays;

public class OneSwapSmallestString {
    public static void main(String[] args) {

        //Scanner s = new Scanner(System.in);
        //Integer test = Integer.parseInt(s.nextLine());
      /*  while (test-- > 0) {

            Integer n = Integer.parseInt(s.nextLine());
            char[] input = s.nextLine().toCharArray();
           // System.out.println(findSmallest(input));
            int lindx = 0;
            int rindx = 0;
            for (int i = 1; i < n; i++) {
                if (input[i-1] < input[i]) {
                   continue;

                }else {
                    lindx = i-1;
                }
                if (input[i-1] > input[i]) {
                    rindx = i;
                }
            }
            char c = input[rindx];
            input[rindx] = input[lindx];
            input[lindx] = c;
            for(char cc: input){
                System.out.print(cc);
            }
            System.out.println();

        }*/
        System.out.println(findSmallest("kqoqyzwm".toCharArray()));
    }

    static String findSmallest(char[] s) {
        int len = s.length;

        // Store last occurrence of every character
        int[] loccur = new int[26];

        // Set -1 as default for every character.
        Arrays.fill(loccur, -1);

        for (int i = len - 1; i >= 0; --i) {

            // Character index to fill
            // in the last occurrence array
            int chI = s[i] - 'a';
            if (loccur[chI] == -1) {

                // If this is true then this
                // character is being visited
                // for the first time from the last
                // Thus last occurrence of this
                // character is stored in this index
                loccur[chI] = i;
            }
        }

        char[] sorted_s = Arrays.copyOf(s, s.length);
        Arrays.sort(sorted_s);
        String result = "";
        for (int i = 0; i < len; ++i) {
            if (s[i] != sorted_s[i]) {

                // Character to replace
                int chI = sorted_s[i] - 'a';

                // Find the last occurrence
                // of this character.
                int last_occ = loccur[chI];

                StringBuilder sb = new StringBuilder( String.valueOf(s));
                String firstPart = sb.substring(0,i);   // line 1
                //last_occ--;
                StringBuilder sbb= new StringBuilder(sb.substring(i));
                result = firstPart+sb.charAt(last_occ)+ sbb.deleteCharAt(last_occ-i);
                break;
            }
        }
        return result;
    }
}
