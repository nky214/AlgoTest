package Section2;

import java.util.Scanner;

public class Code18 {

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

		kb.close();
		
		int[] sortedData = new int[n];
		sortedData = bubbleSort(data, n);
		
		System.out.println("Sorted data:");
		for(int i=0; i<n ; i++){
			System.out.println(sortedData[i]);
		}

	}
	
		public static int[] bubbleSort(int[] data, int n){
			
			for(int i=n-1; i>0;i--){
				for(int j=0; j<i; j++){
					if(data[j]> data[j+1]){
						swap(data[j],data[j+1]);
					}
				}
			}
			
			return data;
		}
		
		public static void swap(int a, int b){
			int tmp =a;
			a= b;
			b=tmp;
			
			
		}

}
