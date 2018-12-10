import java.util.Scanner;

public class Code13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("How many number you want to put");
		int n = kb.nextInt();

		System.out.println("put numbers");
		int[] data = new int[n];

		for(int i=0;i<n;i++){
			data[i] = kb.nextInt();
		}

		for(int i=0;i<n;i++){
			for(int j=i; j<n;j++){
				
				int val=0;
				for(int k=0; k<=n; k++){
					val = val*10+data[i];
				
				}
			
			}
		}

		kb.close();

	}

}
