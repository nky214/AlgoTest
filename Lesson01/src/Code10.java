
public class Code10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("prime?");

		//int i=7;

		for(int i=2;i<100;i++){

			boolean isPrime = true;

			for(int j=2;j<=i/2 && isPrime;j++){

				if(i%j==0){
					isPrime =false;
						System.out.println("prime is false ");
					//break;
				}

			}

			if(isPrime){
						System.out.println("prime: "+i);
			}
		}


/*
		for(int i=2;i<100;i++){

			boolean isPrime = true;

			for(int j=2;j<i;j++){

				if(i%j==0){
					isPrime =false;
				//	System.out.println("prime is false ");
					//break;
				}

			}

			if(isPrime){
				System.out.println("prime: "+i);
			}
		}
*/
	}
	
}