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
			
			double total = 0;
			
			String firstname = scan.next();
			String lastname = scan.next();
			
			customername[i] = firstname + " " + lastname;
			
			int itemtype = scan.nextInt();
			
						
			for (int a = 0; a < itemtype; a++) {
				
				int itemcount = scan.nextInt();
				String itemname = scan.next();
								
				for (int b = 0; b < totalcount; b++) {
					
					if (itemlist[b].equals(itemname)) {
						total = total + itemcount * itemprice[b];
					}
				}
			}
			
			pricesum[i] = total;
			
		}
		for (int v=0;v<pricesum.length;v++) {
			System.out.println(pricesum[v]);
		}
		scan.close();
		
		String biggest = customername[calculatebiggest(pricesum)];
		double biggest_value = pricesum[calculatebiggest(pricesum)];
		String smallest = customername[calculatesmallest(pricesum)];
		double smallest_value = pricesum[calculatesmallest(pricesum)];
		double average = calculatesum(pricesum)/pricesum.length;
		
		String biggest_2d = String.format("%.2f", biggest_value);
		String smallest_2d = String.format("%.2f", smallest_value);
		String average_2d = String.format("%.2f", average);
		
		System.out.println("Biggest: " + biggest + " (" + biggest_2d + ")");
		System.out.println("Smallest: " + smallest + " (" + smallest_2d + ")");
		System.out.println("Average: " + average_2d);

	}
	
	static double calculatesum(double[] vals) {
		
		double sum = 0;
		
		for (int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		
		return sum;
	}
	
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
