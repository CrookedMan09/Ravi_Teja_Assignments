package JavaA3;

import java.util.HashMap;

public class Question5 {

	public static void main(String[] args) {
		HashMap<Employee,String> empTable = new HashMap<>();
        empTable.put(new Employee(2),"Ravi");
        empTable.put(new Employee(3),"Teja");
        empTable.put(new Employee(4),"Naveen");
        empTable.put(new Employee(5),"Sai");
        
        for (Employee i : empTable.keySet()){
            System.out.println(empTable.get(i));
	}
  }
}
