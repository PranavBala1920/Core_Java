import java.util.*;

public class ArrayMap {

	public static void main(String args[]) {
		
		Map<Integer, String> map = new HashMap<Integer, String> ();
		map.put(100, "Java");
		map.put(101, "Android");
		map.put(102, "Js");
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
	
}