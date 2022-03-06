package inheritance;


class product {
	int id=78;
	String name= "amul";
	
  void methoddisplay() {
	System.out.print(id+""+name);
}
}

 class a extends product{
	 int count=50;
	 String category="butter";
	 
	 void display1()
	 {
		
		 System.out.println(+id+" "+name+" "+count+" "+category);
		
	 }
 }
 
 class suba extends a {
	 int price=30;

	void display2()
	 { 
		 long total= count*price;
		 
		 System.out.println("total:" +total);
		 System.out.println("id:" +id  +" name of product: "+ name +" category:"+category);
		 System.out.println();
	 }

 }
 
 class  b extends product{
	 int count=90;
	 String category="milk";
	  
	 void display3()
	 {
		 System.out.println("in class b");
		 System.out.println(""+count+" "+category);
	 }
 }
 
 class subb extends b{
	 
	 int price =10;
	 
	 void display4()
	 {
		 long total= count*price;
		 
		 System.out.println("total:"+total);
		 System.out.println("id:" +id+" name of product:"+name+" catoegory:"+category);
		 System.out.println();
	 } }
 
 class c {
	 int count=56;
	 String category="choco";
	  
	 void display5()
	 {
		 System.out.println("count:"+count+"  category:"+category);
 }
 }
 
 
public class Product1 { 

	public static void main(String[] args) {
		
		suba obj1= new suba();
		 subb obj2=new subb();
		 c obj3= new c();
		 
		
		
		 obj1.display2();
		 obj2.display4();
		 obj3.display5();

	}

}
