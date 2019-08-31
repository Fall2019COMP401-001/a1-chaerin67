package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for (int i = 0; i < num; i++) { 
						
			String firstname = scan.next();

			String lastname = scan.next();
			
			char initial = firstname.charAt(0);
						
			int itemnumber = scan.nextInt();
			
			double total = 0;
			
			for (int a = 0; a < itemnumber; a++) {
				
				int quantity = scan.nextInt();
				String item = scan.next();
				double price = scan.nextDouble();

				total = total + quantity * price;

			}	
			
			System.out.println(initial + ". " + lastname + String.format("%.2f", total));

		}
		
		scan.close();
	}
}