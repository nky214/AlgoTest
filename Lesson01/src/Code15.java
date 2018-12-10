import java.util.Scanner;

public class Code15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner kb = new Scanner(System.in);
		System.out.println("How many number you want to put");
		int n = kb.nextInt();

		System.out.println("put numbers");
		int[] data = new int[n];
		//data[0] = kb.nextInt();
		//int initial = 0; 
		//int tmp=0;
		for(int i=1;i<10;i++){
			int tmp = kb.nextInt();
			int j=i-1;
			while(j>=0 && data[j]>tmp){

				data[j+1]=data[j];
				j--;
			}
			data[j+1]=tmp;
			
			for(int k=0; k<=i; k++){
				System.out.print(data[k]);
				System.out.println(tmp);
			}
		}
		kb.close();
	}

}
