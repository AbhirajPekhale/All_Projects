package acessmodifiresproject;

public class N {
	
	  
	protected long n = 12346; 
	  public int no = 56;
	  double d = 546545;

	public void methodPublic(){     // public method
//		methodPrivate();
		System.out.println("public method from class: N");
		methodPrivate();
		methodDefault();
	}
	
	protected void methodProtected(){ 
		System.out.println("protected method from class: N");// protected method
		
	}
	
	void methodDefault(){    //default method
		System.out.println("default method from Class: N");
//		methodPrivate();
	}
	
	private void methodPrivate(){
//		System.out.println("Class N: n " + ln);
//		System.out.println("Class N: no " + in);
//		System.out.println("Class N: d " + dn);
		System.out.println("private method of class: N");

		
	}
}
