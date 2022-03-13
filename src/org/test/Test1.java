package org.test;

public class Test1 {
	private String get(String name) {
		
		String s = name; String s1="";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c>='a'||c<='z'|| c>='A'||c<='z'|| c>='0'||c<='2') {
				
			} else {
				s.replace(c, ' ');


			}
			
		}
		return s;

	}
	public static void main(String[] args) {
		Test1 test1 = new  Test1();
		 String string = test1.get("naveenA@12345");
		System.out.println(string);
	}

}
