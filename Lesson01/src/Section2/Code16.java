package Section2;

import java.util.Scanner;

public class Code16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		Code16 code16 = new Code16();
		int result = code16.power(a,b);
		
		System.out.println(result);
		
		
		kb.close();
		
		
	}
	
	public int power (int n, int m){
		int prod = 1;
		for(int i=0;i<m;i++){
			prod = prod *n;
		}
		
		return prod;
	}

}
