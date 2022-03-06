package q_5_constructor;

//parameterized constructor
class Stud{
	int id;
	String name;

	Stud(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class Parameterized {
	public static void main(String[] args) {

		Stud s1=new Stud(93,"abhi");
		Stud s2=new Stud(90,"vedika");
		s1.display();
		s2.display();
			}

}
