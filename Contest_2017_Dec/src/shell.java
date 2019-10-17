import java.io.*;
import java.util.*;
public class shell {
	static Scanner in;
	static PrintWriter out;
	static int N;
	static int[] a;
	static int[] b;
	static int[] g;
	static int[] game;
	
	public static void main(String[] args) {
		try{
			in = new Scanner(new File("shell.in"));
			out = new PrintWriter(new File("shell.out"));
			
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
		a = new int[N];
		b = new int[N];
		g = new int[N];
		game = new int[3];
		
		for(int i = 0; i < N; i++){
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			g[i] = in.nextInt();
		}
	}
	
	static int solve(){
		int max = 0;
		if(cup(0) > max){
			max = cup(0);
		}
		if(cup(1) > max){
			max = cup(1);
		}
		if(cup(2) > max){
			max = cup(2);
		}
		
		return max;
	}

	static int cup(int n){
		game[0] = 0;
		game[1] = 0;
		game[2] = 0;
		game[n] = 1;
		int temp = 0;
		int count = 0;
		for(int i = 0; i < N; i++){
			temp = game[a[i]-1];
			game[a[i]-1] = game[b[i]-1];
			game[b[i]-1] = temp;
			
			if(game[g[i]-1] == 1){
				count++;
			}
		}
		return count;
	}
}
