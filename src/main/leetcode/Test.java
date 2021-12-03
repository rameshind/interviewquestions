package main.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static int kthSmallest(int[][] mat, int k) {

        List<Integer> p= new ArrayList();

        for(int i=0;i<mat[0].length;i++){
            p.add(mat[0][i]);
        }

        for(int i=1;i<mat.length;i++){
            int a[]=mat[i];
            List<Integer> q= new ArrayList();
            for(int m:p){
                for(int n:a){
                    q.add(m+n);
                }
            }
            Collections.sort(q);
            p.clear();
            for(int j=0;j<Math.min(k,q.size());j++){
                p.add(q.get(j));
            }
        }
        return p.get(p.size()-1);
    }

    public static void main(String[] args) {
       // kthSmallest(new int[][]{{1,3,11},{2,4,6}}, 5);
        isLongPressedName("alex",
                "aaleex");
    }
    public static boolean isLongPressedName(String name, String typed) {

        boolean longPassed= true;
        int j=0;
        for(int i =0;i<name.length();i++,j++){
            if(name.charAt(i) == typed.charAt(j)){
                while(true){
                    if(typed.length()-1>j){
                        if(typed.charAt(j) == typed.charAt(j+1)){
                            j++;
                        }else {
                            break;
                        }
                    }
                }
            } else {
                longPassed = false;
            }
        }
        return longPassed;
    }
}
