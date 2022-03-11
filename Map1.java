package pr1;
import java.util.Map;
import java.util.HashMap;



public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m=new HashMap();
		m.put(1,"hello" );
		m.put(2,"hi" );
		m.put(5,"life" );
		m.put(3,"you" );
System.out.println(m);
System.out.println(m.entrySet());
System.out.println(m.keySet());
System.out.println(m.values());
Map m1=new HashMap();
m1.put(12, "happy");
m1.putAll(m);
System.out.println(m1);
System.out.println(m.putIfAbsent(15, "if"));
System.out.println(m.putIfAbsent(2,"this"));
System.out.println(m1.keySet());
System.out.println(m);


	}

}
