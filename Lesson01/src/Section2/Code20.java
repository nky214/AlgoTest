package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {

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

		bubbleSort(n, name, number);

		for(int i=0; i<n ; i++){
			System.out.println("Name: "+name[i]+ ", Number: "+number[i]);
		}



		inFile.close();
	}


	private static void bubbleSort(int n, String[] name,String[] number){
		for(int i=n-1;i>0;i--){
			for(int j=0; j<i;j++){
				if(name[j].compareTo(name[j+1])>0){
					String tmpName = name[j];
					String tmpNumber = number[j];
					name[j]=name[j+1];
					number[j]=number[j+1];
					name[j+1]=tmpName;
					number[j+1]=tmpNumber;
				}
			}

		}
	}
}