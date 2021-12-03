package main;// Java implementation using Hashing
import java.io.*;
import java.util.HashSet;

class PairSum {
	static void printpairs(int arr[], int sum)
	{
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < arr.length; ++i) 
		{
			int temp = sum - arr[i];

			// checking for condition
			if (s.contains(temp)) {
				System.out.println(
					"Pair with given sum "
					+ sum + " is (" + arr[i]
					+ ", " + temp + ")");
			}
			s.add(arr[i]);
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		int A[] = { 1,2,3, 4, 5, 6, 7, 8,9 };
		int n = 15;
		printpairs(A, n);
	}
}

// This article is contributed by Aakash Hasija
