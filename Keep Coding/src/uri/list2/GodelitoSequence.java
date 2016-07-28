package uri.list2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GodelitoSequence {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();
			List<Integer> godelito = new ArrayList<Integer>();
			godelito.add(3);

			while (n > 1) {
				godelito = updateGodelito(godelito);
				n--;
			}

			for (int i : godelito)
				System.out.print(i);
			System.out.println();
		}
	}

	// public static void main(String[] args) {
	//
	// Map m = new HashMap<Integer, List<Integer>>();
	//
	// List<Integer> godelito = new ArrayList<Integer>();
	// godelito.add(3);
	// m.put(1, godelito);
	//
	// int n = 1;
	// while(n<41){
	// godelito = updateGodelito(godelito);
	// n++;
	// m.put(n, godelito);
	// }
	//
	// Scanner in = new Scanner(System.in);
	//
	// while(in.hasNext()){
	// int number = in.nextInt();
	// for(int i : (List<Integer>)m.get(number))
	// System.out.print(i);
	// System.out.println();
	// }
	// }

	static List<Integer> updateGodelito(List<Integer> godelito) {
		List<Integer> newGodelito = new ArrayList<Integer>();

		int count = 0;
		int ref = -1;
		for (int i = 0; i < godelito.size(); i++) {
			if (godelito.get(i) == ref)
				count++;
			else {
				if (ref != -1) {
					newGodelito.add(count);
					newGodelito.add(ref);
					count = 0;
				}
				ref = godelito.get(i);
				count = 1;
			}
		}

		if (count > 0) {
			newGodelito.add(count);
			newGodelito.add(ref);
		}

		return newGodelito;
	}

}
