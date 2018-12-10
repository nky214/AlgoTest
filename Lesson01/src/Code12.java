import java.util.Scanner;

public class Code12 {

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

		System.out.println("Max number:");
		int max = 0;
		for(int i=0;i<n;i++){
			int tmp = 0;
//			for(int j=0; j<n;j++){
			for(int j=i; j<n;j++){
				tmp = tmp+data[j];
				if(max < tmp){
					max = tmp;
				}
			}
		}
		System.out.println("max: "+max);
		kb.close();
	}

}
