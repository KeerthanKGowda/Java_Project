package ShoppingMall;
import java.util.*;
public class ShopMain {
	static boolean a=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Storeitems storeitems=new Storeitems();
		storeitems.addProduct();
		Customer customer=new Customer();
		BillingInformation billingInformation=new BillingInformation();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To The Alpha_Shoping_Center");
		while(a==true) {
			System.out.println("Enter 1 to Add Customer details\nEnter 2 to  Display Customer details \nEnter 3 to display product\nEnter 4 to Buy Product\nEnter 5 to Billing Process");
			int choice =scanner.nextInt();
			switch(choice) {
			case 1: customer.addingCustomer();
			break;
			case 2:customer.display();
			break;
			case 3:storeitems.displayProduct();
			break;
			case 4:storeitems.buyProduct();
			break;
			case 5:billingInformation.bill();
			billingInformation.giveAways();
			break;
			default:
				a=false;
			}

		}
	}

}
