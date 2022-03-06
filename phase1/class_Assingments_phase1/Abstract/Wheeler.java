package assingment2;
abstract class Vehicletype{
	
	int speed = 3;
	long distance = 300;
	
	abstract void run();
	abstract void stop();
	public void fuel(int a) {}
	public void fuel(float b, String s) {}
	public void fuel(char ch, int c) {}
	Vehicletype(){}
	Vehicletype(int s, long d){}
    public void display(int a, long s) {
    	System.out.println(speed + distance);
    }
}  

    class Twowheel extends Vehicletype{
    	int speed2, nos_of_tyre = 2;
    	long distance2;
    	Twowheel(){}
    	@Override
    	void run() {
    		System.out.println(" run  Twowheelr");
    	}
    	@Override
    	void stop() {
    		System.out.println(" stop  Twowheeler");
    	}
    	
    	public void display(int speed2, long distance2) {
    		this.speed2 = speed2;
    		this.distance2 = distance2;
    		System.out.println(speed2+" m/s, no.of tyre: "+nos_of_tyre+", "+distance2+" km, "+super.speed+" m/s, "+super.distance+" km");
    	}	
    }
    class Threewheel extends Twowheel{
    	int speed3 = 20;
    	int nos_of_tyre = 3;
    	long distance3 = 400;
    	Threewheel(){}
    	@Override
    	void run() {
    		System.out.println("\ninside the run method Threewheel");
    	}
    	@Override
    	void stop() {
    		System.out.println("inside the stop method Threewheel");
    	}
        public void display(int speed3, long distance3) {
        	this.speed3 = speed3;
    		this.distance3 = distance3;
    		System.out.println(speed3+" m/s, no.of tyre: "+nos_of_tyre+", "+distance3+" km, "+super.speed+" m/s, "+super.distance+" km");
    	}    	
    }
    
    class Fourwheel extends Threewheel{
    	int speed4 = 8;
    	int nos_of_tyre = 36;
    	long distance4 = 500;
    	Fourwheel(){
    	}
    	@Override
    	void run() {
    		System.out.println("\ninside the run method Fourwheel");
    	}
    	@Override
    	void stop() {
    		System.out.println("inside the stop method Fourwheel");
    	}
    	public void display(int speed4, long distance4) {
    		this.speed4 = speed4;
    		this.distance4 = distance4;
    		System.out.println(speed4+" m/s, no.of tyre: "+nos_of_tyre+", "+distance4+" km, "+super.speed+" m/s, "+super.distance+" km");
    	}
    }
    
    class Eightwheel extends Fourwheel{
    	int speed5 = 10, nos_of_tyre = 8;
    	long distance5 = 500;
    	Eightwheel(){
    	}
    	@Override
    	void run() {
    		System.out.println("\ninside the run method Eightwheel");
    	}
    	@Override
    	void stop() {
    		System.out.println("inside the stop method Eightwheel");
    	}
    	public void display(int speed5, long distance5) {
    		this.speed5 = speed5;
    		this.distance5 = distance5;
    		System.out.println(speed5+" m/s, no.of tyre: "+nos_of_tyre+", "+distance5+" km, "+super.speed+" m/s, "+super.distance+" km");
    	}
    }

public class Wheeler {

	public static void main(String[] args) {
		
		Vehicletype obj1 = new Twowheel();
		obj1.run();
		obj1.stop();
	    obj1.display(30, 600);
	    
	    
	    Vehicletype obj3 = new Threewheel();
		obj3.run();
		obj3.stop();
	    obj3.display(25, 700);
	    
	    
	    Vehicletype obj4 = new Fourwheel();
		obj4.run();
		obj4.stop();
	    obj4.display(20, 800);
	    
	    
	    Vehicletype obj8 = new Eightwheel();
		obj8.run();
		obj8.stop();
	    obj8.display(62, 900);
	}
}
