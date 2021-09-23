package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class GuestsOrder {
	private static int size;
	public String IdTable;
	ArrayList<Food> EatList = new ArrayList<Food>();
	public float TotalPayment;
	
	public String getIdTable() {
		return IdTable;
	}
	public void setEatlist(Food food) {
		EatList.add(food);
	}
	public void setTotalpayment(float TotalPayment) {
		this.TotalPayment=TotalPayment;
	}
	 
	public void input() {
		Scanner bp=new Scanner(System.in);
		System.out.println("Number table :");
		IdTable=bp.nextLine();
	}
	
	public void Print() {
		System.out.println("________________");
		System.out.println("number table: "+this.IdTable+" total payment :"+this.TotalPayment);
		for(Food m : this.EatList) {
			System.out.println("Selected Food is "+ m.Name);
			
		}
		System.out.println();
	}
	public void print() {
		
	}
	public void search() {
		Scanner bp=new Scanner(System.in);
		String idtable;
		int up=0;
		System.out.println("Enter table number payment: ");
		idtable =bp.nextLine();
		for(int i=0; i < GuestsOrder.size ; i++) {
			
		}
	}
		
	
	
}
	
	
	


