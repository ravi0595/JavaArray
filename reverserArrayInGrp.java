import java.io.*;
import java.util.ArrayList;
public class reverserArrayInGrp {

	public static void main(String arg[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t -->0) {
			String inputLine1[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(inputLine1[0]);
			int k = Integer.parseInt(inputLine1[1]);
			ArrayList<Integer> arr = new ArrayList<>();
			String inputLine2[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++) {
				arr.add(Integer.parseInt(inputLine2[i]));
			}
			Solution1 obj = new Solution1();
			obj.reverseInGroups(arr,n,k);
			StringBuffer str = new StringBuffer();
			for(int i =0;i<n;i++) {
				str.append(arr.get(i) + " ");
			}
			System.out.println(str);
		}
	}
}

class Solution1
{
	public void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
		
		for(int i=0;i<n;i=i+k) {
			int lastIndex = i + k > n ? n : i+k;
			reverse(arr,i,lastIndex-1);
		}
	}
	public void reverse(ArrayList<Integer> arr, int x, int y) {
		while(x <= y) {
			int temp = arr.get(x);
			arr.set(x, arr.get(y));
			arr.set(y, temp);
			x++;y--;
		}
	}
}
