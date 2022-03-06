package acessmodifiresproject1;

import acessmodifiresproject.M;
import acessmodifiresproject.N;
import acessmodifiresproject.P;


// for class: M

class T extends M{
	public void test(){
		T ob = new T();
        ob.methodPublic();
        ob.methodProtected();
        
	}
}

// for class: P
class A extends P{
	public void test1() {
		A a = new A();
		a.methodPublic();
		a.methodProtected();
	}
}

public class Z extends N{
	
	public static void main(String[] args) {
		
		
//		for class N
		 Z ob1 = new Z();
		 System.out.println("\n");
		 ob1.methodPublic();
         ob1.methodProtected();
         
         
//         for class M
         T ob3 = new T();
         System.out.println("\n");
         ob3.test();
         
//         for class P
         A ob4 = new A();
         System.out.println("\n");
         ob4.test1();
         
         
        
//        All the variables from class: X
        X ob5 = new X();
        System.out.println("\nVariables from Class: X\n" + ob5.k);
        System.out.println(ob5.m);
        System.out.println(ob5.ch);
        ob5.methodPublic();
  
        
	}

}
