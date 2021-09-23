package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		ArrayList<GuestsOrder> guestsorder= new ArrayList<>();
		ManageFood managefood= new ManageFood();
		
		//managefood.bp();
		//managefood.print();
		
		//managefood.Price();
		//managefood.PrintOrder();
		
		int Select;
		
		Scanner bp=new Scanner(System.in);
		do {
			Menumain();
			Select= Integer.parseInt(bp.nextLine());
			switch(Select) {
			case 1:
				do {
					MenuManageFood();
					Select= Integer.parseInt(bp.nextLine());
					switch(Select) {
					case 1:
						managefood.bp();
						break;
					case 2:
						managefood.print();
						managefood.EditFood();
						break;
					case 3:
						managefood.Print();
						managefood.DeleteFood();
						break;
					case 4:
						managefood.PrintOrder();
						break;
					case 5:
						managefood.search();
						break;
					case 0:
						System.out.println("back");
						break;
					default:
						break;
					}
					
				}while (Select !=3);
			
				break;
			case 2:
				
				do {
					MenuOrder();
					Select= Integer.parseInt(bp.nextLine());
					switch(Select) {
					case 1:
						managefood.print();
						managefood.Price();
						break;
					
					case 0:
						System.out.println("back");
						break;
					default:
						break;
					}
					
				}while (Select !=3);
			
				break;
			
			default:
				break;
				
			}
			
		}while (Select !=3);
		
		
		}
		
	private static void MenuManageFood() {
		// TODO Auto-generated method stub
		
	}

	static void MenuOrder() {
		System.out.println("--------MENU ORDER-------");
		System.out.println("0. BACK TO MENU MAIN");
		System.out.println("1. Add food");	
		System.out.println("2. Edit food");
		System.out.println("3. Delete food");
		System.out.println("4. Print info table order");
		System.out.println("5. Payment");
		System.out.println("-----------------------");
		System.out.println("SELECT");
	
	}
	
	static void Menumain() {
		System.out.println("--------MENU MAIN-------");
		System.out.println("1. MANAGE MENU");
		System.out.println("2. Manage Order");
		System.out.println("2. EXIT");
	
	}
	

}
