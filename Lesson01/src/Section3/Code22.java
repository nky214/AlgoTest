package Section3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code22 {

	static String[] words = new String[100000];
	static int [] count = new int[100000];
	static int n=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		while(true){

			System.out.print("$ ");
			String command = kb.next();
			if(command.equals("read")){
				String fileName = kb.next();
				makeIndex(fileName);
			}else if(command.equals("find")){
				String str = kb.next();
				int index = findWord(str);
				if(index >-1){
					System.out.println("The word"+ words[index]+"appers "+count[index]+" times.");
				}else{
					System.out.println("The word "+str+" not in Text");
				}
			}else if(command.equals("saveas")){
				String fileName = kb.next();
				saveAs(fileName);

			}else if(command.equals("exit")){
				break;
			}
		}

		for(int i=0; i<n; i++){
			System.out.println(words[i]+" "+count[i]);
		}

		kb.close();
	}

	public static void makeIndex(String fileName){
		try {
			Scanner inFile = new Scanner(new File(fileName));
			while(inFile.hasNext()){
				String str = inFile.next();

				String trimmed = trimming(str);

				if(trimmed != null){
					String t = trimmed.toLowerCase();
					addWord(t);
				}
			}
			inFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("No File");
			return;
		}
	}

	public static String trimming(String str){

		int i=0;
		int j=str.length()-1;
		while(i<=str.length()-1 && !Character.isLetter(str.charAt(i))){ //while i-th character is not letter
			i++;
		}

		while(j>=0 && !Character.isLetter(str.charAt(j))){
			j--;
		}
		if(i>j){
			return null;
		}
		return str.substring(i, j+1);
	}

	public static void addWord(String str){
		int index = findWord(str); //returns -1 if not found
		if(index !=-1){
			count[index]++;
		}else{
			int i=n-1;
					while(i>=0 && words[i].compareToIgnoreCase(str)>0){
						words[i+1] = words[i];
						count[i+1] = count[i];
						i--;
					}
			words[n]=str;
			count[n]=1;
			n++;
		}
	}

	public static int findWord(String str){
		for(int i=0; i<n; i++){
			if(words[i].equalsIgnoreCase(str)){
				return i;
			}
		}
		return -1;
	}

	public static void saveAs(String fileName){

		PrintWriter out;
		try {
			out = new PrintWriter(new FileWriter(fileName));

			for(int i=0; i<n; i++){
				out.println(words[i]+ " "+ count[i]);
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Save Failed");
			return;
		}
	}

}
