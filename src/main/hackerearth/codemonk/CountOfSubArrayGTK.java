package main.hackerearth.codemonk;

public class CountOfSubArrayGTK {


            // Function to count number of subarrays
            static int solve(int N, int K, long[] A){
                // Write your code here
                int result = 0;
                long sum = A[0];
                int start =0, end =0;
                while(start<N && end<N){

                    if(sum>=K){

                        if(end<N){
                            end++;
                        } else
                        {
                            sum-=A[start];

                            start++;
                            end = start;
                        }
                        result++;

                        //start++;
                    } else {
                        sum+=A[++end];
                       // end++;
                    }
                }

                return result;

            }

            // Driver Code
            public static void main (String[] args) {
                long a[] = { 1,4,2 };
                int n = a.length;
                int k = 4;

                System.out.println (solve(n, k,a));

            }

}
