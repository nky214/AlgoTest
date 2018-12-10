import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello, world";
		String input = null;
		
		int [] grades = new int[5];
		
		grades[0]=100;
		grades[1]=200;
		grades[3]=300;
		
		
		System.out.println(grades);
		
		Scanner kb = new Scanner(System.in);
		input =kb.next();
		System.out.println(kb.findInLine(input));
		
		if(input.equals(str)){
			System.out.println("Strings match!");
			
		}else{
			System.out.println(str);
			System.out.println("str:"+str);
			System.out.println("input:"+input);
			System.out.println("Strings not match");
		}
		
		kb.close();
		
	}

}
