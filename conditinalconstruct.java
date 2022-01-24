package session3;
import java.util.Scanner;

public class conditinalconstruct {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an Amount: ");
		double amount= scanner.nextDouble();
		
		System.out.println("Enter a Promo Code: ");
		int promocode=scanner.nextInt();
		
		scanner.close();
		System.out.println("You Entered: "+amount+" | " +promocode);
		 int hungry= 101;
		 int zomhello = 201;
		
		/*if(amount>=159) {
			System.out.println("You can Apply The Promo Code");
		}else {
			System.out.println("You Cannot Apply The Promo Code");
		
		}*/
		
		double discount=0;
		if(promocode==hungry && amount>=159) {
			discount=0.5*amount;
			System.out.println("Discount is: \u20b9"+discount);
		}else {
			System.out.println("Invalid promo code or lesser amount");
		}
		
		
		
		//nested if/else
		/*double discount=0;
		if(promocode==jumbo) {
			if(amount>=200) {
				discount = 0.5*amount;
				System.out.println("\"Discount is: \\u20b9\"+discount");
				System.out.println("jumbo applied succesfully");
				
			}else {
				System.out.println("amount is lesser. Please add items to your cart");
			}
		}else if(promocode==zomhello) {
			if(amount>=159) {
				discount = 0.4*amount;
				if(discount>80) {
					discount=80;
					
				}
				System.out.println("discount is: \u20b9"+discount);
				System.out.println("zomhello is applied successfully");
				
			}else {
				System.out.println("amount is lesser. please add item to the cart");
			}
		}else {
			System.out.println("invalid promocode");
		}*/
		/*double discount=0;
		switch(promocode):
			
		
		case jumbo:
			if(amount>=200) {
				discount = 0.5*+amount;
				System.out.println("Discount is: \u20B9"+discount);
				System.out.println("jumbo is applied successfully");
			}else {
				System.out.println("amount is lesser. please add itmes to cart"+(200-amount)+"more");
				
			}
			break;
		case zomhello:
			if(amount>+159) {
				discount=0.4*amount;
				if(discount>80) {
				discount=80;
				}
				System.out.println("discount is: \u20B9"+discount);
				System.out.println("zomhello applied successfully");
				
			}else {
				System.out.println("amounnt is lesser. please add items worth"+(159-discount)+"more");
			}
			break;
		default:
			System.out.println("invalid promocde");
			
		
		}
		amount -=discount;
		System.out.println("please pay final amount: \u20B9"+amount);
		*/
		}

}
