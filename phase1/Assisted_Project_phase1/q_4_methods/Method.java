package q_4_methods;

class M
{
	public int method1(int a)
	{
		return a;
	}
	public String method2(String str1)
	{
		return str1;
	}
	public float method3(float fl1)
	{
		return fl1;
	}
	public double method4(double b1)
	{
		return b1;
	}
	public void method5(){
		System.out.println("Returns nothing in method5x");
	}
}

public class Method {

	public static void main(String[] args) {
		M m=new M();
		System.out.println("in method1 " +m.method1(20));
		System.out.println("in method2 "+m.method2("abhi"));
		System.out.println("in method3 "+m.method3(5.56f));
		System.out.println("in method4 "+m.method4(456565d));
		m.method5();
	}
}
