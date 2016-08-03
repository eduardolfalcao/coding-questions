package spoj.list1;

import java.util.Locale;
import java.util.Scanner;

public class FrotaTax {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in).useLocale(Locale.US);
	
		double ap, gp, akm, gkm;
		
		ap = in.nextDouble();
		gp = in.nextDouble();
		akm = in.nextDouble();
		gkm = in.nextDouble();
		
		if((gkm/gp)>=(akm/ap))
			System.out.println("G");
		else
			System.out.println("A");
	}

}
