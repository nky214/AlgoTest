package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code21 {
	
	static int n;
	static int [][] grid;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner inFile;
			try {
				inFile = new Scanner(new File("input.txt"));
				n = inFile.nextInt();
				grid = new int[n][n];
				for(int i=0; i<n; i++){
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
