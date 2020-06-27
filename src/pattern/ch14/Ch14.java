package pattern.ch14;

import java.util.Scanner;

public class Ch14 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Ibeverage beverage = new Base();
		
		boolean done = false;
		
		while(!done) {
			System.out.println("totalPrice :: " + beverage.getTotalPrice());
			switch (sc.nextInt()) {
			case 0:
				done = true;
				break;
			case 1:
				beverage = new Espresso(beverage);
				break;
			case 2: 
				beverage = new Milk(beverage);
				break;
			default:
				done = true;
				break;
			}
		}
	}
}