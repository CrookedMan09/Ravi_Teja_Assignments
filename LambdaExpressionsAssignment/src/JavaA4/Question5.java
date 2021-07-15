package JavaA4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Question5 {
	
    public static void main(String[] args) {
		
    	List<String> list = new ArrayList<>();
        list.add("Romania");
        list.add("america");
        list.add("vietnam");
        list.add("india");
        list.add("Taiwan");
        list.add("ethiopia");
        list.add("jamaica");
        list.add("antarctica");
       
        Consumer<List<String>> firstLetter = a -> {
            StringBuilder s = new StringBuilder();

            a.forEach(firs -> s.append(firs.charAt(0)));
            System.out.println(s);
        };
        firstLetter.accept(list);
		

	}

}
