package uri.list2;

import java.util.Scanner;

public class OneDigit {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		while(true){
			String s1 = in.next();
			String s2 = in.next();
			
			int n1 = oneDigitStr(s1);
			int n2 = oneDigitStr(s2);
			
			if(n1==0 && n2==0)
				break;
			
			if(n1>n2)
				System.out.println(1);
			else if(n1<n2)
				System.out.println(2);
			else 
				System.out.println(0);
		}	
	}
	
	static int oneDigitStr(String nStr){
		char [] cStr = nStr.toCharArray();
		int soma = 0;
		for(int i = 0; i < cStr.length; i++)
			soma += Character.getNumericValue(cStr[i]);
		if(soma<10)
			return soma;
		else 
			return oneDigitStr(soma+"");		
	}

}
