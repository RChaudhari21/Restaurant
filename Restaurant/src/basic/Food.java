package basic;

import java.util.Scanner;

public class Food {
	public String Name;
	public float Price;
	
	public Food(String Name, float Price)
	{
		this.Name=Name;
		this.Price=Price;
	}
	
	public Food() {
		// TODO Auto-generated constructor stub
	}

	public void input() {
		Scanner bp=new Scanner(System.in);
		System.out.println("Enter Name Food");
		Name=bp.nextLine();
		System.out.println("Enter Price Food");
		Price=bp.nextFloat();
		
	}
	
	public void Payment() {
		System.out.println("Price= "+Price);
		
	}
	
	public String detail() {
		return Name+" "+Price;
		}
	
	public float getPrice(float f) {
		return Price;
	}

	public String getName() {
		return Name;
	}
	
	public void setName(String Name) {
		this.Name=Name;
	}
	public void setPrice(Float Price) {
		this.Price=Price;
	

	//public int detail() {
		// TODO Auto-generated method stub
		return;
	}

	

	
}
	
	