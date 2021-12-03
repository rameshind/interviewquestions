package main.netcracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        firstSingelChar("helloRamesh");

    }
   static void firstSingelChar(String in){

        Map<Character, Integer> countMap = new HashMap<>();

       //Optional.of("rame").

       List l = new ArrayList();
       l.add(1);
       l.add(2);
       List ll = l;
       ll.add(3.4f);

       Stream.of("ss".toCharArray()).filter(c-> c.equals('s')).findFirst();

        for(int i=0;i<in.length();i++){
            if(countMap.containsKey(in.charAt(i))){
               countMap.put(in.charAt(i), countMap.get(in.charAt(i))+1);
            }else {
                countMap.put(in.charAt(i), 1);
            }
        }

        for(int i=0;i<in.length();i++){
            if(countMap.get(in.charAt(i)) ==1){
                System.out.println(in.charAt(i)+" "+(i+1));
                break;

            }
        }

    }
}
