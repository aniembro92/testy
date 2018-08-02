package com.personal.testycols;

import com.personal.testycols.myobjects.Hero;

public class TestyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Holi, " + ( args.length > 0 ? args[0] : "no args"));
		
		Hero stimed = new Hero("StimedHydra", "Night Elf", 5, "Shadow");
		
		System.out.println(stimed.getName()+" Rulz, cuz hes lvl "+ stimed.getLevel());
	}

}
