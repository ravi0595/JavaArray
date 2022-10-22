import java.util.*;
import java.io.*;
public class patternGame {

	public static void main(String ar[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t -->0) {
			String str;
			str = br.readLine();
			String pat;
			pat = br.readLine();
			Solution23 obj = new Solution23();
			if(obj.searchPattern(str, pat)) {
				System.out.println("Matching");
			}
			else {
				System.out.println("Not Matching");
			}
		}
	}
}

class Solution23 {
    public boolean searchPattern(String str, String pat) {
        // code here
        if(pat.length() > str.length()){
            return false;
        }
        String curr = "";
        for(int i=0;i<pat.length();i++){
            curr = curr + str.charAt(i);
        }
        for(int i=pat.length();i<str.length();i++){
            if(curr.equals(pat)){
                return true;
            }
            String curr1 =curr.substring(1,curr.length());
            curr = curr1 + str.charAt(i);
        }
        if(curr.equals(pat)){
            return true;
        }
        else{
            return false;
        }
    }
}