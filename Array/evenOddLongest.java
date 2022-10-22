import java.util.*;
import java.io.*;
public class evenOddLongest {

	public static void main(String arg[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}
			Solution15 obj = new Solution15();
			System.out.println("Max Odd Even Sequence is :" + obj.findMaxOddEven(arr,n));
		}
	}
}

class Solution15{
	int findMaxOddEven(int arr[],int n) {
		int count=1,maxCount =1;
		for(int i=0;i<n-1;i++) {
			if((arr[i]%2==0 && arr[i+1]%2==1) || (arr[i]%2==1 && arr[i+1]%2==0)){
				count++;
				maxCount = Math.max(maxCount, count);
			}
			else {
				count = 1;
			}
		}
		return maxCount;
	}
}