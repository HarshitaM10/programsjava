package weekSecond;

import java.util.HashSet;
import java.util.Iterator;

public class SetProgram {

	public static void main(String[] args) {
		 HashSet<String> stringSet = new HashSet<String>();
		    stringSet.add("India");
	        stringSet.add("Vancouver");
	        stringSet.add("Cape Town");
	        stringSet.add("Dallas");
	        stringSet.add("Alaska");
	        stringSet.add("boston");
	        stringSet.add("Denmark");
	        stringSet.add("Munich");
	        stringSet.add("Japan");
	        stringSet.add("Norway");
	        stringSet.add("Vancouver");

	        Iterator<String> iterator = stringSet.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	}
}
}
