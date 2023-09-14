package weekSecond;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrListIteration {

	public static void main(String[] args) {
		 ArrayList<String> stringList = new ArrayList<String>();
	        stringList.add("India");
	        stringList.add("Vancouver");
	        stringList.add("Cape Town");
	        stringList.add("Dallas");
	        stringList.add("Alaska");
	        stringList.add("Boston");
	        stringList.add("Denmark");
	        stringList.add("Munich");
	        stringList.add("Japan");
	        stringList.add("Norway");

	        Iterator<String> iterator = stringList.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	}
	}
}
