package JavaA4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Question8 {

	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>();
	        list.add(24680);
	        list.add(13579);
	        list.add(8642);
	        list.add(97531);
	        
	        Consumer<List<Integer>> iterate = a-> {a.forEach(System.out::println);};
	        Thread t = new Thread(()-> iterate.accept(list));
	        t.start();

	}

}
