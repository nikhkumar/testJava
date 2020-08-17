
package testJava;

import java.util.HashMap;

public class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		String text = "10f";

		Character c1 = new Character('F');
		Character c2 = new Character('f');
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < text.length(); i++) {

			System.out.println("Char " + i + " is " + text.charAt(i));

			if (c1.equals(text.charAt(i)) || c2.equals(text.charAt(i))) {
				sb.append("K" + text.charAt(i));

			} else
				sb.append(text.charAt(i));
		}

		System.out.println(sb.toString());

		HashMap<Person, String> mapp = new HashMap<Person, String>();
		Person p1 = new Person("nik");
		Person p2 = new Person("nik");

		mapp.put(p1, "person11");
		System.out.println(mapp.get(p2));

//		A a = new A();
//		a.sayHello();
//
//		System.out.println("Hello Java");
//		
//		int number=29;
//		
//		int sum = 0;
//		while (number > 0) {
//		    System.out.println( number % 10);
//		    int i  = number %10;
//		    
//		    sum+=i;
//		    number = number / 10;
//		    
//		   
//		}
//        
//		 System.out.println(sum);        
//	}
	}
}
