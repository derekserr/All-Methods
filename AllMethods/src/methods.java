import java.util.Scanner;

public class methods {
	
	public static long toMilesPerHour(double kilometresPerHour) {
		if (kilometresPerHour < 0) {
			return -1;
		}
		return (Math.round(kilometresPerHour / 1.609));
	}

	public static void printConversion(double kilometresPerHour) {
		if (kilometresPerHour < 0) {
			System.out.println("Invalid Value");
		} else {
			System.out.println(kilometresPerHour + " km/h = " + (Math.round(kilometresPerHour / 1.602)) + " mi/h");
		}
	}

	public static void printMegaBytesAndKiloBytes(int kilobytes) {
		if (kilobytes < 0) {
			System.out.println("Invalid Value");
		} else {
			System.out.println(kilobytes + " KB = " + (Math.round((kilobytes / 1024))) + " MB and "
					+ (Math.round(kilobytes % 1024) + " KB"));
		}
	}

	public static boolean isLeapYear(int year) {
		if (year >= 1 && year < 10000) {
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						return true;
					}
				} else {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean isLeapYear2(int year) {
		if (year > 0 && year < 10000) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0 && year % 4 == 0)) {
				return true;
			}
		}
		return false;
	}

	public static boolean hasEqualSum(int firstNum, int secondNum, int thirdNum) {
		if (firstNum + secondNum == thirdNum) {
			return true;
		}
		return false;
	}

	public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
		String firstString = Double.toString(firstNum);
		String secondString = Double.toString(secondNum);
		int count = 0;
		for (int i = 0; i < 3; i++) {

			if (firstString.charAt(i) == secondString.charAt(i)) {
				count++;

			} else {
				return false;
			}
		}
		if (count == 3) {
			return true;
		}
		return false;
	}

	public static boolean hasTeen(int firstNum, int secondNum, int thirdNum) {
		if ((firstNum - 10) > 2 && (firstNum - 10) < 10 || (secondNum - 10) > 2 && (secondNum - 10) < 10
				|| (thirdNum - 10) > 2 && (thirdNum - 10) < 10) {
			return true;
		}
		return false;
	}

	public static double calcFeetAndInchesToCentimetres(double feet, double inches) {
		if (feet > -1 && (inches > -1 && inches < 13)) {
			return ((feet * 12) + inches) * 2.54;// calculating centimeters

		}
		return -1;
	}

	public static double calcFeetAndInchesToCentimetres(double inches) {
		if (inches > -1) {
			int feet = (int) (inches / 12);
			inches = inches % 12;
			return (calcFeetAndInchesToCentimetres(feet, inches));
		}
		return -1;
	}

	public static String getDurationString(int minutes, int seconds) {
		if (minutes > -1 && seconds > -1 && seconds < 60) {
			return (Integer.toString(minutes / 60) + "h " + Integer.toString(minutes % 60) + "m "
					+ Integer.toString(seconds) + "s");
		}
		return "Invalid Value";
	}

	public static double area(double radius) {
		if (radius > -1) {
			return (Math.PI * Math.pow(radius, 2));
		}
		return -1;
	}

	public static double area(double x, double y) {
		if (x > -1 || y > -1) {
			return (x * y);
		}
		return -1;

	}

	public static void printEqual(int numOne, int numTwo, int numThree) {
		if (numOne == numTwo && numTwo == numThree) {
			System.out.println("All numbers are equal");
		} else if (numOne == numTwo || numTwo == numThree || numThree == numOne) {
			System.out.println("Neither all are equal or different");
		}
		System.out.println("All numbers are different");
	}

	public static boolean isPalindrome(int number) {
		number = Math.abs(number);
		String reverseNum = "", numString = Integer.toString(number);
		int divisionFactor = 1;
		for (int i = 0; i < numString.length(); i++) {
			reverseNum = reverseNum + Integer.toString((number / divisionFactor) % 10);
			divisionFactor = divisionFactor * 10;
		}
		if (numString.contentEquals(reverseNum)) {
			return true;
		}
		return false;

	}

	public static int sumFirstAndLastDigit(int number) {
		if (number > -1) {
			String numString = Integer.toString(number);
			int firstDig = (numString.charAt(0)) - '0', lastDig = (numString.charAt(numString.length() - 1)) - '0';
			return (firstDig + lastDig);
		}
		return -1;

	}

	public static int getEvenDigitSum(int number) {
		String numString = Integer.toString(number);
		if (number > -1) {
			int sum = 0;
			for (int i = 0; i < numString.length(); i++) {

				if ((numString.charAt(i) - '0') % 2 == 0) {
					sum = sum + numString.charAt(i) - '0';
				}
			}
			return sum;
		}
		return -1;

	}

	public static boolean hasSharedDigit(int firstNum, int secondNum) {
		String firstString = Integer.toString(firstNum), secondString = Integer.toString(secondNum);
		if (firstNum > 9 && firstNum < 100 && secondNum > 9 && secondNum < 100) {
			for (int i = 0; i < 2; i++) {
				if (firstString.charAt(0) == secondString.charAt(i)
						|| firstString.charAt(1) == secondString.charAt(i)) {
					return true;
				}
			}

		}
		return false;
	}

	public static boolean hasSameLastDigit(int firstNum, int secondNum, int thirdNum) {
		if (firstNum > 9 && firstNum < 1001 && secondNum > 9 && secondNum < 1001 && thirdNum > 9 && thirdNum < 1001) {
			int lastDig1 = firstNum % 10, lastDig2 = secondNum % 10, lastDig3 = thirdNum % 10;
			if (lastDig1 == lastDig2 || lastDig2 == lastDig3 || lastDig3 == lastDig1) {
				return true;
			}
		}
		return false;
	}

	public static boolean isValid(int firstNum) {
		if (firstNum > 9 && firstNum < 1001) {
			return true;
		}
		return false;
	}

	public static int getGreatestCommonDivisor(int firstNum, int secondNum) {

		if (firstNum > 9 && secondNum > 9) {
			int smaller = 0, factor = 0, larger = 0;
			if (firstNum > secondNum) {
				smaller = secondNum;
				larger = firstNum;
			} else if (secondNum > firstNum) {
				smaller = firstNum;
				larger = secondNum;
			}
			for (int i = 1; i <= smaller; i++) {
				if (smaller % i == 0 && larger % i == 0) {
					factor = i;
				}
			}
			return factor;
		}
		return -1;
	}

	public static void printFactors(int number) {
		if (number > 0) {
			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					System.out.println(i);
				}
			}

		} else {
			System.out.println("Invalid Value");
		}
	}

	public static boolean isPerfectNumber(int number) {
		int sum = 0;
		if (number > 0) {
			for (int i = 1; i < number; i++) {
				if (number % i == 0) {
					sum = sum + i;
				}
			}
			if (sum == number) {
				return true;
			}

		}
		return false;
	}

	public static void numbersToWords(int number) {
		if (number > -1) {
			int digitCount = getDigitCount(number);
			number = (reverse(number));

			for (int i = 0; i < digitCount; i++) {
				int lastDigit = number % 10;
				switch (lastDigit) {

				case 0:
					System.out.println("Zero");
					break;
				case 1:
					System.out.println("One");
					break;
				case 2:
					System.out.println("Two");
					break;
				case 3:
					System.out.println("Three");
					break;
				case 4:
					System.out.println("Four");
					break;
				case 5:
					System.out.println("Five");
					break;
				case 6:
					System.out.println("Six");
					break;
				case 7:
					System.out.println("Seven");
					break;
				case 8:
					System.out.println("Eight");
					break;
				case 9:
					System.out.println("Nine");
					break;
				}
				number = number / 10;
			}
		}

		else {
			System.out.println("Invalid Value");
		}
	}

	public static int reverse(int number) {
		int reverseNum = 0;
		while (number != 0) {
			reverseNum = reverseNum * 10;
			reverseNum = reverseNum + (number % 10);
			number = number / 10;
		}
		return reverseNum;
	}

	public static int getDigitCount(int number) {
		if (number > -1) {
			return (Integer.toString(number).length());
		}
		return -1;
	}

	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if (bigCount > -1 && smallCount > -1 && goal > -1) {
			while (bigCount > 0) {
				goal = goal - 5;
				if (goal <= 0) {
					if (goal % 5 == 0) {
						return true;
					}
					goal = goal + 5;
					break;
				}
				bigCount--;
			}
			while (smallCount > 0) {
				goal = goal - 1;
				if (goal <= 0) {
					return true;
				}
				smallCount--;
			}
			return false;
		}
		return false;
	}

	public static boolean isPrimeNumber(int number) {
		if (number > 0)
			for (int i = 2; i < number; i++) {
				if (number % i == 0)
					return false;

			}
		return true;

	}

	public static int getLargestPrime(int number) {
		int factor = 0;
		if (number > 2) {
			for (int i = 2; i < number; i++) {
				int modulo = number % i;
				if (modulo == 0) // is this is a factor
					if (isPrimeNumber(i))
						factor = i;
			}
			return factor;
		}
		return -1;
	}

	public static int getLargestPrime2(int number) {
		int factor = 0;
		if (number > 1) {
			for (int i = 2; i <= number + 1; i++) {
				boolean check = true;
				int modulo = number % i;
				if (modulo == 0) {// is this is a factor
					for (int j = 2; j < i; j++) {
						if (i % j == 0) {
							check = false;
						}
					}
					if (check) {
						factor = i;
					}
				}
			}
			return factor;
		}
		return -1;
	}
	public static void printSquareStar(int number) {
		if (number > 4) {
			for (int i = 0; i < number; i++) {
				if (i == 0 || i == number - 1) {
					System.out.println(new String(new char[number]).replace("\0", "*"));
					continue;
				}
				for (int j = 0; j < number; j++) {
					if (i == j || j == number - i - 1 || j == 0) {
						System.out.print("*");
					} else if (j == number - 1) {
						System.out.println("*");
					} else {
						System.out.print(" ");
					}
				}  
			}
		} else
			System.out.println("Invalid Value");
	}
	
	public static void sum() {
		Scanner scanner = new Scanner(System.in);
		int count = -1;
		System.out.println("Enter count:");
		while (count < 0) {
			count = scanner.nextInt();
			if (count < 0) {
				System.out.println("Invalid Entry, try again");
			}
		}
		int sum = 0;
		System.out.println("Enter the numbers you want to be added together:");
		while (count > 0) {
			int userNum = scanner.nextInt();
			sum = sum + userNum;
			count--;
		}
		scanner.close();
		System.out.println("The total sum of the numbers you entered is " + sum);
	}
	public static void main(String[]args) {
		
	}

}
