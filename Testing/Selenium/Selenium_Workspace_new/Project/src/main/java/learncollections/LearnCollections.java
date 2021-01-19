package learncollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LearnCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1= new ArrayList<String>();
		
		list1.add("Prameela");
		list1.add("Dinesh");
		list1.add("Ganesh");
		list1.add("Basha");
		list1.add("Selenium");
		list1.add("Ganesh");
		
		System.out.println(list1);
		
		List<String> list2= new LinkedList<String>();
		
		list2.add("Prameela");
		list2.add("Dinesh");
		list2.add("Ganesh");
		list2.add("Basha");
		list2.add("Selenium");
		list2.add("Ganesh");
		
		System.out.println(list2);
		
		
		Set<String> set1= new HashSet<String>();
		
		set1.add("Prameela");
		set1.add("Dinesh");
		set1.add("Ganesh");
		set1.add("Basha");
		set1.add("Selenium");
		set1.add("Ganesh");
		
		System.out.println(set1);
		
		Set<String> set2= new TreeSet<String>();
		
		set2.add("Prameela");
		set2.add("Dinesh");
		set2.add("Ganesh");
		set2.add("Basha");
		set2.add("Selenium");
		set2.add("Ganesh");
		
		System.out.println(set2);	
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Blue", "Ganesh");
		map.put("Red", "Prameela");
		map.put("Yellow", "Dinesh");
		map.put("White", "Basha");
		map.put("Green", "Dinesh");
		map.put("Blue", "Prameela");

		System.out.println(map);
		
	Map<String, String> map1 = new TreeMap<String, String>();
		
		map1.put("Blue", "Ganesh");
		map1.put("Red", "Prameela");
		map1.put("Yellow", "Dinesh");
		map1.put("White", "Basha");
		map1.put("Green", "Dinesh");
		map1.put("Blue", "Prameela");

		System.out.println(map1);
		
		
	}

}
