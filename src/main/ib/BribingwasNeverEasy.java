package main.ib;

public class BribingwasNeverEasy {

    public static void main(String[] args) {
   bribe(new int[]{2,1,5,3,4}, new int[]{2,2,2,2,2});

    }
    static  int bribe(int[] a, int[]b){
        int[] A = new int[a.length+1];
        int[] index = new int[a.length+1];

        for(int i=1; i<=a.length;i++){
            A[i] = a[i-1];
            index[A[i]] = i;
        }
        System.out.println(A);
        int ans = 0;
        for(int i = a.length;i>0;i--){
            if(index[i] == i) continue;
            int gap = i-index[i];
            System.out.println("gap : "+gap);
            if(gap<0 || gap>A[i]) return -1;
            ans++;
            for(int j = index[i];j<i;j++){
               swap(A,j,j+1);
               swap(index, A[j],A[j+1]);
            }

        }
        return ans;
    }

    private static void swap(int[] x, int a, int b) {
        int t = x[a];
        x[a] = x[b];
        x[b] = t;
    }
}
