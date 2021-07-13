package JavaA3;

import java.util.HashMap;
import java.util.Map;

public class Question4 {

	public static void main(String[] args) {
		Dates empdob1=new Dates(24,4,1996);
		Dates empdob2=new Dates(7,11,1997);
		Dates empdob3=new Dates(9,12,1979);
		Dates empdob4=new Dates(24,4,1998);
		Map<Dates,String >  EmpdobMap = new HashMap<>();
		EmpdobMap.putIfAbsent(empdob1,"Kiran");	
		EmpdobMap.putIfAbsent(empdob2,"Kumar");	
		EmpdobMap.putIfAbsent(empdob3,"Ravi");	
		EmpdobMap.putIfAbsent(empdob4,"Teja");	
		System.out.println(EmpdobMap);

	}

	}


