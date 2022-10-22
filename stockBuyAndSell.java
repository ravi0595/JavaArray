import java.io.*;
import java.util.*;
public class stockBuyAndSell {

	public static void main(String arg[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			int A[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++) {
				A[i] = Integer.parseInt(inputLine[i]);
			}
			int p=0;
			for(int i=0;i<n-1;i++) {
				p += Math.max(0, A[i+1]-A[i]);
			}
			
			Solution12 obj = new Solution12();
			ArrayList<ArrayList<Integer>> ans = obj.stockBuySell(A,n);
			if(ans.size() == 0) {
				System.out.print("No Profit");
			}
			else {
				int c=0;
				for(int i=0;i<ans.size();i++) {
					c += A[ans.get(i).get(1)] - A[ans.get(i).get(0)];
				}
				if (c == p) {
					System.out.print(1);
				}
				else {
					System.out.println(0);
				}
			}System.out.println();
			
		}
	}
}

class Solution12{
	ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++) {
			res.add(new ArrayList<Integer>());
		}
		if(n==1)
			return res;
		int count=0,i=0;
		ArrayList<Integer> buy = new ArrayList<Integer>();
		ArrayList<Integer> sell = new ArrayList<Integer>();
		while(i<n-1) {
			while((i<n-1) && A[i+1] <= A[i]) {
				i++;
			}
			if(i == (n-1))
				break;
			buy.add(i);
			//res.get(i).add(i);
			i++;
			
			while((i<n) && (A[i] >=A[i-1])){
				i++;
			}
			sell.add(i);
			//res.get(i).add(i);
		}
		res.add(buy);
		res.add(sell);

		return res;
	}
}