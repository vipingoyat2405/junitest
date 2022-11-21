package junitestpackage;

public class junitestfunctions {
	public static int addnumber(int a,int b) {
		int c = a+b;
		return c;
	}
	public static String addstring(String a,String b) {
		String c = a+b;
		return c;
	}
	public static void main(String[] args) {
		System.out.println(addstring("Vipin"," Goyat"));
		System.out.print(addnumber(3,5));
	}	
}
