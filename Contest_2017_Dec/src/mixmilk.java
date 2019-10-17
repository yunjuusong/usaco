import java.io.*;
import java.util.*;
public class mixmilk {
	static Scanner in;
	static PrintWriter out;
	static int[] cow;
	static int[] capacity;
	
	public static void main(String[] args) {
		try{
			in = new Scanner(new File("mixmilk.in"));
			out = new PrintWriter(new File("mixmilk.out"));
			
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
		cow = new int[3];
		capacity = new int[3];
		for(int i = 0; i < 3; i++){
			capacity[i] = in.nextInt();
			cow[i] = in.nextInt();
		}
		//System.out.println(Arrays.toString(cow));
	}
	static String solve(){
		int i = 0;
		while(i<99){
			if(cow[0]+cow[1] <= capacity[1]){
				cow[1] = cow[1] + cow[0];
				cow[0] = 0;
				
			}
			else{
				cow[0] = (cow[1] + cow[0]) - capacity[1];
				cow[1] = capacity[1];
				
			}
			i++;
			//System.out.println(cow[0] + " " + cow[1] + " " + cow[2]);
			if(cow[1] + cow[2] <= capacity[2]){
				cow[2] = cow[2] + cow[1];
				cow[1] = 0;
				
			}
			else{
				cow[1] = (cow[2] + cow[1]) - capacity[2];
				cow[2] = capacity[2];
				
			}
			i++;
			
			if(cow[2] + cow[0] <= capacity[0]){
				cow[0] = cow[0] + cow[2];
				cow[2] = 0;
				
			}
			else{
				cow[2] = (cow[0] + cow[2]) - capacity[0];
				cow[0] = capacity[0];
				
			}
			i++;
		}
		if(cow[0]+cow[1] <= capacity[1]){
			cow[1] = cow[1] + cow[0];
			cow[0] = 0;
		}
		else{
			cow[0] = (cow[1] + cow[0]) - capacity[1];
			cow[1] = capacity[1];
			
		}
		
		String result = cow[0] + "\n" + cow[1] + "\n" + cow[2];
		return result;
	}
}
