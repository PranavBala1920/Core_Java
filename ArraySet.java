import java.util.*;

public class ArraySet {

	public static void main(String args[]) {
		Set < String > set = new HashSet < String > ();
			set.add("One");
			set.add("Two");
			set.add("Three");
			set.add("Four");
			set.add("Four");

		for (String numbers: set)
			System.out.println(numbers);
	}

}