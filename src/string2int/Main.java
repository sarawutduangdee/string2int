package string2int;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter input string:");
		String str = input.nextLine();
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			newStr = newStr + checkString(str.charAt(i));
		}
		int sumInt = 0;
		if (newStr.equals(""))
			System.out.println("Output integer: Not found integer");
		else {
			int n = newStr.length();
			int pos = 1;
			for (int i = 0; i < n; i++) {
				sumInt += checkInteger(newStr.charAt(n - pos), pos);
				pos += 1;
			}
			System.out.println("Output integer: " + sumInt);
		}
	}

	public static String checkString(char ch) {
		switch (ch) {
		case '0':
			return "0";
		case '1':
			return "1";
		case '2':
			return "2";
		case '3':
			return "3";
		case '4':
			return "4";
		case '5':
			return "5";
		case '6':
			return "6";
		case '7':
			return "7";
		case '8':
			return "8";
		case '9':
			return "9";
		}
		return "";
	}

	public static int checkInteger(char ch, int pos) {
		int sum = 0;
		int num = strToInt(ch);
		int base = 1;
		if (pos > 1) {
			for (int i = 0; i < pos - 1; i++) {
				base *= 10;
			}
		}
		sum = num * base;
		return sum;
	}

	public static int strToInt(char ch) {
		switch (ch) {
		case '1':
			return 1;
		case '2':
			return 2;
		case '3':
			return 3;
		case '4':
			return 4;
		case '5':
			return 5;
		case '6':
			return 6;
		case '7':
			return 7;
		case '8':
			return 8;
		case '9':
			return 9;
		}
		return 0;
	}
}
