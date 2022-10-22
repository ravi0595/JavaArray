import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.io.*;
public class leaderInArray {

	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t -->0) {
			int n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");
			for(int  i=0;i<n;i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}
			Solution6 obj = new Solution6();
			StringBuffer str = new StringBuffer();
			ArrayList<Integer> res = new ArrayList<Integer>();
			res = obj.leaders(arr,n);
			for(int i=0;i<res.size();i++) {
				str.append(res.get(i)+ " ");
			}
			System.out.println(str);
		}
		
	}
}

class Solution6{
	ArrayList<Integer> leaders(int arr[],int n){
		ArrayList<Integer> result = new ArrayList<>();
		int leader = arr[n-1];
		result.add(leader);
		for(int i=n-2;i>=0;i--) {
			if(arr[i]>=leader) {
				result.add(arr[i]);
				leader = arr[i];
			}
		}
		Collections.reverse(result);
		return result;
	}
}
