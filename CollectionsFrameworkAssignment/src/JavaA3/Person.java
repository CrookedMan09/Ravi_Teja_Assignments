package JavaA3;

import java.util.TreeSet;

import JavaA3.Person;

public class Person {
	public static void main(String args[]) {
		TreeSet<Persons> set=new TreeSet<Persons>();
		Persons p1=new Persons(60,174,"Ravi");
		Persons p2=new Persons(60,168,"Teja");
		set.add(p1);
		set.add(p2);
		for(Persons p:set) {
			System.out.println(p.weight+" "+p.height+" "+p.name+"");
		}
	}

}
