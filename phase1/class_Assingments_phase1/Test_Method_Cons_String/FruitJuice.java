package juice_code;

import java.util.Scanner;

public class FruitJuice {
	int product_code;
	String flavour;
	String pack_type ;
	int pack_size;
	int product_price;
	
	FruitJuice(){
		product_code=0;
		flavour="     ";
		pack_type ="    ";
		pack_size=0;
		 product_price=0;
	}
 void input() {
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("enter flavour of drink:");
	 flavour=sc.nextLine();
	 
	 System.out.println("enter pack type of drink:");
     pack_type=sc.nextLine();
     
	 System.out.println("enter product code of drink:");
	 product_code=sc.nextInt();
	  
     System.out.println("enter product price of drink:");
     product_price=sc.nextInt();
     
     System.out.println("enter pack size of drink in mL:");
     pack_size=sc.nextInt();
     
     }
 void discount () {
	 
	product_price= product_price-10;
 }
 
 void display() {
	 System.out.println("<<<<<<Product details>>>>>>");
	 System.out.println("product code :>> " +product_code);
	 System.out.println("flavour :>> " +flavour);
	 System.out.println("pack type of drink:>> "+pack_type);
	 System.out.println("product price :>> "+product_price+ " Rs with 10Rs OFF");
	 System.out.println("pack size in ml:>> " +pack_size+ " mL");
 }
 
 
	public static void main(String[] args) {
		
		FruitJuice fj=new FruitJuice();
		fj.input();
        fj.discount();
        fj.display();

	}

}
