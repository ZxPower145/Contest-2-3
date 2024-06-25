import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Contest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // cirlceArea(scanner);
        // factorial(scanner);
        // maxOfThree(scanner);
        // checkPrime(scanner);
        // fibonnaci(scanner);
        // checkPalindrome(scanner);
        // findLongestWord(scanner);
        // areAnagram(scanner);
        // checkAverage(scanner);
        // reverseString(scanner);
        // checkIfEven(scanner);
        // findBiggestNumber(scanner);
        // isDivisibleBy(scanner);
        // checkIfSquare(scanner);
        // sumOfDigits(scanner);
        // checkIfNumberIsPalindrome(scanner);
        // System.out.println(randomPass(null));
        // mostCommonWord(scanner);
        // calculateDistance(scanner);
        // mostCommonLetter(scanner);
        // sumOfFirstNNaturalNumbers(scanner);
        // sumOfNumbersDigitsUntilOne(scanner);
        // sumOfSquaresForNNumbers(scanner);
        // System.out.println(keplarNumbers(9));
        // System.out.println(harshhadNumbers(9));
        scanner.close();
    }

    public static void cirlceArea(Scanner args) {
        System.out.println("Please type in the radius of the circle: ");
        double radius = args.nextDouble();
        double area = Math.PI * (Math.pow(radius, 2));
        System.out.println("The circle area is: " + area);
    }

    public static void factorial(Scanner args) {
        System.out.println("Please type in the number you would like to find the factorial of: ");
        int number = args.nextInt();
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        }
    }

    public static void maxOfThree(Scanner args) {
        System.out.println("Find the max of 3 numbers.");
        System.out.println("Type in the first number: ");
        double first = args.nextDouble();
        System.out.println("Type in the second number: ");
        double second = args.nextDouble();
        System.out.println("Type in the third number: ");
        double third = args.nextDouble();
        double max = Math.max(first, Math.max(second, third));
        System.out.println("The max is: " + max);
    }

    static boolean isPrime (int n) {
        // Used in checkPrime()
        if (n <= 1) {return false;}
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {return false;}
        }
        return true;
    }

    public static void checkPrime(Scanner args) {
        System.out.println("Please type in a number to check if it's prime or not");
        int number = args.nextInt();
        if (isPrime(number)) {
            System.out.println("Your number is prime");
        } else {System.out.println("Your number is not prime");}
    }

    public static void fibonnaci(Scanner args) {
        System.out.println("How many Fibonnaci numbers do you need?");
        int n1=0,n2=1;
        int n3,i,count= args.nextInt();
        System.out.print(n1+" "+n2);

        for(i=2;i<count;++i) {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }

    public static void checkPalindrome(Scanner args) {
        String rev = "";
        System.out.println("Please type in a word to check if it's a palindrome");
        String str = args.nextLine();
        str = str.toLowerCase();

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println(str + " " + "is a palindrome");
        } else {System.out.println(str + " " + "is not a palindrome");}
    }

    public static void findLongestWord(Scanner args) {
        System.out.println("Type in a sentence to find the longest word:");
        String sentence = args.nextLine();

        String longest = Arrays.stream(sentence.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        System.out.println("The longest word is: " + longest);
    }

    public static void areAnagram(Scanner args) {
        System.out.println("Type in the first word:");
        String first = args.nextLine();
        System.out.println("Type in the second word:");
        String second = args.nextLine();

        char[] str1 = first.toCharArray();
        char[] str2 = second.toCharArray();

        int n1 = first.length();
        int n2 = second.length();

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++) {
            if ((str1[i] != str2[i]) || (n1 != n2) ) {
                System.out.println("The words are not anagrams of each other!");
            } else {
                System.out.println("The words are anagram of each other!");
            }
        }
    }

    public static void sumOfTwo(Scanner args) {
        System.out.println("Type in the first number:");
        double first = args.nextDouble();
        System.out.println("Type in the second number:");
        double second = args.nextDouble();
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    public static void checkAverage(Scanner args) {
        System.out.println("Type in the numbers you want to find the average of, like this: a, b, c, d");
        String rawNumbers = args.nextLine();
        int[] numbersArray = {};
        String[] charArray = rawNumbers.split(", ");
        int sum = 0, avg = 0;
        for (String num : charArray) {
            int x = Integer.parseInt(num);
            numbersArray = Arrays.copyOf(numbersArray, numbersArray.length +1);
            numbersArray[numbersArray.length - 1] = x;
        }
        for (int number : numbersArray) {
            sum = sum + number;
        }
        avg = sum / numbersArray.length;
        System.out.println("The average is: " + avg);
    }

    public static void reverseString(Scanner args) {
        System.out.println("Type in the string to reverse: ");
        String string = args.nextLine(), reversedString = "";
        char ch;

        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            reversedString = ch + reversedString;
        }

        System.out.println(string + " reversed is: " + reversedString);
    }

    public static void checkIfEven(Scanner args) {
        System.out.println("Type in a number to check if it's even or odd:");
        int number = args.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else { System.out.println(number + " is odd"); }
    }

    public static void findBiggestNumber(Scanner args) {
        System.out.println("Type in the numbers you want to find the max of, with the format: a, b, c, d");
        String rawNumbers = args.nextLine();
        ArrayList <Integer> numbersArray = new ArrayList<Integer>();

        String[] charArray = rawNumbers.split(", ");

        for (String num : charArray) {
            int x = Integer.parseInt(num);
            numbersArray.add(x);
        }

        int maximum = Collections.max(numbersArray);

        System.out.println("The biggest number is: " + maximum);
    }

    public static void isDivisibleBy(Scanner args) {
        System.out.println("Type in the first number");
        int first = args.nextInt();
        System.out.println("Type in the second number");
        int second = args.nextInt();

        if (first % second == 0) {
            System.out.println(first + " is divisible by " + second);
        } else { System.out.println(first + " is not divisible by " + second); }
    }

    public static void checkIfSquare(Scanner args) {
        System.out.println("Type in a number to check if it's a perfect square");
        int input = args.nextInt();
        int x = (int) Math.sqrt(input);
        if (Math.pow(x, 2) == input) {
            System.out.println("The number is a perfect square");
        } else {
            System.out.println("The number is not a perfect square");
        }
    }

    public static void sumOfDigits(Scanner args) {
        int digit, sum = 0;
        System.out.println("Type in a number");
        int input = args.nextInt();

        while (input > 0) {
            digit = input % 10;
            sum = sum + digit;
            input = input / 10;
        }
        System.out.println("The sum of is " + sum);
    }

    public static void checkIfNumberIsPalindrome(Scanner args) {
        int r = 0;
        int sum = 0;
        int temp;

        System.out.println("Type in a number");

        int n = args.nextInt();

        temp = n;

        while(n > 0){
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }

        if(temp == sum) {
            System.out.println("palindrome number ");
        } else {
            System.out.println("not palindrome");
        }
    }

    public static String randomPass(String[] args) {
        Random random = new Random();
        String password = "";

        while (password.length() <= 8) {
            char c = (char)(random.nextInt(26) + 'a');
            password = password + random.nextInt(9);
            password = password + c;
        }

        return password;
    }

    public static void mostCommonWord(Scanner args) {
        System.out.println("Enter a phrase in order to find the most common word:");
        String rawPhrase = args.nextLine();
        String common = "";
        int frequency = 0;
        String[] phraseArray = rawPhrase.split(" ");
        for (int i = 0; i < phraseArray.length; i++) {
            int count = 0;
            for (int j = i + 1; j < phraseArray.length; j++) {
                if (phraseArray[j].equals(phraseArray[i])) {
                    count++;
                }
            }
            if (count >= frequency) {
                common = phraseArray[i];
                frequency = count;
            }
        }
        System.out.println("The most common word is: " + common + " and it appears " + (frequency + 1) + " times");
    }

    public static void calculateDistance(Scanner args) {
        System.out.println("Enter x1 && y1 like: x1 y1");
        String x1y1 = args.nextLine();
        System.out.println("Enter x2 && y2 like: x2 y2");
        String x2y2 = args.nextLine();

        String[] first = x1y1.split(" ");
        String[] second = x2y2.split(" ");

        ArrayList <Integer> firstPoint = new ArrayList<Integer>();
        ArrayList <Integer> secondPoint = new ArrayList<Integer>();

        for (String word : first) {
            int x = Integer.parseInt(word);
            firstPoint.add(x);
        }
        for (String word : second) {
            int x = Integer.parseInt(word);
            secondPoint.add(x);
        }

        int x1 = firstPoint.get(0);
        int x2 = secondPoint.get(0);
        int y1 = firstPoint.get(1);
        int y2 = secondPoint.get(1);

        double x2minx1 = (double) x2 - x1;
        double y2miny1 = (double) y2 - y1;

        double x2minx1sq = Math.pow(x2minx1, 2);
        double y2miny1sq = Math.pow(y2miny1, 2);

        double a = x2minx1sq + y2miny1sq;

        double distance = Math.sqrt(a);

        String output = "The distance between " + x1 + ", " + x2 + " and " + y1 + ", " + y2 + " is: " + distance;

        System.out.println(output);
    }

    public static void mostCommonLetter(Scanner args) {
        System.out.println("Enter a word in order to find the most common letter:");
        String str = args.nextLine();

        HashMap<Character, Integer> mp = new HashMap<>();

        int n = str.length();

        char ans = 0;

        int cnt = 0;

        for(int i = 0; i < n; i++) {
            char c = str.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0) + 1);

            if(cnt < mp.get(c)) {
                ans = c;
                cnt = mp.get(c);
            }
        }

        System.out.println("The most common letter in " + str + " is: " + ans);
    }

    public static void sumOfFirstNNaturalNumbers(Scanner args) {
        System.out.println("Provide n: ");
        int n = args.nextInt();

        int result = (n * (n + 1)) / 2;

        System.out.println("The sum of the first " + n + " natural numbers is: " + result);
    }

    public static void sumOfNumbersDigitsUntilOne(Scanner args) {
        System.out.println("Provide a number:");
        String number = args.nextLine();
        int result = 0;

        ArrayList <Integer> digits = new ArrayList<Integer>();

        for (int i = 0; i < number.length(); i++) {
            char a = number.charAt(i);
            String x = String.valueOf(a);
            int b = Integer.parseInt(x);
            digits.add(b);
        }

        while (digits.size() > 1) {
            for (int i = (digits.size() - 1); i > 0; i--) {
                result = result + digits.get(i);
                digits.remove(i);
            }
        }

        int leftOut = digits.get(0);

        System.out.println("The result is: " + result + " and what's left out is: " + leftOut);
    }

    public static void sumOfSquaresForNNumbers(Scanner args) {
        System.out.println("Provide n: ");
        int n = args.nextInt();

        int result = (n * (n+1)*(2 * n + 1)) / 6;

        System.out.println("The sum of the squares of the first " + n + " natural numbers is: " + result);
    }

    public static boolean keplarNumbers(int n) {
        // Kaprekar numbers are numbers where the square of the number can be split into two parts that add up to the original number.
        // For example, 9 is a Kaprekar number because 9^2 = 81 and 8 + 1 = 9.
        if (n == 1) {
            return true;
        }

        int sq_n = n * n;
        int digits = 0;

        while (sq_n != 0) {
            digits++;
            sq_n /= 10;
        }

        sq_n = n * n;

        for (int i = 1; i < digits; i++) {
            int eq_parts = (int) Math.pow(10, i);

            if (eq_parts == n) {
                continue;
            }

            int sum = sq_n / eq_parts + sq_n % eq_parts;

            if (sum == n) {
                return true;
            }
        }
        return false;
    }

    public static boolean harshhadNumbers(int n) {
        //Harshad numbers are numbers that are divisible by the sum of their digits.
        //For example, 18 is a Harshad number because 1 + 8 = 9 and 18 is divisible by 9.

        ArrayList <Integer> numArr = new ArrayList<>();
        String converted = String.valueOf(n);
        int total = 0;

        for (int i = 0; i < converted.length(); i++) {
            int x = Integer.parseInt(String.valueOf(converted.charAt(i)));
            numArr.add(x);
        }

        for (int x : numArr) {
            total = total + x;
        }

        if (total % n == 0) {
            return true;
        }

        return false;
    }
}
