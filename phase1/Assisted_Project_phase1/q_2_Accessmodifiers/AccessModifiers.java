package q_2_Accessmodifiers;

class Accesm1{
	
	private void msg(){
		System.out.println("Accesesable only within class");
	}
	
	void msg1(){
		System.out.println("\nDefault: Accesesable only within class and within package");
	}
	protected void msg2(){
		System.out.println("\nProtected: Accesesable in within class and within package");
		System.out.println("\n----------Also----------");
		System.out.println("\nProtected: Accesesable outside class by subclass only after extends the parent class");
	}
	public void msg3(){
		System.out.println("\nPublic: Accesesable to All");
		
	}
	
}

public class AccessModifiers {


	public static void main(String[] args) {
		Accesm1 am1=new Accesm1();
		//am1.message();// compile time error due to private
		am1.msg1();
		am1.msg2();
		am1.msg3();
	}

}