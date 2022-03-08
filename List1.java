package pr1;
import java.util.*;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List b=new ArrayList();
		b.add("hi");
		b.add("GM");
		b.add("CR");
		b.add("Lahari");
		b.add("hello");
		System.out.println(b);
		b.add(7);
		System.out.println(b);
		b.get(2);
		System.out.println(b.contains("GM"));
		System.out.println(b.get(2));
		System.out.println(b.size());
		b.remove("GM");
		System.out.println(b.contains("GM"));
		System.out.println(b);
		b.clear();
		System.out.println(b);
		
		
		

	}

}
