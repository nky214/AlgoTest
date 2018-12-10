import javax.swing.JOptionPane;

public class AlgoTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello");

		
		int num_1 = Integer.parseInt(JOptionPane.showInputDialog("input num"));
//		int num_2 = Integer.parseInt(JOptionPane.showInputDialog("input num"));
		//System.out.println("num1: "+num_1+" num2:"+num_2);
		

			switch(num_1){
			
			case 1: 
				System.out.println("deposit");
				break;
			case 2: 
				System.out.println("withrawl");
				break;
			case 3: 
				System.out.println("transfer");
				break;
			default: 
				System.out.println("try again");
				break;
				
			}
//	
//			if(num_1==num_2){
//			System.out.println("Same");
//			}else{
//				System.out.println("Diff");
//			}
			
	
		
		System.out.println("system end");
	}

}
