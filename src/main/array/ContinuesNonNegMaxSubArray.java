package main.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ContinuesNonNegMaxSubArray {

  static ArrayList  findMaxSubArray(ArrayList<Integer> arr)
    {

        int cStart =0, cEnd=0, pStart=0, pEnd=0;
                long cSum=0;
                long pSum =0;

        for(int i =0;i<arr.size();i++){
            if(arr.get(i)>-1) {
                cSum += arr.get(i);
                cEnd = i;
            }else {
                if(cSum >= pSum) {
                    pSum = cSum;
                    pStart = cStart;
                    pEnd = i-1;
                }
                cStart = i+1;
                cEnd =0;
                cSum =0;
            }

        }
        ArrayList<Integer> ans = new ArrayList();

      if( ( pSum == 0 || pSum< cSum) && (cEnd-cStart>= pEnd-pStart)){
        for (int i= cStart ;i<=cEnd; i++ ){
            ans.add(arr.get(i));
        }
      }else {
          for (int i= pStart ;i<=pEnd; i++ ){
              ans.add(arr.get(i));
          }
      }
        return ans;


    }

    public static void main(String[] args) {
        findMaxSubArray(IntStream.of(new int[]{0, 0, -1, 0})
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new)));
    }


}
