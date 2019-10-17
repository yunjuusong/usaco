import java.io.*;
import java.util.*;
public class billboard {
	static Scanner in;
	static PrintWriter out;
	static boolean[][] board;
	
	public static void main(String[] args) {
		try{
			in = new Scanner(new File("billboard.in"));
			out = new PrintWriter(new File("billboard.out"));
			
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
		board = new boolean[2001][2001];
		for(int i = 0; i < 2; i++){
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			for(int j = x1 + 1000; j <x2+1000 ; j++){
				for(int k = y1 + 1000; k < y2 + 1000; k++){
					board[j][k] = true;
				}
			}
		}
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		for(int i = x1 + 1000; i < x2+1000; i++){
			for(int j = y1+1000; j < y2 + 1000; j++){
				board[i][j] = false;
			}
		}
	}
	static int solve(){
		int count = 0;
		
		for(int i = 0; i < 2001; i++){
			for(int j = 0; j < 2001; j++){
				if(board[i][j] == true){
					count++;
				}
			}
		}
		return count;
	}

}
