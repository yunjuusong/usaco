import java.util.*;
import java.io.*;
public class backforth {
	static Scanner in;
	static PrintWriter out;
	static int[] a;
	static int[] b;
	static int[] a1, b1;
	public static void main(String[] args) {
		try{
			in = new Scanner(new File("backforth.in"));
			out = new PrintWriter(new File("backforth.out"));
			
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
		a = new int[10];
		b = new int[10];
		a1 = new int[10];
		b1 = new int[10];
		for(int i = 0; i < 10; i++){
			a[i] = in.nextInt();
			a1[i] = a[i];
		}
		for(int i = 0; i < 10; i++){
			b[i] = in.nextInt();
			b1[i] = b[i];
		}
	}
	static int solve(){
		int result = 0;
		int milk = 1000;
		Set<Integer> s = new HashSet<Integer>();
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				a = a1.clone();
				b = b1.clone();
				milk = 1000;
				int first = milk - a[i] + b[j];
				int temp = a[i];
				a[i] = b[j];
				b[j] = temp;
				for(int k = 0; k < 10; k++){
					for(int l = 0; l < 10; l++){
						milk = first - a[k] + b[l];
						s.add(milk);
					}
				}
			}
		}
		return s.size();
	}

}
