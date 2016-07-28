package uri.list1;

import java.util.Scanner;

public class Banknotes {

	static int money;
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        money = in.nextInt();
        
        System.out.println(money);
        
        int value = 100;        
        print(value);
        
        value = 50;        
        print(value);
        
        value = 20;        
        print(value);
        
        value = 10;        
        print(value);
        
        value = 5;        
        print(value);
        
        value = 2;        
        print(value);
        
        value = 1;        
        print(value);
        value = 100;
   }
	
	public static void print(int value){
		int amount = money/value;
		System.out.println(amount+" nota(s) de R$ "+value+",00");
		money = money % value;
	}
}
