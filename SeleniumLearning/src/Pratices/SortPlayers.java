package Pratices;

import java.util.TreeSet;

public class SortPlayers {

	public static void main(String[] args) {
		Players p1=new Players("Karan");
		Players p2=new Players("Santosh");
		Players p3=new Players("Somya");
		Players p4=new Players("Badal");
		Players p5=new Players("Sagar");
		Players p6=new Players("Chiku");
		Players p7=new Players("Rahul");
		Players p8=new Players("Kiran");
		Players p9=new Players("Sambit");
		Players p10=new Players("Sonu");
		Players p11=new Players("Yadab");
		
		TreeSet<Players> t=new TreeSet();
		t.add(p1);
		t.add(p2);
		t.add(p3);
		t.add(p4);
		t.add(p5);
		t.add(p6);
		t.add(p7);
		t.add(p8);
		t.add(p9);
		t.add(p10);
		t.add(p11);
		
		for(Object x:t) {
			System.out.println(x);
		}
		
		
	}
}
