package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int totalcount = scan.nextInt();
		
		String[] itemlist = new String[totalcount];
		double[] itemprice = new double[totalcount];
		
		for (int i = 0; i < totalcount; i++) {
			
			itemlist[i] = scan.next();
			itemprice[i] = scan.nextDouble();
			
		}
		
		int customercount = scan.nextInt();
		
		String[] customername = new String[customercount];
		double[] pricesum = new double[customercount];
		
		for (int i = 0; i < customercount; i++) {
			
			String firstname = scan.next();
			String lastname = scan.next();
			
			customername[i] = firstname + " " + lastname;
			
			int itemtype = scan.nextInt();
			
			double total = 0;
			
			for (int a = 0; a < itemtype; a++) {
				
				int itemcount = scan.nextInt();
				String itemname = scan.next();
				
				for (int b = 0; b < totalcount; b++) {
					
					if (itemname == itemlist[b]) {
						total = total + itemcount * itemprice[b];
					}
					
				}
				
			}
			
			pricesum[i] = total;
			//System.out.println("checkarray: " + pricesum);
		}

		scan.close();
		
		String biggest = customername[calculatebiggest(pricesum)];
		double biggest_value = pricesum[calculatebiggest(pricesum)];
		String smallest = customername[calculatesmallest(pricesum)];
		double smallest_value = pricesum[calculatesmallest(pricesum)];
		double average = (biggest_value + smallest_value) / 2 ;
		
		System.out.println("Biggest: " + biggest + " (" + biggest_value + ")");
		System.out.println("Smallest: " + smallest + " (" + smallest_value + ")");
		System.out.println("Average: " + average);

	}
	
	//
	static int calculatesum(double[] vals) {
		
		int sum = 0;
		
		for (int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		
		return sum;
	}
	//
	
	static int calculatebiggest(double[] vals) {
		
		double cur_biggest = vals[0];
		int index = 0;

		for (int i=1; i < vals.length; i++) {
			if (vals[i] > cur_biggest) {
				cur_biggest = vals[i];
				index = i;
			}
		}
		
		return index;
	}
	
	static int calculatesmallest(double[] vals) {
		
		double cur_smallest = vals[0];
		int index = 0;
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] < cur_smallest) {
				cur_smallest = vals[i];
				index = i;
			}
		}
		
		return index;
	}
}
