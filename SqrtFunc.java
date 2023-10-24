package day11.homework;

public class SqrtFunc {

	public static void main(String[] args) {
		int randomNum = 1000;
		double sqrtOfRandomNum = sqrtFunction(randomNum);
		System.out.println(sqrtOfRandomNum);

	}

	public static double sqrtFunction(int num) {
		double result = num;
		if (num <= 1) {
			return num;
		}

		for (int i = 0; i < num; i++) {
			result = 0.5 * (result + num / result);
		}

		return result;
	}

	// Time complexity: O(n)
}
