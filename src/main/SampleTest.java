package main;

import java.util.ArrayList;
import java.util.List;

public class SampleTest {


    void getCombination(List<Integer> in) {

        List<List<Integer>> combinations = new ArrayList<>();
        for (Integer i = 0; i < in.size(); i++) {

            List<Integer> combination = new ArrayList<>();

            for (int j = 0; j < in.size(); j++) {
                if(i!=j) {

                    combination.add(j);
                }
            }
        }
    }

    public static void main(String[] args) {
  //1,2,3,4,5

    }


}
