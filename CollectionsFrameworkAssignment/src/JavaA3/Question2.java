package JavaA3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Question2 {

	public static void main(String[] args) {
		
			HashSet<String> h1=new HashSet<>();
			h1.add("Realme");
			h1.add("Samsung");
			h1.add("Vivo");
			h1.add("Oppo");
			h1.add("One+");
			System.out.println("HashSet Content : " +h1);
			LinkedHashSet<Object> l1=new LinkedHashSet<>();
			l1.add("Realme");
			l1.add("Samsung");
			l1.add("Vivo");
			l1.add("Oppo");
			l1.add("One+");
			System.out.println("LinkedHashSet Content : " +l1);
			      
		}

	}


