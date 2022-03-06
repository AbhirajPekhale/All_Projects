package employeeInc;

import java.util.Scanner;

public class Grade_Rivision {
	String name;
	int basic;
	int expnc;
	double inc;
	double newbasic;
	
	Grade_Rivision() {
		name="";
		basic=00;
		expnc=00;
		inc=00;
		newbasic=00;
		
	}
	void accept() {
		Scanner ac = new Scanner(System.in);
		System.out.print("enter the name of employee: ");
		name=ac.nextLine();
		
		System.out.print("enter the basic salary of employee: ");
		basic=ac.nextInt();
		
		System.out.print("enter the total expereince of employee: ");
		expnc=ac.nextInt();
		
		
	}
	
	void increment() {
		if(expnc <=3 ) {
			inc=(1000)+ basic/(0.10);
		}
		
		else if(expnc<=5) {
			inc=(3000)+ basic*(0.12);
		}
		
		else if(expnc<=10) {
			inc=(5000)+ basic* (0.15);}
		
		else
		{
			inc=(8000)+ basic*(0.20);
			}
          newbasic=inc+basic;
	}
	
	public void display() 
	{
		System.out.println("employee name: " +name);
		System.out.println("employee basic payment: " +basic+ "RS");
		System.out.println("employee experince: " +expnc+ "years");
		System.out.println("employee increment: " +inc);
		System.out.println("employee new basic salary: " + newbasic+ " RS");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade_Rivision obj=new Grade_Rivision();
		
		obj.accept();
		obj.increment();
		obj.display();
		}

}
