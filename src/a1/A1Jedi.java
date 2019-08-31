package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int totalcount = scan.nextInt();
		
		String[] itemlist = new String[totalcount];
		
		for (int i = 0; i < totalcount; i++) {
			
			itemlist[i] = scan.next();
			double itemprice = scan.nextDouble();
			
		}
		
		int customercount = scan.nextInt();
		
		int[] num_customer = new int[totalcount];
		int[] num_items = new int[totalcount];
		
		for (int i = 0; i < customercount; i++) {
			
			String firstname = scan.next();
			String lastname = scan.next();
			int itemtype = scan.nextInt();
			
			boolean[] checkcustomer = new boolean[totalcount];

			
			for (int a = 0; a < itemtype; a++) {
				
				int itemcount = scan.nextInt();
				String itemname = scan.next();
				
				for (int b = 0; b < totalcount; b++) {
					if (itemname.equals(itemlist[b])) {
				
						if (!checkcustomer[b]) {
						num_customer[b]++;
						checkcustomer[b] = true;
						}
						
						num_items[b] = num_items[b] + itemcount;
					}
				
				}
				
			}
			
			
		}
		scan.close();	
		
		for (int i = 0; i < totalcount; i++) {
			if (num_customer[i] <= 0) {
				System.out.println("No customers bought " + itemlist[i]);
			}
			if (num_customer[i] > 0) {
				System.out.println(num_customer[i] + " customers bought " + num_items[i] + " " + itemlist[i]);
			}
		}

	}
	
	
}
