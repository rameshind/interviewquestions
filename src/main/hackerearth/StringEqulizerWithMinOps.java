package main.hackerearth;// Java implementation to find the
// minimum number of operations to
// make two Strings equal
import java.util.*;

class StringEqulizerWithMinOps{
	
static final int MAX = 500001;
static int []parent = new int[MAX];
static int []Rank = new int[MAX];

static class pair
{
	char first, second;
	
	public pair(char first, char second)
	{
		this.first = first;
		this.second = second;
	}
}

// Function to find out
// parent of an alphabet
static int find(int x)
{
	return parent[x] = parent[x] == x ? x :
				find(parent[x]);
}

// Function to merge two
// different alphabets
static void merge(int r1, int r2)
{
	
	// Merge a and b using
	// rank compression
	if (r1 != r2)
	{
		if (Rank[r1] > Rank[r2])
		{
			parent[r2] = r1;
			Rank[r1] += Rank[r2];
		}
		else
		{
			parent[r1] = r2;
			Rank[r2] += Rank[r1];
		}
	}
}

// Function to find the minimum
// number of operations required
static void minimumOperations(String s1,
							String s2)
{
	
	// Initializing parent to i
	// and rank(size) to 1
	for(int i = 1; i <= 26; i++)
	{
		parent[i] = i;
		Rank[i] = 1;
	}
	
	// We will store our
	// answer in this vector
	Vector<pair> ans = new Vector<pair>();

	// Traversing Strings
	for(int i = 0; i < s1.length(); i++)
	{
		System.out.println(i);
		if (s1.charAt(i) != s2.charAt(i))
		{
			
			// If they have differnt parents
			if (find(s1.charAt(i) - 96) !=
				find(s2.charAt(i) - 96))
			{
				
				// Find their respective
				// parents and merge them
				int x = find(s1.charAt(i) - 96);
				int y = find(s2.charAt(i) - 96);
				merge(x, y);

				// Store this in
				// our Answer vector
				ans.add(new pair(s1.charAt(i),
								s2.charAt(i)));
			}
		}
	}

	// Number of operations
	System.out.print(ans.size() + "\n");
	for(int i = 0; i < ans.size(); i++)
		System.out.print(ans.get(i).first + "->" +
						ans.get(i).second +"\n");
}

// Driver Code
public static void main(String[] args)
{
	
	// Two Strings
	// S1 and S2
	String s1, s2;
	s1 = "abbada";
	s2 = "dadcca";
	
	// Function call
	minimumOperations(s1, s2);
}
}

// This code is contributed by Princi Singh
