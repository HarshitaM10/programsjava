package weekSecond;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		Map<String,String> newMap = new HashMap<String,String>();
        newMap.put("name", "Harshita");
        newMap.put("college", "Lovely Professional Universtiy");
        newMap.put("degree", "B.Tech CSE");
        newMap.put("gender", "female");
        newMap.put("Company", "EY GDS");

        newMap.put("college", "xyz");
        System.out.println("HashMap has the Contents as followed :");
        for (Map.Entry<String, String> entry : newMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	}
	}
}
