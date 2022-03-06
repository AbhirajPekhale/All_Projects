package functionoverloading;

public class  Funoverloading {
  //calculate add two numbers
	 int calculate1(int add1 ,int add2,int add3){
	    int result= add1+add2;	
	    System.out.println("output addition :" +result);
	return 0;
	}
	 // calculate area of circle
	int calculate1(float r){
	  float  result= (float) ((3.14)*r*r);
	  System.out.println("output area of circle:" +result);
	return 0;
	}
	//calculate area of rectangle
	int calculate1(long side1,long side2){
		long result= side1*side2;
		System.out.println("output area of rectangle:" +result);
	return 0;
	}
	public static void main(String[] args) {
	
	//creating object	
	Funoverloading s =new Funoverloading ();
    
	//calling functions
     s.calculate1(1,2,0);
     s.calculate1(5);
     s.calculate1(20,30);
	}
}
