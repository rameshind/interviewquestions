package main;

import java.util.*;

public class SumPair {

    static void getPair(List<Integer> A, Integer x) {
        //{1,2,3,3};
        List<Pair> pairs = new ArrayList<>();
        // put all in map
        Map<Integer, Integer> elementsMap = new HashMap();
        for (Integer i : A) {
            Integer k = x - i;
            if (elementsMap.containsKey(k) ) {
                elementsMap.put(i, elementsMap.get(i) + 1);
            } else {
                elementsMap.put(i, 1);
            }
           /* if (k > 0) {
                if (elementsMap.containsKey(k) ) {

                    pairs.add(new Pair(i, k));


                }
            }*/
        }
        for (Integer i : A) {
            Integer k = x - i;
            if (k > 0) {
                if (elementsMap.containsKey(k)) {
                    pairs.add(new Pair(i, k));
                }
            }
        }
        System.out.println(pairs);

/// remove duplicate pairs


    }

    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return this.x + "," + this.y;
        }
    }

    public static void main(String[] args) {

        getPair(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9), 15);
    }

}
