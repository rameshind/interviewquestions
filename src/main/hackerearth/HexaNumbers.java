package main.hackerearth;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class HexaNumbers {

    public static void main(String[] args) {

        String inArr = "\"Only({< [Date Type]={'Task End'},[Task Type] = {'User'}>}[Task End Date])\n" +
                "\n" +
                "\n" +
                "/*E591*/\"";
        Pattern statiColsPattern = Pattern.compile("(\\[.*].*\\{)");
        Stream.of(inArr.split("\n")).forEach(in-> {
                    Matcher match = statiColsPattern.matcher(in);
                    while (match.find()) {
                        System.out.println(match.group(1));
                    }
                });
     /*   Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        while (t-- > 0) {
            String[] startEndArr = s.nextLine().split(" ");
            int start = Integer.parseInt(startEndArr[0]);
            int end = Integer.parseInt(startEndArr[1]);
            int count = 0;
            for (int x = start; x <= end; x++) {
                String hex = Integer.toHexString(x);
                int sum = 0;
                for (int i = 0; i < hex.length(); i++) {
                    char ch = hex.charAt(i);
                    if (Character.isLetter(ch)) {
                        switch (ch) {
                            case 'a':
                                ch = 10;
                                break;
                            case 'b':
                                ch = 11;
                                break;
                            case 'c':
                                ch = 12;
                                break;
                            case 'd':
                                ch = 13;
                                break;
                            case 'e':
                                ch = 14;
                                break;
                            case 'f':
                                ch = 15;
                                break;
                        }
                        sum = sum + ch;
                    }
                    if (Character.isDigit(ch)) {
                        int num = Integer.parseInt(String.valueOf(ch));
                        sum = sum + num;
                    }
                }

                if (GCD(sum, x) > 1) {
                    count++;
                }

            }

            System.out.println(count);

        }*/

        System.out.println(GCD(4,12));
    }


    public static int GCD(int x, int sum) {
        if(sum == 0)
            return x;
        else
            return GCD(sum,x%sum);
    }
}

