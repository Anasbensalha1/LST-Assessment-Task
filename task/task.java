

import java.io.*;

class Binary
{
	
	static int maxOnesIndex(int arr[], int n)
	{
		int max_count = 0; 
		int max_index=0; 
		int prev_zero = -1; 
		int prev_prev_zero = -1; 

		
		for (int curr=0; curr<n; ++curr)
		{
			
			if (arr[curr] == 0)
			{
				
				if (curr - prev_prev_zero > max_count)
				{
					max_count = curr - prev_prev_zero;
					max_index = prev_zero;
				}

				
				prev_prev_zero = prev_zero;
				prev_zero = curr;
			}
		}

		
		if (n-prev_prev_zero > max_count)
			max_index = prev_zero;

		return max_index;
	}
	
	
	
	public static void main(String[] args)
	{
		int arr[] = {1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1};
		int n = arr.length;
		System.out.println("Index of 0 to be replaced is "+
						maxOnesIndex(arr, n));	
	}
}

