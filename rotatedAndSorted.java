//Check if array is sorted and rotated
import java.io.*;
import java.util.*;
public class rotatedAndSorted {

	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}
			Solution13 obj = new Solution13();
			System.out.print(obj.rotateAndSortedUtil(arr,n));
		}
	}
}

class Solution13{
	boolean rotateAndSortedUtil(int arr[],int n) {
		int minElement = Integer.MAX_VALUE;
		int maxElement = Integer.MIN_VALUE;
		int minIndex = -1,maxIndex = -1;
		for(int i=0;i<n;i++) {
			if(arr[i] < minElement){
				minElement = arr[i];
				minIndex = i;
			}
			if(arr[i] > maxElement) {
				maxElement = arr[i];
				maxIndex = i;
			}
		}
		boolean flag1 = true;
		for(int i=1;i<minIndex;i++) {
			if(arr[i] < arr[i-1]) {
				flag1 = false;
				break;
			}
		}
		boolean flag2 = true;
		for(int i = minIndex+1; i<n;i++) {
			if(arr[i] < arr[i-1]) {
				flag2 = false;
				break;
			}
		}
		boolean flag3 = true;
		for(int i=1;i<maxIndex;i++) {
			if(arr[i] > arr[i-1]) {
				flag3 = false;
				break;
			}
		}
		boolean flag4 = true;
		for(int i=maxIndex+1;i<n;i++) {
			if(arr[i] > arr[i-1]) {
				flag4 = false;
				break;
			}
		}
		if(minIndex ==0 || maxIndex==0) {
			return false;
		}
		else if(flag1 == true && flag2 == true && arr[n-1] < arr[minIndex-1]) {
			return true;
		}
		else if(flag3 == true && flag4 == true && arr[0] < arr[n-1]) {
			return true;
		}
		else {
			return false;
		}
	}
			
}