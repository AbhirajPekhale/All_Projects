package q_3_Acalculator;


import java.util.Scanner;

public class Calculator {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the choice");
System.out.println("+,-,*,/");
char op=sc.next().charAt(0);
 switch(op) {
 
 case '+':
	 System.out.println("enter the values to be calculated");
	 int num1=sc.nextInt();
	 int num2=sc.nextInt();
	 long res=num1+num2;
	 System.out.println("addition of "+num1+"+"+num2+"="+res);
	 break;
 case '-': 
	 System.out.println("enter the values to be calculated");
	 num1=sc.nextInt();
	 num2=sc.nextInt();
	 long res1=num1-num2;
	 System.out.println("substraction of" +num1+"-"+num2+"="+res1);
	 break;
 case '*':
	 System.out.println("enter the values to be calculated");
	 float num3=sc.nextFloat();
	 float num4=sc.nextFloat();
	 float res3=num4*num3;
	 System.out.println("multiplication of"+num4+"*"+num3+"="+res3);
	 break;
 case '/':
	 System.out.println("enter the values to be calculated");
	 float num5=sc.nextFloat();
	 float num6=sc.nextFloat();
	 float res4=num5/num6;
	 System.out.println("division of"+num5+"/"+num6+"="+res4);
	 break;
	 
 
 }


	}

}
