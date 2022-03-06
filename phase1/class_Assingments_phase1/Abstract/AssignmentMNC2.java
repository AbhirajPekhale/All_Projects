package assingnment2;

abstract class MNC
{
	MNC()
	{
		System.out.println("in defaut constructor of >>>> MNC class");
	}
	abstract void region();
	abstract void department();
	
	public void normal()
	{
		System.out.println("this is normal method in >>>>>MNC class");
	}
}

//in Infosys  class


abstract class Infosys extends MNC
{
	void region()
	{
		System.out.println("this abstract region method of >>>>> INFOSYS");
	}
}

// in Class hello

class Company extends Infosys
{
	void region()
	{
		System.out.println("This abstarct region method is implementd in >>>> Company class");
	}
	void department() {
		System.out.println("This abstarct department method is implementd in >>>>>Company class");
	}
	void display_Company() 
	{
		System.out.println("This is display method of >>>>>Company class");
		
	}
}


public class AssignmentMNC2
{
	public static void main(String[] args) 
	{
		Company obj=new Company();
		obj.department();
		obj.region();
		obj.display_Company();	
		obj.normal();
	   }
}

