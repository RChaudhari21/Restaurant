package basic;

import java.util.ArrayList;
import java.util.Scanner;


public class ManageFood {
	private static final int i = 0;
	//private static final int SelectFood = 0;
	ArrayList<Food> foodlist = new ArrayList<>();
	ArrayList<GuestsOrder> guestsorder= new ArrayList<>();
	Food Food;
	public GuestsOrder GuestsOrder;
	public int SelectFood;
	
	public void ManagerFood() {
		
	}
	Scanner bp=new Scanner(System.in);
	
	public void bp() {
		System.out.println("Enter number of food add in menu");
		int n = Integer.parseInt(bp.nextLine());
		for(int i=0;i<n;i++) {
			Food food = new Food();
			food.input();
			foodlist.add(food);
			
		}
	}
	
	public void print() {
		for(int i=0; i< foodlist.size(); i++) {
			System.out.println((i+1)+"."+foodlist.get(i).detail());
		}
	}
	public void Price() {
		float PriceFood=0;
		float Totalpayment=0;
		int number;
		GuestsOrder guest=new GuestsOrder();
		guest.input();
		guestsorder.add(guest);
		for(int i=0; i<1;i++) {
			System.out.println("Select Food"+(i+1));
			SelectFood = bp.nextInt();
			if(SelectFood==0)
				guest.setTotalpayment(Totalpayment);
				System.out.println("Total Payment");
				System.out.println(Totalpayment);
				System.out.println("Thank You, See you again");
				break;
			}
		{
				System.out.println("Enter number");
				number=bp.nextInt();
				Food food = foodlist.get(SelectFood-1);
				guest.setEatlist(food);
				PriceFood =food.Price*number;
			}
			Totalpayment+=PriceFood;
			System.out.println("Order Finish");
			System.out.println("Payment "+(i+1)+" is:");
			System.out.println(" "+PriceFood);
			System.out.println("Finish Order enter 0");
		}
		
	
	public void PriceOrder() {
		for(int i=0; i<guestsorder.size(); i++) {
			 guestsorder.get(i).print();
			
		}
		
	}
	public String search() {
		Scanner bp=new Scanner(System.in);
		String idtable;
		int up=0;
		System.out.println("Enter table number payment: ");
		idtable =bp.nextLine();
		for(int i=0; i < guestsorder.size(); i++) {
			if(guestsorder.get(i).getIdTable().equalsIgnoreCase(idtable)) {
					guestsorder.get(i).print();
					up++;
					if(up==0) {
						
					System.out.println("No table Number "+idtable);
						
					}
					
		
			
					
			}else 
			
			public String EditName() {
				System.out.println("Enter name edit:");
				return bp.nextLine();
			}
			public float EditPrice() {
				System.out.println("Enter Prise edit:");
				return bp.nextFloat();
		
			}
			public void EditFood() {
				String namefood;
				int up=0;
				System.out.println("Enter name food to delete");
				String deletefood = bp.nextLine();
				for(int i=0; i< foodlist.size(); i++) {
					if(foodlist.get(i).getName().equals(deletefood)) {
						up++;
						foodlist.remove(i);
						System.out.println("delete finish");
						break;
					}
					
				}if (up==0 ) {
					System.out.println("No food name is "+deletefood);
				}
				
			}
					public void DeleteFood() {
						String deletefood;
						int up=0;
						System.out.println("Enter name food to delete");
					}
				
				
			
		
	
		

	public void PrintOrder() {
		// TODO Auto-generated method stub
		
	}

	public void Print() {
		// TODO Auto-generated method stub
		
	}
		
}


