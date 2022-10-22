import java.io.*;
import java.util.*;
public class printPattern {

	public static void main(String arg[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t -->0) {
			int N = Integer.parseInt(br.readLine());
			Solution21 obj = new Solution21();
			List<Integer> ans = new ArrayList<Integer>();
			ans = obj.pattern(N);
			for(int i=0;i<ans.size();i++) {
				System.out.print(ans.get(i) +" ");
			}
			System.out.println();
		}
	}
}
class Solution21{
	 List<Integer> pattern(int N){
		List<Integer> list = new ArrayList<Integer>();
		patternUtil1(N,list);
		return list;
	}
	static void patternUtil1(int n, List<Integer> list) {
		if(n <=0) {
			patternUtil2(n,list);
			return;
			}
		list.add(n);
		patternUtil1(n-5,list);
	}
	static void patternUtil2(int n,List<Integer> list) {
		if(n == list.get(0) +5) {
			return;
		}
		list.add(n);
		patternUtil2(n+5,list);
	}
}