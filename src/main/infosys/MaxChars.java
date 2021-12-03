package main.infosys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxChars {

    public static void main(String[] args) {
        System.out.println(getMaxrepeatedChars("Helo"));
    }
   static List<Character> getMaxrepeatedChars(String in){

        Map<Character, Integer> charmap = new HashMap();
        for(int i=0;i<in.length();i++){
           char ch = in.charAt(i);
            if(charmap.containsKey(ch)){
                charmap.put(ch, charmap.get(ch)+1);
            }else {
                charmap.put(ch,1);
            }

        }
        List<Character> maxChars = new ArrayList<>();
        int maxVal1 = Integer.MIN_VALUE;
        Character maxChar =  null;

        for(Map.Entry<Character,Integer> ent : charmap.entrySet()){

            if(ent.getValue()>=maxVal1){
                maxVal1 = ent.getValue();
                maxChar = ent.getKey();
            }
        }

       for(Map.Entry<Character,Integer> ent : charmap.entrySet()){

           if(ent.getValue()==maxVal1){
                maxChars.add(ent.getKey());
           }
       }

        return maxChars;
    }
}
