package main.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GemStones {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer length = Integer.parseInt(s.nextLine());
        Map<Character,Integer> m = new HashMap<>();
        for(int i = 0 ; i<length ;i++){
            String sss= s.nextLine();
            String _array = "";
            for(int ik = 0; ik < sss.length(); ik++) {
                if(_array.indexOf(sss.charAt(ik)) == -1) // check if a char already exist, if not exist then return -1

                    _array = _array+sss.charAt(ik);      // add new char
            }
            char[] chars = _array.toCharArray();
            for(int j=0;j<chars.length;j++){
             if(m.containsKey(chars[j])){
                 m.put(chars[j], m.get(chars[j])+1);
             } else {
                 m.put(chars[j], 1);
             }
            }
        }
        Integer result = 0;
        for(Map.Entry<Character, Integer> ss :m.entrySet()){
            if(ss.getValue()== length){
                result++;
            }
        }
        System.out.println(result);
    }
}
