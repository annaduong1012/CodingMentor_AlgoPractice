package day11.homework;

public class LongestSameString {

	public static void main(String[] args) {
		String[] randomArray = { "flower", "flow", "flight" };
		String samePrefix = getCommonPrefix(randomArray);
		System.out.println("The common prefix in this array is " + samePrefix);

	}

	public static String getCommonPrefix(String[] strs) {
		String firstString = strs[0];
		String commonPrefix = "";

		for (int i = 0; i < firstString.length(); i++) {

			char currentChar = firstString.charAt(i);

			for (int j = 1; j < strs.length; j++) {
				if (currentChar != strs[j].charAt(i)) {
					return commonPrefix;
				}
			}

			commonPrefix += currentChar;
		}

		return commonPrefix;
	}

	// Time complexity: O(n2)

}
