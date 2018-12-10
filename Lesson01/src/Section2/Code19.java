package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] name = new String[1000];
		String [] number = new String[1000];
		int n = 0;
				
		String filename = "input.txt";
		Scanner inFile = null;
		try {
			inFile = new Scanner(new File(filename));
		
		while(inFile.hasNext()){
			name[n]=inFile.next();
			number[n]=inFile.next();
			n++;
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
	
		
		for(int i=0; i<n ; i++){
			System.out.println("Name: "+name[i]+ ", Number: "+number[i]);
		}
		
		
		
		inFile.close();

	}

}
