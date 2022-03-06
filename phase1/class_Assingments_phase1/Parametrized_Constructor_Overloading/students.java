package functionoverloading;


public class students {
	String studentname;
	int age;
	char gender;
	char section;
	int total, avg ,sub1, sub2, sub3;
	
	public students(String n, int a, char A, char g, int s1, int s2, int s3) {
		studentname=n;
		age=a;
		section=A;
		gender=g;
		sub1=s1;
		sub2=s2;
		sub3=s3;
		total=s1+s2+s3;
		avg=total/3;
	}
	public students(String n, int a, char A, char g, int s2, int s3) {
		studentname=n;
		age=a;
		section=A;
		gender=g;
		sub2=s2;
		sub3=s3;
		total=sub2+sub3;
		avg=total/2;
	}
	void display(){
		
		System.out.println(studentname+" "+age+" "+section+" "+gender+" "+sub1+" "+sub2+" "+sub3+" "+total+" "+avg+"%");
	}
	

public static void main(String[] args)
{
	students s1=new students("abhi",20,'A','M',60,20,90);
	students s2=new students("aditi",21,'B','F',20,90,78);
	students s3=new students("rohit",19,'C','M',55,60);
	students s4=new students("vedika",21,'D','F',91,82);
//calling methods by object
	s1.display();  
    s2.display(); 
    s3.display();  
    s4.display();
    
}
}