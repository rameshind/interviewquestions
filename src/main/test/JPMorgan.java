package main.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class JPMorgan {



    private static void greet(String name){
        System.out.println("Hello "+name);
    }
    // 1,2,4,5

    private void pushGreet(){

    }


    private static void getHF(String in1){
        Map<Character,Integer> fMap = new HashMap();
        String in = in1.toLowerCase();

        for(int i=0 ;i<in.length();i++){
            if(fMap.containsKey(in.charAt(i))){
                fMap.put(in.charAt(i), fMap.get(in.charAt(i))+1);
            } else {
                fMap.put(in.charAt(i),1);
            }
        }
        char maxFC = in.charAt(0);
        for(Map.Entry<Character, Integer> ent : fMap.entrySet()) {
            if (ent.getValue() > fMap.get(maxFC)) {
                maxFC = ent.getKey();
            }
        }
        System.out.println(maxFC +":"+ fMap.get(maxFC));
    
    }




    
    

    
    


    public static void main(String[] args) {
       // findMissingElemeneet(new int[]{1,2,4,5}, 5);

        getHF("findMissingElemeent");
    }

}
