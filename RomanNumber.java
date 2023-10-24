package day11.homework;

public class RomanNumber {
	public static void main(String[] args) {
		String romanNum = "LVIII";
		int intConvertedFromRoman = romanToInt(romanNum);
		System.out.println("Converted number from " + romanNum + " is " + intConvertedFromRoman);
	}

	public static int romanToInt(String s) {
		int result = 0;
		int priorValue = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			int convertedValue = romanConversion(s.charAt(i));

			if (priorValue > convertedValue) {
				result -= convertedValue;
			} else {
				result += convertedValue;
			}
			priorValue = convertedValue;
		}
		return result;

	}

	// Time complexity: O(n)

	public static int romanConversion(char x) {
		int value;

		switch (x) {
		case 'I':
			value = 1;
			break;
		case 'V':
			value = 5;
			break;
		case 'X':
			value = 10;
			break;
		case 'L':
			value = 50;
			break;
		case 'C':
			value = 100;
			break;
		case 'D':
			value = 500;
			break;
		case 'M':
			value = 1000;
			break;
		default:
			return -1; // invalid
		}
		return value;
	}

}
