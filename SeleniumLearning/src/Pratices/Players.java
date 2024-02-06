package Pratices;

public class Players implements Comparable <Players>{

	String name;
	
	Players(String name){
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Players Name:-"+name;
	}
	
	
	@Override
	public int compareTo(Players p) {
		return (int)(this.name.compareTo( p.name));
	}

	
	
}
