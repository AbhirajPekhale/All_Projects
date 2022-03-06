package q_5_constructor;

class EmpInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

public class ConstEmp {
	public static void main(String[] args) {

		EmpInfo em1=new EmpInfo();
		EmpInfo em2=new EmpInfo();

		em1.display();
		em2.display();
		}

}
