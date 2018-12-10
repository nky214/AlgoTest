import java.util.Scanner;

public class Code14 {

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


		for(int i=n-1; i>0;i--){
			for(int j=0; j<i; j++){
				if(data[j]> data[j+1]){
					int tmp =data[j];
					data[j]= data[j+1];
					data[j+1]=tmp;
				}
			}
		}
		
		System.out.println("Sorted data:");
		for(int i=0; i<n ; i++){
			System.out.println(data[i]);
		}

		kb.close();
	}

}
