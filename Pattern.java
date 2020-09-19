import java.util.Scanner;
public class Pattern {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("enter 1 number");
		
		String s=obj.nextLine();
		int k=Integer.parseInt(s);
		
		for(int i = 1; i<=k; i++) {
			
			for(int j=k ;j>=i;j--) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		
	}
	

}