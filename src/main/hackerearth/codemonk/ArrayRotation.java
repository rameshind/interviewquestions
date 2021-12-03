package main.hackerearth.codemonk;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayRotation {

    static int findWaysToPair(int p)
    {
        // To store count of number of ways.
        int dp[] = new int[p + 1];

        dp[1] = 1;
        dp[2] = 2;

        // Using the recurrence defined find
        // count for different values of p.
        for (int i = 3; i <= p; i++)
        {
            dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
        }

        return dp[p];
    }

    // Driver code
    public static void main(String args[])
    {
        int p = 4;
       // System.out.println(findWaysToPair(p));

        Map<String, Object> map1 = new HashMap<>();
        map1.put("a","b");
        map1.put("b","b");
        map1.put("c","c");


        Map<String, Object> map2 = new HashMap<>();
        map2.put("a","b");
        map2.put("b","b");
        map2.put("c","c");

        Map<String, Object> map = new HashMap<>();
        map.put("a","b");
        map.put("b","b");
        map.put("c","d");



        Set<Map<String,Object>> s = new HashSet<>();
        s.add(map);
        s.add(map1);
        s.add(map2);

        //for

       // s.stream().flatMap(m-> m.keySet().stream()).collect(groupingBy(e->e.,mapping(Map.Entry::getValue, toSet()) ))

        System.out.println(s.size());

    }

  /*  public static void main(String[] args) {
        System.out.println(m.A.equals(m.A));
        System.out.println(m.A==m.A);
        System.out.println(m.A==m.B);
       *//* Scanner s = new Scanner(System.in);
       // Integer length = Integer.parseInt(s.nextLine());
        long t = s.nextLong();
        s.nextLine();
        while (t-- > 0) {
        int[] s1 = Stream.of(s.nextLine().split(" ")).mapToInt(ss -> Integer.parseInt(ss)).toArray();
        int k = s1[1];
        int n = s1[0];

          int[] input=  Stream.of(s.nextLine().split(" ")).mapToInt(intt -> Integer.parseInt(intt)).toArray();
          rightRotate(input, n, k);*//*


        }*/

   static void rightRotate(int a[],
                     int n, int k)
    {

        // If rotation is greater
        // than size of array
        k=k%n;

        for(int i = 0; i < n; i++)
        {
            if(i<k)
            {
                // Printing rightmost
                // kth elements
                System.out.print(a[n + i - k]
                        + " ");
            }
            else
            {
                // Prints array after
                // 'k' elements
                System.out.print(a[i - k]
                        + " ");
            }
        }
        System.out.println();
    }
}
 enum m {
    A,B
 }