import java.io.*;
import java.util.*;
public class maxOccuredNum {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			int L[] = new int[n];
			int R[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++) {
				L[i] = Integer.parseInt(inputLine[i]);
			}
			inputLine = br.readLine().trim().split(" ");
			int maxx = Integer.MIN_VALUE;
			for(int i=0;i<n;i++) {
				R[i] = Integer.parseInt(inputLine[i]);
				if(R[i] > maxx) {
					maxx = R[i];
				}
			}
			Solution3 obj = new Solution3();
			System.out.println(obj.maxOccured(L,R,n,maxx));
		}
	}
}
class Solution3{
	public int maxOccured(int L[],int R[],int n, int maxx) {
		int arr[] = new int[maxx+2];
		for(int i=0;i<n;i++) {
			arr[L[i]] += 1;
			arr[R[i]+1] -=1;
		}
		int maxS=0,index=0;
		for(int i=1;i<maxx;i++) {
			arr[i] = arr[i] + arr[i-1];
			if(arr[i] > maxS) {
				maxS = arr[i];
				index = i;
			}
		}
		return index;
	}
}