import java.util.*;
import java.io.*;
public class sleepy {
	static Scanner in;
	static PrintWriter out;
	static int N;
	static int[] cows;
	public static void main(String[] args) {
		try{
			in = new Scanner(new File("sleepy.in"));
			out = new PrintWriter(new File("sleepy.out"));
			
			init();
			out.println(solve());
			
			in.close();
			out.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}


	}
	static void init(){
		N = in.nextInt();
		cows = new int[N];
		for(int i = 0; i < N; i++){
			cows[i] = in.nextInt();
		}
	}
	static int solve(){
		int count = 0;
		for(int i = N-1; i > 0; i--){
			if(cows[i-1] > cows[i]){
				count = i;
				break;
			}
		}
		return count;
	}
}