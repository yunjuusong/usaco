import java.io.*;
import java.util.*;
public class blist {
	static Scanner in;
	static PrintWriter out;
	static int N;
	static int[] a;
	
	public static void main(String[] args) {
		try{
			in = new Scanner(new File("blist.in"));
			out = new PrintWriter(new File("blist.out"));
			
			
			out.println(solve());
			
			in.close();
			out.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}


	}
	public static int solve(){
		N = in.nextInt();
		a = new int[1001];
		for(int i = 0; i < N; i++){
			int s = in.nextInt();
			int t = in.nextInt();
			int b = in.nextInt();
			
			for(int j = s; j <= t; j++){
				a[j] += b;
			}
		}
		Arrays.sort(a);
		return a[1000];
	}

}
