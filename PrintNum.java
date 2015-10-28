import java.util.Scanner;

public class PrintNum{

	public static void main( String[] args){
	
		int a =0;
		Scanner in = new Scanner(System.in);
		
		while(a <= 100){
		System.out.println("Tyep a number greater than 100");
		System.out.println("Type number");
		a = in.nextInt();
		}
	}
}