package uri.list1;

import java.util.Scanner;

public class Multiples {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first;
        first = in.nextInt();
        int second;
        second = in.nextInt();
        System.out.println(second%first==0||first%second==0?"Sao Multiplos":"Nao sao Multiplos");
   }

}
