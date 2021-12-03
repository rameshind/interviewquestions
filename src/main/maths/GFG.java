package main.maths;// Java implementation to print all the
// permutation greater than the integer N
import java.util.*;
class GFG{

static void printPermutation(int N) 
{
	int temp = N, count = 0;

	// Iterate and count the
	// number of digits in N
	while (temp > 0) 
	{
	count++;
	temp /= 10;
	}

	// vector to print the
	// permutations of N
	int[] num = new int[count];

	// Store digits of N
	// in the vector num
	while (N > 0)
	{
	num[count-- - 1] = N % 10;
	N = N / 10;
	}

	// Iterate over every permutation of N
	// which is greater than N
	while (next_permutation(num)) 
	{

	// Print the current permutaion of N
	for (int i = 0; i < num.length; i++)
		System.out.print(num[i]);

	System.out.print("\n");
	}
}

// Function to print all the permutation
// which are greater than N itself
static boolean next_permutation(int[] p) 
{
	for (int a = p.length - 2; a >= 0; --a)
	if (p[a] < p[a + 1])
		for (int b = p.length - 1;; --b)
		if (p[b] > p[a]) 
		{
			int t = p[a];
			p[a] = p[b];
			p[b] = t;
			for (++a, b = p.length - 1; a < b; ++a, --b)
			{
			t = p[a];
			p[a] = p[b];
			p[b] = t;
			}
			return true;
		}
	return false;
}

// Driver Code
public static void main(String[] args) 
{
int N = 324;
PriorityQueue queue = new PriorityQueue();

printPermutation(N);
}
}

// This code contributed by sapnasingh4991
