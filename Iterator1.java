package pr1;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection v=new ArrayList();
		v.add("hi");
		v.add("hi");
		v.add("hi");
		v.add("hi");
		System.out.println(v.isEmpty());
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
