package session3;

import java.util.Scanner;

public class switchcase {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an Amount: ");
		double amount= scanner.nextDouble();
		
		System.out.println("Enter a Promo Code: ");
		int promocode=scanner.nextInt();
		
		scanner.close();
		System.out.println("You Entered: "+amount+" | " +promocode);
		 final int hungry= 101;
		 final int zomhello = 201;
		 double discount = 0;
		 switch(promocode) {
			
			case hungry:
				
				if(amount >= 200) {
					discount = 0.5 * amount;
					System.out.println("Discount is: \u20b9"+discount);
					System.out.println("JUMBO Applied Successfully");
				}else {
					System.out.println("Amount is Lesser. Please add items worth "+(200-amount)+" more");
				}
				
				break;
				
			case zomhello:
				
				if(amount >= 159) {
					discount = 0.4 * amount;
					
					if(discount > 80) {
						discount = 80; // upto condition :)
					}
					
					System.out.println("Discount is: \u20b9"+discount);
					System.out.println("ZOMHELLO Applied Successfully");
				}else {
					System.out.println("Amount is Lesser. Please add items worth "+(159-amount)+" more");
				}
				
				break;
				
			default:
				System.out.println("Invalid Promo Code");
		
		}
		
		
		
		
		
		amount -= discount;
		
		System.out.println("Please pay final amount: \u20b9"+amount);


	}
	}
