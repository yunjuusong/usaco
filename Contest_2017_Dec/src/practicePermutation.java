import java.io.*;
import java.util.*;
public class practicePermutation {

	public static void main(String[] args) {
		String[] a = {"1","2","3","4"};
		String result = "";
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				if(i == j){
					continue;
				}
				for(int k = 0; k < 4; k++){
					if(i==k || j==k){
						continue;
					}
				
					for(int l = 0; l < 4; l++){
						if(i==l || j==l || k==l){
							continue;
						}
						result += a[i] + a[j] + a[k] + a[l] + "\n";
					}
				}
				
			}
			
		}
		System.out.println(result);
	}

}
