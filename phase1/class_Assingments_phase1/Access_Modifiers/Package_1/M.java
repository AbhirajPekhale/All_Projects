package acessmodifiresproject;

public class M {
	
	private  int i = 3; 
	long l = 264465465; 
	protected float num1=10.1f;

	public void methodPublic(){     // public method
		System.out.println("public method from Class: M");
		methodPrivate();
		methodDefault();	
	}
	
	protected void methodProtected(){   // protected method
		System.out.println("protected method from Class: M");
	}
	
	void methodDefault(){    //default method
		System.out.println("default method from Class: M");
//		methodPrivate();
	}
	
	private void methodPrivate(){
		System.out.println ("Private Variable accessing by an Public Method: "+i);
		System.out.println("private method of class: M");	
		
	}

}
