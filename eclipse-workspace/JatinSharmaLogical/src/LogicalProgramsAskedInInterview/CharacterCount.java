package LogicalProgramsAskedInInterview;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
	public static void main(String[] args) {

		String word = "Regression Testing";

		// Convert to lowercase (optional)
		word = word.toLowerCase();

		// Create HashMap
		Map<Character, Integer> map = new HashMap<>();

		// Loop through each character
		for (char ch : word.toCharArray()) {

			// Ignore spaces
			if (ch == ' ')
				continue;

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		// Print result
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " → " + entry.getValue());
		}
	}
}
