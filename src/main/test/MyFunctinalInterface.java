package main.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyFunctinalInterface {
    public static void main(String[] args) {
        List aa = new ArrayList();
        aa.add(2);
        aa.add(3);
        System.out.println(aa.size()-1);
        Map m= new HashMap<>();
        //m.va
    }
    int minParkingSpace(int[][] parkingTime){

        Map<Integer,Integer> mymap =  new HashMap<>();

        for(int i=0;i<parkingTime.length;i++){
            mymap.put(parkingTime[i][0],parkingTime[i][0]++);
            mymap.put(parkingTime[i][1],parkingTime[i][1]--);
        }

        int ans=0;
        int count=0;
        for(int it=0;it!=mymap.size();++it){
            count+=mymap.get(it);
            ans=Integer.max(ans,count);
        }
        return ans;
    }

   // void aa();
    }
