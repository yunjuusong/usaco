import java.io.*;
import java.util.*;
public class notlast {
	static Scanner in;
	static PrintWriter out;
	static int N;
	public static void main(String[] args) {
		try{
			in = new Scanner(new File("notlast.in"));
			out = new PrintWriter(new File("notlast.out"));
		
			out.println(solve());
		
			in.close();
			out.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
	static String solve(){
		N = in.nextInt();
		Map<String, Integer> m = new HashMap<String, Integer>();
		for(int i = 0; i < N; i++){
			String name = in.next();
			int milk = in.nextInt();
			if(m.containsKey(name)){
				m.put(name, m.get(name)+milk);
			}
			else{
				m.put(name, milk);
			}
		}
		Map<Integer, String> m1 = new TreeMap<Integer, String>();
		for(String key: m.keySet()){
			int milk = m.get(key);
			if(m1.containsKey(milk)){
				m1.put(milk, m1.get(milk)+" "+key);
			}
			else{
				m1.put(milk, key);
			}
		}
		System.out.println(m1);
		int count = 0;
		String ans = "";
		for(int key: m1.keySet()){
			ans = m1.get(key);
			if(count == 1){
				break;
			}
			count++;
		}
		if(ans.indexOf(" ") >= 0){
			ans = "Tie";
		}
		
		return ans;
	}

}
