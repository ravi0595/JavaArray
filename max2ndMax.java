import java.io.*;
import java.util.ArrayList;
public class max2ndMax {

	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		while(testcases -->0) {
			int size = Integer.parseInt(br.readLine());
			int arr[] = new int[size];
			String line = br.readLine();
			String[] elements = line.trim().split(" ");
			for(int i=0;i<size;i++) {
			arr[i]=Integer.parseInt(elements[i]);
			}
			ArrayList<Integer> res = new ArrayList<Integer>();
			Solution obj = new Solution();
			res = obj.largestAndSecondLargest(size,arr);
			System.out.println(res.get(0) + " " + res.get(1));
		}
	}
}
	
class Solution{
	public ArrayList<Integer> largestAndSecondLargest(int size, int arr[]){
		ArrayList<Integer> result = new ArrayList<>();
		int max = Integer.MIN_VALUE,secondMax=Integer.MIN_VALUE;
		for(int i=0;i<size;i++) {
			if(arr[i]> max) {
				secondMax = max;
				max = arr[i];
			}
			else if(arr[i]< max && arr[i] > secondMax) {
				secondMax = arr[i];
			}
		}
		result.add(max);
		result.add(secondMax);
		return result;
	}
}
