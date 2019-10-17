import java.io.*;
import java.util.*;
public class paint {
	static Scanner in;
	static PrintWriter out;
	static int a;
	static int b;
	static int c;
	static int d;
	static int[] fence;
	
	public static void main(String[] args) {
		try{
			in = new Scanner(new File("paint.in"));
			out = new PrintWriter(new File("paint.out"));
			
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
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		fence = new int[101];
		for(int i = a; i < b; i++){
			fence[i] = 1;
			//System.out.println(i);
		}
		for(int i = c; i < d; i++){
			fence[i] = 1;
			//System.out.println(i);
		}
		//System.out.println(Arrays.toString(fence));
	}
	static int solve(){
		int result = 0;
		for(int i = 0; i < fence.length; i++){
			if(fence[i] == 1){
				result++;
			}
		}
		return result;
	}
}
