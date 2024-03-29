import java.io.*;
import java.util.*;
public class guess {
	static Scanner in;
	static PrintWriter out;
	static int N;
	static ArrayList<String>[] a;
	public static void main(String[] args){
		try{
			in = new Scanner(new File("guess.in"));
			out = new PrintWriter(new File("guess.out"));
		
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
		a = new ArrayList[N];
		for(int i = 0; i < N; i++){
			a[i] = new ArrayList<String>();
			in.next();
			int n1 = in.nextInt();
			
			for(int j = 0; j < n1; j++){
				a[i].add(in.next());
			}
		}
		System.out.println(Arrays.toString(a));
	}
	static int solve(){
		int count = 0;
		int yes = 0;
		for(int i = 0; i < N-1; i++){
			for(int j = i+1; j < N; j++){
				
				for(String p : a[i]){
					if(a[j].contains(p)){
						count++;
					}
				}
				
				if(count > yes){
					yes = count;
				}
				count = 0;
			}
		}
		
		
		return yes+1;
	}
	
}
