package uri.list2;

import java.util.Scanner;

public class WhereAreMyKeys {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int nOfficesLastWeek = in.nextInt();
		int nOfficesLast2Days = in.nextInt();

		int[] listLast2Days = new int[1000];

		int n = 0;
		int day = 0;
		while (n < nOfficesLast2Days) {
			day = in.nextInt();
			listLast2Days[day] = 1;
			n++;
		}

		n = 0;
		day = 0;
		while (n < nOfficesLastWeek) {
			day = in.nextInt();
			if (listLast2Days[day] == 1)
				System.out.println(0);
			else {
				System.out.println(1);
				listLast2Days[day] = 1;
			}
			n++;
		}
	}
	
//	public static void main(String[] args) {
//		
//		Scanner in = new Scanner(System.in);
//		
//		int nOfficesLastWeek = in.nextInt();
//		int nOfficesLast2Days = in.nextInt();
//		
//		Map mapLast2Days = new HashMap<Integer, Integer>();
//		
//		int n = 0;
//		int day = 0;
//		while(n<nOfficesLast2Days){
//			day = in.nextInt();
//			mapLast2Days.put(day, day);
//			n++;
//		}
//		
//		n = 0;
//		day = 0;
//		while(n<nOfficesLastWeek){
//			day = in.nextInt();
//			if(mapLast2Days.containsKey(day))
//				System.out.println(0);
//			else{
//				System.out.println(1);
//				mapLast2Days.put(day, day);
//			}
//			n++;
//		}		
//	}
	
	
}
