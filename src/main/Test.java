package main;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.merge("1", 1,(o, o2) -> o+o2);
    }
}


