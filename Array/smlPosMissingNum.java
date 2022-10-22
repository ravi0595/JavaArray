import java.util.*;
import java.io.*;
public class smlPosMissingNum {

	public static void main(String arg[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t -->0) {
			int n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}
		Solution7 obj = new Solution7();
		System.out.println(obj.findMissingNumber(arr,n));
		}
	}
}

class Solution7{
	
	int findMissingNumber(int arr[],int n) {
		int arr1[] = new int[100000];
		for(int i=0;i<n;i++) {
			arr1[arr[i]]+=1;
		}
		for(int i=1;i<n;i++) {
			if(arr1[i] == 0)
				return i;
		}
		return -1;
	}
}