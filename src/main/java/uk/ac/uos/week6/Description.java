package uk.ac.uos.week6;

import java.util.*;  


public class Description implements Describe {
	private Collection<Describe> items;
	
	public Description() {
		this.items = new ArrayList<>();
	    System.out.println(items);;
	}
	


	public void add(Describe d) {
		items.add(d);	
	    System.out.println(items);;
	}
	
	public String describe() {
		return "hhh";
	}
}