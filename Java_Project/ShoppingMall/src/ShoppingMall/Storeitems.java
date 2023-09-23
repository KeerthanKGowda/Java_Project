package ShoppingMall;
import java.util.*;
interface Store {
	public void addProduct();
	public void buyProduct();
	public void displayProduct();

}
public class Storeitems implements  Store{

	Map<Integer, Product> db = new LinkedHashMap<Integer, Product>();
	Scanner sc = new Scanner(System.in);
	public static Stack<Double> doubles=new Stack<>();

	public int quantity;
	int quantit;
	public int count;
	public int arr[]=new  int[50];
	public static Stack<Product> stack=new Stack<Product>();
	@Override
	public void addProduct() {
		db.put(1, new Product("choclate", 10, 10));
		db.put(2, new Product("biscuits", 20, 20));
		db.put(3, new Product("IceCream", 30, 50));
		db.put(4, new Product("Mobile", 52, 25000.00));
	}

	@Override
	public void displayProduct() {
		Set<Integer> keys = db.keySet();
		for (Integer key : keys) {
			Product p = db.get(key);
			System.out.println("Enter " + key + " to order " + p.getName());
			System.out.println("Cost : Rs, " + p.getCost());
			System.out.println("quantity : "+p.getQuantity());
			System.out.println("-------------------------------");
		}
	}

	@Override
	public void buyProduct() {
		int count=0;
		System.out.println("Enter the choice");
		int choice = sc.nextInt();// 1 2 3 ->choice ->key

		Product p = db.get(choice); // 1 2 3 null

		if (p != null) {

			this.count=count;
			System.out.println("Enter the quantity "+p.getName());
			Product product=new Product (p.getName(),p.getQuantity(),p.getCost());
			stack.push(product);
			quantit = sc.nextInt();// get the quantity from the user

			if (quantity <= p.getQuantity()) {
				// calculating the current product cost
				p.setQuantity(p.getQuantity() - quantit);
				doubles.push(p.getCost()*quantit);

				System.out.println("Orderd "+quantit+" "+ p.getName());


			} else {
				try {
					String msg = "Invalid Quantity " + p.getName() + " is not Availbale";
					throw new InvalidQuantityException(msg);

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

		} else {
			try {
				String msg = "Invalid Choice,kindly Enter the Valid choice";
				throw new InavlidChoiceException(msg);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
