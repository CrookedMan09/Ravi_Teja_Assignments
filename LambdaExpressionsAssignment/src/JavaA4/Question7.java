package JavaA4;

import java.util.HashMap;

public class Question7 {

	public static void main(String[] args) {
				
		 HashMap<String,String> map = new HashMap<>();
	        StringBuilder s = new StringBuilder();
	        map.put("Ravi","Teja");
	        map.put("Sourav","ganguly");
	        map.put("Gautam","Gambhir");
	        map.put("Shikar","Dhawan");
	     
	        for(HashMap.Entry<String,String> hme : map.entrySet())
	        {
	            String s1 = hme.getKey();
	            String s2 = hme.getValue();
	            s.append(s1).append(s2);
	        }
	        System.out.println(s);

	}

}
