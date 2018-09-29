package test;

public class test1 {

	 public void foo(String s) {
	 System.out.println("String");
	 }

	 public void foo(StringBuffer sb){
	 System.out.println("StringBuffer");
	 }

	 public static void main(String[] args) {
		 String s1 = "abc";
		 String s2 = new String("abc");
		// s2.intern();
		 System.out.println(s1 ==s2);
		 System.out.println(s1);
		 System.out.println("s2 - > "+s2);
		 System.out.println("equals "+s1.equals(s2));
		
	}

}