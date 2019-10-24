import java.util.*;
import java.io.*;
public class hps {
	static Scanner in;
	static PrintWriter out;
	static int N;
	static int[][] a;
	public static void main(String[] args) {
		try{
			in = new Scanner(new File("hps.in"));
			out = new PrintWriter(new File("hps.out"));
			
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
		a = new int[2][N];
		for(int i = 0; i < N; i++){
			a[0][i] = in.nextInt();
			a[1][i] = in.nextInt();
		}
	}
	static int solve(){
		int g1 = 0;
		int g2 = 0;
		for(int i = 0; i < N; i++){
			if(a[0][i]-a[1][i]==1 || a[0][i]-a[1][i]==-2){
				g1++;
			}
			else if(a[0][i]-a[1][i]==-1 || a[0][i]-a[1][i]==2){
				g2++;
			}
		}
		if(g1>g2) return g1;
		else return g2;
	}

}
