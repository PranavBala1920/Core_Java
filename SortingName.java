import java.util.*;

public class SortingName {
	
	public static void main(String args[]) {
		List < String > listOne = new ArrayList < String > ();
		listOne.add("Mango");
		listOne.add("Apple");
		listOne.add("Banana");
		listOne.add("Grapes");

		Collections.sort(listOne);

		for (String fruit: list1) {
			System.out.println(fruit);
		}

		System.out.println("Sorting numbers...");

		List < Integer > listTwo = new ArrayList < Integer > ();
		listTwo.add(21);
		listTwo.add(11);
		listTwo.add(51);
		listTwo.add(1);

		Collections.sort(listTwo);

		for (Integer number: list2) {
			System.out.println(number);	
		}
	}

}