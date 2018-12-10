import java.util.Scanner;

public class Code11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		int n = kb.nextInt();
		int[] data = new int [n];
		for(int k=0;k<data.length;k++){
			data[k]=kb.nextInt();
		}

		for(int j=0; j<data.length;j++){
			for(int i=j+1; i<data.length;i++){
				
				if(data[i] == data[j]){
					System.out.println("Found Number: " +data[i]+" : "+data[j]);
				}
			}
		}
		
		kb.close();
	}

}
