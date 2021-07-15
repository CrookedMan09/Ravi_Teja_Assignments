package JavaA4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
 
public class Question6 {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("ravi teja");
		list.add("sourav ganguly");
		list.add("gautam gambhir");
		list.add("shikar dhawan");
				
		 UnaryOperator <String> unary=l-> l.toUpperCase();
		 list.replaceAll(l->unary.apply(l));
		 System.out.println(list);
		 
		

	}

}
