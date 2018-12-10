import java.util.Scanner;

public class Code09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);

		System.out.println("How many Number");
		int n = kb.nextInt();
		int [] tarray = new int[n];
		System.out.println("Set number");
		for(int i= 0; i<n; i++){
			tarray[i]=kb.nextInt();
		}
		kb.close();

		int [] dtarray = new int[n];

		for(int j=0; j<n;j++){

			if(j<n-1){
				dtarray[j]=tarray[j+1];
			}else{
				dtarray[j]=tarray[0];
			}
			System.out.print(dtarray[j]);
		}
	}

}
