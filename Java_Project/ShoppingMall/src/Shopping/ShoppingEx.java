package Shopping;
import java.util.*;
class Men{
int Shirt=400,Pant=600,Tshirt=300;
public void MenItem()
{
System.out.println("1:Shirt \n2:Pant \n3:TShirt\n4:Generate Bill");
}
}
class WoMen
{
int Choodidaar=500,Lehenga=800,Saree=350;
public void WoMenItem()
{
System.out.println("1:Choodidaar \n2:Lehenga \n3:Saree \n4:Generate Bill");
}
}
public class ShoppingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Men m=new Men();
		WoMen w=new WoMen();
		Scanner s1=new Scanner(System.in);
		int option=1;
		int Choice=1;
		int Choice1=1;
		int e=0;
		int r=0;
		int t=0;
		System.out.println("Welcome to online Shopping ");
		System.out.println("Choose Category 1 Or 2 ");
		System.out.println("1.Display Men Items\n2.Display Women Item");
		while(option==1||option==2)
		{
		int num=s1.nextInt();
		if(num>2)
		{
			System.out.println("Please Enter Correct Option");
			option=s1.nextInt();
			if(option>2)
			{
				System.out.println("Declined");
				option=0;
			}
		}
		switch(num)
		{
		case 1:m.MenItem();
		System.out.println("Enter The 1 to 4 Choice for Purchase");
		while(Choice==1||Choice==2||Choice==3||Choice==4)
		{
		int ch=s1.nextInt();
		switch(ch)
		{
		case 1:System.out.println("Shirt:"+m.Shirt);
		System.out.println("Enter the Quantity:");
		int q=s1.nextInt();
		e=m.Shirt*q;
		System.out.println("Total Amount of Shirt "+e); 
		break;
		case 2:System.out.println("Pant:"+m.Pant);
		System.out.println("Enter the Quantity:");
		int q1=s1.nextInt();
		r=m.Pant*q1;
		System.out.println("Total Amount of Pant "+r); 
		break;
		case 3:System.out.println("Tshirt:"+m.Tshirt);
		System.out.println("Enter the Quantity:");
		int q2=s1.nextInt();
		t=m.Tshirt*q2;
		System.out.println("Total Amount of TShirt "+t); 
		break;
		case 4:System.out.println("Total  Bill of Men Item  Is:"+(e+r+t));
		       System.out.println("Thank You for Shopping With Us\nWelcome Again");
		       Choice=0;
		       break;
		default:System.out.println("Please Enter Correct Choice");
		Choice=s1.nextInt();
		if(Choice>4)
		{
		System.out.println("Incorrect Choice");
		Choice=0;
		break;
		}
		}
		}
		break;
		case 2:w.WoMenItem();
		System.out.println("Enter The 1 to 4 Choice for Purchase");
		while(Choice1==1||Choice1==2||Choice1==3||Choice1==4)
		{
		int ch1=s1.nextInt();
		switch(ch1)
		{
		case 1:System.out.println("Choodidaar:"+w.Choodidaar);
		System.out.println("Enter the Quantity:");
		int q=s1.nextInt();
		e=w.Choodidaar*q;
		System.out.println("Total Amount of Choodidaar "+e); 
		break;
		case 2:System.out.println("Lehenga:"+w.Lehenga);
		System.out.println("Enter the Quantity:");
		int q1=s1.nextInt();
		r=w.Lehenga*q1;
		System.out.println("Total Amount of Lehenga "+r); 
		break;
		case 3:System.out.println("Saree:"+w.Saree);
		System.out.println("Enter the Quantity:");
		int q2=s1.nextInt();
		t=w.Saree*q2;
		System.out.println("Total Amount of Saree "+t); 
		break;
		case 4:System.out.println("Total Bill of Women Items Is:"+(e+r+t));
		       System.out.println("*Thank You for Shopping With Us*\n<==Welcome Again==>");
		       Choice=0;
		break;
		default:System.out.println("Please Enter Correct Choice");
		Choice1=s1.nextInt();
		if(Choice1>4)
		{
		System.out.println("Incorrect Choice");
		Choice1=0;
		break;
		}
		}
		}
		break;		
		} 
		}
	}

}
