
public class Bufferstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer s= new StringBuffer("started java");

s.append(" phase1");
System.out.println(s);

s.delete(2, 5);
System.out.println(s);

s.replace(5, 9," paython");
System.out.println(s);

s.insert(5,"language");
System.out.println(s);

s.reverse();
System.out.println(s);

s.charAt(9);
System.out.println("s");
	}

}
