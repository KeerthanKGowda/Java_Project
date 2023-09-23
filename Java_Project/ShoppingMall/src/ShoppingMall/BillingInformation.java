package ShoppingMall;
import java.util.*;
public class BillingInformation {
	static int totalBill;
	public void bill() {
		System.out.println("Current Customer is ");
		if(!(Customer.p.isEmpty())) {
			System.out.println(Customer.p.pop());
		}

		//  for(int i=0;i<=Storeitems.doubles.size()-1;i++) {
		System.out.println("Billing Information");
		System.out.println("Total_Bill is"+Storeitems.doubles.peek());
		totalBill+=Storeitems.doubles.pop();
		System.out.println("Product Purchased");
		System.out.println(Storeitems.stack.pop());
		// }
	}
	public void giveAways() {
		if(totalBill>=200) {
			System.out.println("You Have Won Give Away");
		}
	}
}

