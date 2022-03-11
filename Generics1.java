package pr1;
import java.util.TreeSet;
public class Generics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Float> t=new TreeSet();
		//t.add(5);
		//t.add(87)
		//t.add(43);
		//t.add(56);
		t.add(1345.4f);
		t.add(78);
		//t.add("hi");
		System.out.println(t.headSet(43));
		System.out.println(t);



}
