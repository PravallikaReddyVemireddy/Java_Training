package pr1;

import java.util.TreeSet;
public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet();
		t.add(5);
		t.add(87);
		t.add(43);
		t.add(56);
		t.add(1345);
		t.add(78);
		System.out.println(t.headSet(43));
		System.out.println(t);
		System.out.println(t.tailSet(43));
		System.out.println(t.subSet(56,87));
		System.out.println(t.size());
		System.out.println(t.first());
		System.out.println(t.last());
		System.out.println(t.higher(56));
		System.out.println(t.lower(87));
		
	}

}
