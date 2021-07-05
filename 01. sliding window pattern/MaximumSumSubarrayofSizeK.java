import java.util.*;
class main{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = in.nextInt();
		}
		int k = in.nextInt();
		int sum = 0;
		for(int i=0;i<n && i<k;i++)
			sum = sum + arr[i];
		for(int i=k;i<n;i++)
		{
			int c = sum - arr[i-k] + arr[i];
			if (c>sum)
				sum = c;
		}
		System.out.println(sum);
	}
}