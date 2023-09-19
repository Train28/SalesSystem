package view;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

import model.Keyboard;
import model.Mouse;
import model.PC;
import model.Product;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Write the number of product u would like to register");

		System.out.println("1. PC" + "\n" + "2. Keyboard" + "\n" + "3. Mouse");
		int key = sc.nextInt();
					
		int id,price,weight;	
		boolean gaming;
		String name,typeKeyboard,sensor;
		 



		switch (key) {
		case 1:
			System.out.println("Enter id Number");
			id = sc.nextInt();
			System.out.println("Enter name PC");
			name = sc.next();
			System.out.println("Enter price PC");
			price = sc.nextInt();
			System.out.println("Enter weight PC");
			weight = sc.nextInt();
			System.out.println("Enter true if its gaming");
			gaming = sc.nextBoolean();


			PC p = new PC(id, name, price, weight, gaming);
			
			System.out.println(p.toString());
			
			break;

		case 2:
			
			System.out.println("Enter id Number ");
			id = sc.nextInt();
			System.out.println("Enter name Keyboard");
			name = sc.next();
			System.out.println("Enter price Keyboard");
			price = sc.nextInt();
			System.out.println("Enter weight Keyboard");
			weight = sc.nextInt();
			System.out.println("Enter type Keyboard");
			typeKeyboard = sc.next();
			
			Keyboard k = new Keyboard(id, name, price, weight, typeKeyboard);
			

			
			System.out.println(k.toString());
			break;
		case 3:
			System.out.println("Enter id Number");
			id = sc.nextInt();
			System.out.println("Enter name Mouse");
			name = sc.next();
			System.out.println("Enter price Mouse");
			price = sc.nextInt();
			System.out.println("Enter weight Mouse");
			weight = sc.nextInt();
			System.out.println("Enter sensor Keyboard");
			sensor = sc.next();
			
			Mouse m = new Mouse(id, name, price, weight, sensor);
			

			
			System.out.println(m.toString());

			break;

		default:
			break;
		}

		
		

		
	}

}
