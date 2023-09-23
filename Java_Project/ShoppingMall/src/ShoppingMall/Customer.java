package ShoppingMall;
import java.util.*;
public class Customer {

	//	Alpha shopping Centre decides to computerized it’s store, you are given the task to model the structure of the shopping Centre using appropriate data structures. 
	//	Design a data structure which stores the information of all the customers who visits the store, keep 50 as the default size of your data structure as your structure becomes full, increase it to the half of the present size. 
	//	You are also required to stores all the items the shopping Centre offers, store them in key value pair, insert values in an array using the hash function. 
	//	As the customer comes storehis information also assign him a purchase basket, you are required to design the purchase basket user can select the desired item he wants to purchase. The order of the item will be FILO the last purchased item will be served first on the bill counter. 
	//	Generate bill of the customer and store it with the customer information. 
	//	All the users who shopped more than 10,000 can request to participate in the giveaways scheme, giveaways will be given in first come first serve manner, and only first 5 customers will be served per day the remaining can participate in the lucky draw. 
	String customer_name;
	int customer_Id;
	private int size=50;
	static int count=100;
	public static Stack<Customer>  p=new Stack<>();
	Scanner scanner=new Scanner(System.in);


	public Customer() {
		super();
	}
	public Customer(String customer_name,int id ) {
		this.customer_name = customer_name;
		this.customer_Id = id;
	}

	private Vector<Customer> c=new Vector<Customer>(size);
	public void display() {
		System.out.println(c);
	}


	public void addingCustomer() {

		System.out.println("Welcome to The Alpha Shopping center");
		System.out.println("Please Enter Your Name");
		String name=scanner.next();

		if(name.trim().equals("") ) {
			System.out.println("Please Enter The Valid Name");
			String name1=scanner.next();
			Customer k=new Customer(name1,count++);
			if(c.size()<=50) {
				c.add(k);
				p.push(k);
			}
			else {
				k.size();
			}
		}else {

			if(c.size()<=50) {
				Customer k1=new Customer(name,count++);
				c.add(k1);
				p.push(k1);
				System.out.println("Your Id Created Succesfully ");
				System.out.println("Your Id is "+k1);
			}
			else {
				Customer customer=new Customer();
				customer.size();
			}
		}
	}

	@Override
	public String toString() {
		return "Customer [customer_name=" + customer_name + ", customer_Id=" + customer_Id + "]";
	}
	public  void size() {
		if(c.size()>50) {
			c.ensureCapacity(25);
		}
	}

}
