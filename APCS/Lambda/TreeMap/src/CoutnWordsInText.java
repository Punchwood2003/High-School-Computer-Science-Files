import java.util.TreeMap;

public class CoutnWordsInText {
	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("Hello", 5);
		System.out.print(map);
		map.put("?", 4);
		System.out.print(map);
		map.put("1", 1);
		System.out.print(map);
		map.put("?", 8);
		System.out.print(map);
		System.out.println()
	}
}
